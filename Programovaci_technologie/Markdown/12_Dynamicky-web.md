---
tags:
  - PVA
---
## HTML formulář

### Způsoby posílání dat
- GET
	- $ Data jsou připojena k URL jako parametry
	- $ Data jsou viditelná v URL a kvůli tomu i v historii prohlížeče
	- Superglobální pole
	- Má omezenou délku
- POST
	- $ Data jsou odeslána jako součást těla HTTP požadavku
	- $ Data nejsou viditelná v URL ani v historii prohlížeče
	- $ Lepší a bezpečnější cesta pro zpracování formulářů
	- Superglobální pole
	- Nemá omezenou délku

### Ovládací prvky formuláře
- `<input />`
	- ![[7_HTML-CSS#Vstupní_prvky]]
- `<button></button>`
	- submit - odeslání formuláře
	- reset - vymazání dat z formuláře
- `<select></select>`
	- $ Klasickej combobox
	- `<option></option>`
		- Možnosti pro combobox
- `<textarea></textarea>`
	- Víceřádkový text

### Zpracování formuláře v PHP
- $ Pomocí metody `isset()` jde zjistit, jestli byl formulář odeslaný nebo ne
- $ Data pak můžeme získat ze superglobálního pole, které jsme použili (`$_GET`, `$_POST`)
	- @ Jestli nechceme řešit metodu, tak můžeme použít superglobální pole `$_REQUEST`

---

## Předávání dat mezi stránkami
- HTTP - Hyper Text Transfer Protocol
	- $ Základní komunikační protokol pro přenos dat mezi klientem a serverem
	- ! Bezestavový
		- @ mezi dvěma HTTP žádostmi neexistuje žádná paměť pro uchování stavu předchozích interakcí

### Link
- $ Data se předávají jako součást URL 
	- `soubor.php?promenna=hondota`
- Více parametrů oddělujeme pomocí & doporučeno použít `&amp;` pro HTML
- Data předaná v URL jsou dostupná v PHP prostřednictvím superglobálních polí `$_GET` nebo `$_REQUEST`

### Cookies
- $ Cookies jsou malé textové soubory, které se ukládají na straně klienta (v prohlížeči)
- $ Slouží k ukládání dočasných nebo trvalých dat (preference uživatele, přihlašovací údaje, stav relace, jazyk, nákupní košík)
- $ K vytvoření cookies v PHP používáme funkci `setcookie()`
	- `setcookie(nazev, hodnota, platnost, cesta, domena, zabezpeceni, httponly)`
- $ Cookies jsou uloženy v superglobálním poli `$_COOKIE`
- Pro úpravu cookie použijeme znovu funkci `setcookie()` se stejným názvem, ale s novými hodnotami, které chceme upravit
- ! Pro vymazání, použijeme `setcookie()` s platností v minulosti

### Sessions
- $ Na rozdíl od cookies se data neukládají na straně klienta, ale na serveru
- $ Každá session je identifikována vlastním ID
- Používají se primárně k uchování přihlášení uživatele
- $ K vytvoření session v PHP používáme funkci `session_start()`
- $ Superglobální pole `$_SESSION` se používá k ukládání a čtení dat
- Pro odstranění proměnné se používá `unset($_SESSION[”nazev”])`
- `session_destroy()` smaže celou session
- $ Jsou bezpečnější než cookies, protože data nejsou uložena na straně klienta

---

## Připojení k DB v PHP
### $DSN - Data Source Name
- $ Řetězec, který určuje k jaké databázi se připojíme
- `$dsn = “mysql:host:127.0.0.1;port=3306;dbname=eshop”;`
	- `mysql` - Určuje typ databáze
	- `host:127.0.0.1` - Určuje adresu serveru _**(v tomto případě localhost)**_
	- `port=3306` - Port na kterém databáze běží
	- `dbname=eshop` - Jméno databáze na serveru
### $username
- Jméno uživatele, který má k databázi přístup
- Defaultně root
### $password
- Heslo k uživatelskému jménu, které jsme použili
- Pro root defaultně prázdné

### PDO
- $ Rozhraní pro přístup k databázím v PHP
- Zamezuje SQL Injections
- Jednotné rozhraní pro různé databáze