<?php
$dsn = "mysql:host:127.0.0.1;port=3306;dbname=databaze";
$user = "root";
$pass = "";

try {
    $db = new PDO($dsn, $user, $pass, array(PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION, PDO::MYSQL_ATTR_INIT_COMMAND => "SET NAMES utf8"));
} catch (PDOException $e) {
    die("PDO Konstruktor: " . $e->getMessage());
}
