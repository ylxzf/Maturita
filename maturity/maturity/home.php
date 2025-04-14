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
    <link rel="stylesheet" href="style.css">
    <title>Půjčovna knih</title>
</head>
<body>
    <header>
    <h1>Půjčovna knih</h1>
    </header>
    <?php
    if(isset($_POST["btnLogin"])) {
        $username = htmlspecialchars($_POST["username"]);
        $password = htmlspecialchars(md5($_POST["password"]));

        logIn($username, $password, $db);
    }

    if(isset($_POST["btnLogout"])) {
        logOut();
    }

    if(!isLoggedIn()) {
        echo '<div class="login">
        <form action="" method="POST">
            <div>
                <label for="username">Username</label>
                <input type="text" name="username" required>
            </div>
            <div>
                <label for="password">Password</label>
                <input type="password" name="password" required>
            </div>
            <button type="submit" name="btnLogin" class="btn">Login</button>
        </form>
    </div>';
    } else {

        try {
            $userID = $_SESSION[session_id()];
            $query = $db->prepare("SELECT uziv_login FROM uziv WHERE uziv_id = :userID");
            $query->execute(array("userID" => $userID));
        } catch (PDOException $e) {
            die("Chyba dotazu get username: " . $e->getMessage());
        }

        $username = $query->fetchColumn();

        echo '<div class="login">';
        echo "<p>Vítej $username</p>";
        echo'<form action="" method="POST">
            <button type="submit" name="btnLogout" class="btn">Logout</button>
        </form>
        <a href="./vypujcky.php">Moje knihy</a>
    </div>';
    }
    ?>
    
    <table class="knihy-table">
        <tr>
            <th>Název</th>
            <th>Autor</th>
            <th>Žánr</th>
            <th>Počet</th>
            <th>Status</th>
        </tr>
        <?php
        require_once("./connectDBPujcovna.php");
        try {
            $query = $db->prepare("SELECT * FROM puj_knihy");
            $query->execute();
        } catch (PDOException $e) {
            die("Chyba dotazu puj_knihy: " . $e->getMessage());
        }

        $knihy = $query->fetchAll();

        if (isLoggedIn()) {
            $userID = $_SESSION[session_id()];

            try {
                $query = $db->prepare("SELECT * FROM puj_vypujcky pv WHERE puj_vyp_idUzivatel = :userID");
                $query->execute(array("userID" => $userID));
            } catch (PDOException $e) {
                die("Chyba dotazu join vypujcky: " . $e->getMessage());
            }

            $data = $query->fetchAll(PDO::FETCH_ASSOC);

            $pujKnihy = array();

            foreach ($data as $pujKniha) {
                $pujKnihy[] = $pujKniha["puj_vyp_idKniha"];
            }
        }
       

        

        foreach($knihy as $kniha) {
            $knihaID = $kniha["puj_knihy_id"]; 
            $nazev = $kniha["puj_knihy_nazev"];
            $autor = $kniha["puj_knihy_autor"];
            $zanr = $kniha["puj_knihy_zanr"];
            $pocet = $kniha["puj_knihy_pocet"];

            if (!isLoggedIn()) {
                $status = "Musíte se přihlásit";
            } else {
                if (in_array($knihaID, $pujKnihy)) {
                    $status = "<a href=./return.php?knihaID=" . $knihaID .">Vrátit</a>";
                } else {
                    $status = "<a href=./get.php?knihaID=" . $knihaID .">Půjčit</a>";;
                }
                if($pocet == 0 && !in_array($knihaID, $pujKnihy)) {
                    $status = "Není k dispozici";
                }
            }
            
            echo "<tr>
                    <td>$nazev</td>
                    <td>$autor</td>
                    <td>$zanr</td>
                    <td>$pocet</td>
                    <td>$status</td>
                </tr>";
        }
        ?>
    </table>
</body>
</html>