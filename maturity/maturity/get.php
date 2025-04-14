<?php
    ob_start();
    session_start();
    include("./functions.php");
    require("./connectDBPujcovna.php");

    if(isLoggedIn()) {
        $knihaID = $_GET["knihaID"];
        $userID = $_SESSION[session_id()];

        try {
            $query = $db->prepare("INSERT IGNORE INTO puj_vypujcky (puj_vyp_idUzivatel, puj_vyp_idKniha) VALUES (:userID, :knihaID)");
            $query->execute(array("userID" => $userID, "knihaID" => $knihaID));
        } catch (PDOException $e) {
            die("Chyba dotazu insert vypujcky: " . $e->getMessage());
        }

        try {
            $query = $db->prepare("SELECT puj_knihy_pocet FROM puj_knihy WHERE puj_knihy_id = :knihaID");
            $query->execute(array("knihaID" => $knihaID));
        } catch (PDOException $e) {
            die("Chyba dotazu select pocet: " . $e->getMessage());
        }

        $pocet = $query->fetchColumn();

        try {
            $query = $db->prepare("UPDATE puj_knihy SET puj_knihy_pocet = :pocet WHERE puj_knihy_id = :knihaID");
            $query->execute(array("pocet" => $pocet - 1, "knihaID" => $knihaID));
        } catch (PDOException $e) {
            die("Chyba dotazu update vypujcky: " . $e->getMessage());
        }
    }

    header("Location:./home.php");

    ob_end_flush();
?>