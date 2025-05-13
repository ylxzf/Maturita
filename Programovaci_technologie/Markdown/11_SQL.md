---
tags:
  - PVA
---
![[4_Teorie-DB#Databáze]]

![[4_Teorie-DB#E/R model]]

---

## SQL
- SQL - Structured Query Language

### Klíčové slova:
- SELECT
	- Výběr sloupců
	- DISTINCT
		- Nevypisuje duplicitní záznamy
- FROM
	- Z jaké tabulky získáváme data
	- JOIN
- WHERE
	- @ Slouží k filtraci dat
	- @ Uvede se podmínka, pokud je splněna, vyberou se data
- ORDER BY
	- @ Seřazení dat
	- Specifikace sloupce (podle, kterého se má řadit) a směr řazení ASC, DESC
- GROUP BY
	- @ Seskupení dat
	- Nejběžnější použití je získání počtu záznamů odpovídající každé jednotlivé hodnotě jiného sloupce, časté je také získání součtu, aritmetického průměru či jiných statistických hodnot z vybíraných záznamů
	- HAVING
		- Podmínka pro GROUP BY

### Agregační funkce
- COUNT - počet
- SUM - součet
- MIN - minimum
- MAX - maximum
- AVG - průměr

---

## DDL
- DDL - Data Definition Language
- $ Příkazy DDL slouží pro definici dat
- Umožňují
	- @ Přidávat
	- @ Upravovat
	- @ Mazat logické struktury, které obsahují data (databáze, tabulky, indexy, pohledy,….)

### CREATE
- $ Slouží pro vytvoření databázových objektů
- Všechny jeho možnosti syntaxe se mohou lišit podle typu databáze
### ALTER
- $ Slouží ke změně databázových objektů
	- Přidání sloupce
	- Změna nastavení sloupce
	- Odstranění sloupce
### DROP
- $ Slouží k odstranění databázových objektů

### Datový typy
- INT
- FLOAT
- DOUBLE
- DECIMAL
- DATE
- YEAR()
- VARCHAR()
- ...

--- 

## DML
- DML - Data Manipulation Language
- Příkazy DML slouží pro přidání dat do databáze a pro jejich úpravy

### INSERT
- $ Přidá do tabulky nový záznam
### UPDATE
- $ Upravuje data (záznamy) v relační databázi
- $ Může být upraven jediný záznam, nebo i více záznamů najednou
- ! Upravené záznamy musí odpovídat definované podmínce
### DELETE
- $ Slouží k odstranění záznamů z tabulky
- ! WHERE je volitelný parametr, bez udání smaže všechny záznamy v tabulce, ale ne samotnou tabulku