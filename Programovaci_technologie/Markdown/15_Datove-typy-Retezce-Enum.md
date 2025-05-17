---
tags:
  - PRM
---
## Datové typy
- $ Celočíselné
	- @ Jsou přesné
	- Jsou vždy se znaménkem
	- ! Maximální rozsah se vždy půlí (mezi záporná a kladná čísla)
	- Typy:
		- `byte`
			- @ Velikost: 8 bitů
			- Rozsah: -128 až 127
		- `short`
			- @ Velikost: 16 bitů
			- Rozsah: -32768 až 32767
		- @ `int`
			- @ Velikost: 32 bitů
			- Rozsah: -2147483648 až 2147483647
		- @ `long`
			- @ Velikost: 64 bitů
			- Rozsah: -9223372036854775808 až 9223372036854775807
- $ Desetinné (reálné)
	- ! Jsou nepřesné
	- Jsou vždy se znaménkem
	- Typy:
		- $ `float`
			- @ Velikost: 32 bitů
			- Rozsah: 1.4E-45 až 3.4028235E38
		- $ `dobule`
			- @ Velikost: 64 bitů
			- Rozsah: 4.9E-324 až 1.7976931348623157E308
- Znakové
	- $ Slouží k zápisů jednotlivých znaků
	- Java používá znakovou sadu UNICODE
	- Typy:
		- $ `char`
			- @ Velikost: 16 bitů
			- Zapisuje se do `''`
- Logické
	- Slouží k zápisu logických hodnot
	- Typy:
		- `boolean`
			- @ Velikost: 8 bitů
			- ! Používá dvě konstanty: false / true
- Prázdný datový typ
	- Nelze použít pro vytvoření proměnné, slouží pouze jako návratový datový typ metod, které nemají vracet hodnotu
	- Typy:
		- `void`

### Wrapper
- Obalová třída
- Definuje:
	- Konstanty pro daný typ (minimální a maximální hodnota)
	- Metody pro daný typ (např. konverze na String a zpět)
- Třídy:
	- `Byte`
	- `Short`
	- `Integer`
	- `Long`
	- `Float`
	- `Double`
	- `Character`
	- `Boolean`

---

## Řetězce - String
- $ Instance třídy String je **imutabilní** (neměnná)
	- @ Když se něco mění ve Stringu, musí ses vytvořit nová instance
- Metody:
	- $ `charAt(index)`
		- Vytáhne znak z řetězce na pozici index
	- `compareTo(String)`
		- Porovná lexikograficky dva řetězce
	- `concat(String)`
		- Připojí zadaný řetězec k aktuálnímu
	- $ `contains(charSeq)`
		- Zjistí, zda řetězec obsahuje nějaký znak / znaky
	- $ `equals(String)`
		- @ Porovná podle obsahu na shodu dva řetězce
		- ! Nepoužívá se ==
	- $ `length()`
		- @ Vrátí délku řetězce
	- `replace(charSeq, charSeq)`
	- `substring(begin, end)`
	- ...

### StringBuffer / StringBuilder
- Doporučována použít tam, kde se obsah řetězců často mění
- Je mutabilní (měnný)
- Metody:
	- $ `append(dataType)`
		- @ Připojí k řetězci další hodnotu
	- $ `charAt(index)`
		- @ Vrátí znak z pozice index. Indexujeme od 0
	- `delete(start, stop)`
		- Vymaže podřetězec z řetězce
	- `insert(offset, dataType)`
		- Vloží hodnotu od pozice offset do řetězce
	- $ `length()`
		- @ Vrátí délku řetězce
		- ! Pouze použité znaky
	- `substring(begin, end)`
		- Vrátí podřetězec z řetezce

---

## Výčtový typy - Enum
- $ Umožňuje vytvářet vlastní datové typy
- $ Deklarace výčtového typu se podobá deklaraci třídy, ale v hlavičce použijeme místo class klíčové slovo `enum`
	- @ Dále v rámci těla musíme nejprve vyjmenovat všechny možné hodnoty (instance), kterých může enum nabývat
- Každá instance, může také ještě nést nějaká další data
- Metody:
	- `values()`
		- Vrátí pole všech možných hodnot daného enumu
	- `odinal()`
		- Vrátí pořadí hodnoty, v jakém je definována v enumu