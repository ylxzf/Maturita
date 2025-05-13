---
tags:
  - APV
---
## #Databáze
- $ Určitá uspořádaná množina informací (dat) uložená na paměťovém médiu
- ! Odborně se nazývá systém řízení báze dat (SŘBD)
- $ Databázová aplikace
	- @ Program, který umožňuje vybírat, prohlížet a aktualizovat informace uložené prostřednictvím SŘBD

--- 

## E/R model
- E/R - Entity Relationship model
### Pojmy
- $ Entita
	- @ Objekt v reálném světě, o níž budeme v databázi uchovávat informace (zaměstnanec, oddělení, objednávka, …), jednoznačně identifikovatelný
- $ Relace
	- @ Představují odkazy mezi entitami
- $ Tabulky
	- @ Množina entit stejných vlastností (atributů)
	- Relační databázový systém = databáze tvořená množinou relací
	- Databáze je tvořena množinou tabulek
- $ Sloupce, atributy
	- @ V tabulkách popisuje určitou část dat, kterou má každý záznam
	- Sloupec představuje část tabulky
	- Atribut se vztahuje k reálné entitě
- $ Řádky, záznamy, n-tice
	- @ Každý řádek v tabulce představuje záznam o jedné entitě
- Domény
	- Popisují typ dat, obor hodnot = spojení datového typu a validačního pravidla
### Atributy
- $ Primární klíč - PRIMARY KEY
	- @ Každá entita ho má a je jeho unikátní identifikátor
	- ! Může to být jeden nebo více sloupců
	- ! A hodnoty nesmí být NULL
- $ Cizí klíč - FOREIGN KEY
	- @ Používá se k propojení tabulek
	- @ Je to primární klíč v cizí tabulce
	- Můžou být NULL
- $ Unikátní klíč - UNIQUE KEY
	- Záznam musí být unikátní a nesmí se opakovat v sloupci tabulky
- $ NULL / NOT NULL
	- @ Určuje jestli data musí nebo nemusí mít nějakou hodnotu

### Vlastnosti tabulky
- $ Každá tabulka má jednoznačné jméno
- $ Každý sloupec v tabulce má jednoznačné jméno
- $ Všechny hodnoty sloupce musí být stejného datového typu
- Nezáleží na pořadí sloupců
- Nezáleží na pořadí řádků
- $ Tabulka nemůže mít duplicitní hodnoty
- $ Všechny hodnoty jsou atomické (nedělitelné)
- ! Každá tabulka má primární klíč

### Kardinality vztahu
- Vyjadřuje, kolik entit jednoho typu může být ve vztahu s kolika entitami z druhého typu entit
- $ 1 : 1
	- @ Každá entita v A je ve vztahu s nejvýše jednou entitou v B a opačně
- $ 1 : N
	- @ Každá entita v A může být ve vztahu s více entitami v B, ale každá entita v B je ve vztahu s nejvýše jednou entitou v A
- $ N : M
	- @ Každá entita v A může být ve vztahu s více entitami v B a každá entita v B může být ve vztahu s více entitami v A
	- ! Propojovací tabulka - 2x 1 : N kardinality
- ISA hierarchie

### Integrita dat
- ! V databázové relaci nesmí být hodnota primárního klíče NULL!

### Referenční integrita
- $ Nástroj, který pomáhá udržovat vztahy mezi záznamy v relačně propojených tabulkách

--- 

## Architektura systémů
- Systémy centralizované
	- ![[Pasted image 20250513064205.png]]
- Systémy PC (file – server)
	- ![[Pasted image 20250513064218.png]]
- Systémy klient – server (C/S)
	- ![[Pasted image 20250513064229.png]]
- Systémy distribuované
	- Funkční
		- Vertikální členění
		- ![[Pasted image 20250513064328.png]]
	- Objektové
		- Horizontální
		- ![[Pasted image 20250513064336.png]]

--- 

## Relační algebra
- Teoretický základ dotazů v relačních databázích

### Množinové operace
- $ Sjednocení - FULL JOIN
	- @ Získat všechno
- $ Průnik - INNER JOIN
	- @ Společné hodnoty
- $ Rozdíl
	- @ Všechny hodnoty, které nejsou společné
		- ! Ale jen z tabulky A
- $ Kartézský součin
	- @ Kombinace všeho ze vším z druhé tabulky

### Projekce
- $ Z původní množiny záznamů vrátí pouze vybrané atributy
- ! Bez WHERE

### Selekce
- $ Omezení množiny záznamů
- ! S WHERE

### Spojení - JOIN
- $ Nejběžnější případ relačních operací
- $ Propojuje množiny záznamů na základě porovnání polí
- Spojování tabulek může být: 
	- $ Křížové - CROSS JOIN
		- @ Kartézský součin
	- $ Vnitřní - INNER JOIN
		- Nejčastější
		- @ Společné hodnoty
	- $ Přirozené - NATURAL JOIN
		- INNER JOIN, ale podmínka pro spojení se vygeneruje automaticky
	- $ Vnější - OUTER JOIN
		- @ Pokud není nalezeno spojení z A do B tak se doplní NULL za množinu B
		- $ Úplně vnější - FULL OUTER JOIN
			- OUTER JOIN ale doplňuje NULL za A i B
		- $ Částečně vnější - LEFT JOIN / RIGHT JOIN
			- OUTER JOIN

---

## Relační kalkul
- ! Říká co se má zjistit z databáze, ne jak se to má zjistit
- $ Používá formální neprocedurální znaky
### Atomické formule
- ˄ / & - AND
- ˅ - OR
-  ~ / ¬ - NOT
- ⇒ - Implikace
- ⇔ - Ekvivalence
### Predikáty
- >
- <
- >=
- <=
- <>
- =

### Kvantifikátory
- existenční ∃ - Existuje
- univerzální ∀ - Pro všechna

--- 
## Normalizace
- Pomocí těchto pravidel můžete zjistit, zda jsou tabulky správně strukturovány
### První normalizační formulář
- V každém průsečíku řádku a sloupce je právě jen jedna hodnota a ne seznam hodnot
### Druhý normalizační formulář
- Každý sloupec je závislý na celém primárním klíči a ne jenom na jeho části(když je víc jak jeden sloupec primární klíč)
- Platí jen pro sloupce, které nejsou část primárního klíče
### Třetí normalizační formulář
- Sloupce které nejsou primární klíč musí být na sobě nezávislé

---

## Používaný SW
- Microsoft Access
- LibreOffice Base
- phpMyAdmin