<?php
function isLoggedIn() {
    if (isset($_SESSION[session_id()])) {
        return true;
    }
    return false;
}

function logIn($username, $password, $db) {
    try {
        $query = $db->prepare("SELECT COUNT(*) AS pocet, uziv_id FROM uziv WHERE uziv_login LIKE :username AND uziv_heslo LIKE :password");
        $query->execute(array("username" => $username, "password" => $password));
    } catch (PDOException $e) {
        die("Chyba dotazu uziv: " . $e->getMessage());
    }

    $data = $query->fetchAll(PDO::FETCH_ASSOC);

    $authenticated = $data[0]["pocet"] == 1 ? true : false;

    if($authenticated) {
        session_regenerate_id();
        $userID = $data[0]["uziv_id"];

        $_SESSION[session_id()] = $userID;
    }
}

function logOut() {
    if (isLoggedIn()) {
        unset($_SESSION[session_id()]);
    }
}
?>