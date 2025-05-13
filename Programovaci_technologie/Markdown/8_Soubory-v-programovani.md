---
tags:
  - PVA
---
## Soubor
- $ Základní jednotka pro ukládání dat
- $ Soubor je posloupnost znaků či bajtů
- $ Každý soubor má název a příponu
### Textové
- $ Obsahuje číselné textové znaky
- $ Lze snadno interpretovat jako text
- Ukládá pomocí kódování (ASCII, UTF-8, ...)
### Binární
- $ Ukládá jedničky a nuly
- $ Obrázky, videa, spustitelné soubory

---

## Práce se soubory v jazyce JAVA
- $ Knihovna java.io

### File
- $ File
	- Deklarace a inicializace:
		```java
		File file = new File(path);
		```
	- Metody:
		- `exists()`
		    - Zkontroluje, zda soubor nebo adresář existuje
		- `createFile()`
		    - Vytvoří soubor
		- `mkdir()`
		    - Vytvoří adresář
		- `delete()`
		    - Smaže soubor nebo adresář
		- `renameTo(File dest)`
		    - Přejmenuje soubor nebo přesune na nové místo
		- `isFile()`
		    - Zkontroluje, zda jde o soubor
		- `isDirectory()`
		    - Zkontroluje, zda jde o adresář
		- `getName()`
		    - Vrátí název souboru nebo adresáře
		- `getPath()` \ `getAbsolutePath()`
		    - Vrátí cestu k souboru
		- `length()`
		    - Vrátí velikost souboru v bajtech
		- `list()`
		    - Vrátí seznam souborů a adresářů v daném adresáři
		- `copy(Path source, Path target, CopyOption... options)`
		    - Zkopíruje soubor.
		- `move(Path source, Path target, CopyOption... options)`
		    - Přesune soubor.
### Reader
- $ FileReader
	- Deklarace a inicializace:
		```java
		FileReader fileReader = new FileReader(file);
		```
	- Metody:
		- `read()`
		    - Přečte jeden znak
		- `read(char[] cbuf)`
		    - Přečte znaky do pole
		- `close()`
		    - Uzavře stream
- $ BufferedReader
	- Deklarace a inicializace:
		```java
		BufferedReader bufferedrReader = new BufferedReader(new FileReader(file));
		```
	- Metody:
		- `read()`
		    - Přečte jeden znak ze souboru
		- `readLine()`
		    - Přečte jeden řádek ze souboru
		- `close()`
		    - Uzavře čtecí stream
		- `mark(int readAheadLimit)`
		    - Označí místo ve streamu pro pozdější vrácení
		- `reset()`
		    - Vrátí čtení na místo označené metodou `mark()`
### Writer
- $ FileWriter
	- Deklarace a inicializace:
		```java
		FileWriter fileWriter = new FileWriter(file)
		```
	- Metody:
		- `write(int c)`
		    - Zapíše jeden znak do souboru
		- `write(char[] cbuf)`
		    - Zapíše pole znaků do souboru
		- `write(String str)`
		    - Zapíše řetězec do souboru
		- `append(CharSequence csq)`
		    - Přidá řetězec na konec souboru
		- `close()`
		    - Uzavře soubor po dokončení zápisu
- $ BufferedWriter
	- Deklarace a inicializace:
		```java
		BufferedWriter writer = new BufferedWriter(new FileWriter(file))
		```
	- Metody:
		- `write(String str)`
			- Zapsat celý řetězec  
		- `write(char[] cbuf)`
			- Zapsat celé pole znaků  
		- `write(char[] cbuf, int off, int len)`
			- Zapsat část pole znaků  
		- `write(int c)`
			- Zapsat jeden znak (např. `'A'` jako int)  
		- `newLine()`
			- Přidat nový řádek (platformově nezávislý)  
		- `flush()`
			- Vyprázdnit buffer (vynucený zápis na disk)  
		- `close()`
			- Zavřít writer a uvolnit prostředky
