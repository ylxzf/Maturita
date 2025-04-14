<?php
ob_start();
session_start();

include("./functions.php");
require("./connectDBPujcovna.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Moje knihy</title>
</head>
<body>

<?php
if (isLoggedIn()) {

    echo "<table>
    <tr>
    <th>Název knihy</th>
    </tr>";

    $userID = $_SESSION[session_id()];

    try {
        $query = $db->prepare("SELECT * FROM puj_knihy pk JOIN puj_vypujcky pv ON pk.puj_knihy_id = pv.puj_vyp_idKniha WHERE puj_vyp_idUzivatel = :userID");
        $query->execute(array("userID" => $userID));
    } catch (PDOException $e) {
        die("Chyba dotazu select vypujcky: " . $e->getMessage());
    }

    $data = $query->fetchAll(PDO::FETCH_ASSOC);

    foreach ($data as $kniha) {
        echo "<tr><td>". $kniha["puj_knihy_nazev"] . "</td></tr>";
    }
    echo "</table>";
} else {
    echo "<p>Nejsi přihlášen</p>";
}
?>
<a href="./home.php">Zpět domů</a>
</body>
</html>