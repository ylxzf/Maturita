---
tags:
  - APV
---
## Tabulkový kalkulátor
- $ Program sloužící k matematickým operacím s číselnými údaji
- $ Sešit
	- @ Soubor
- $ List
	- @ Maximálně 256 listů v sešitu
- $ Řádek
	- Označují se číslicemi (lze přenastavit na R1, R2…)
- $ Sloupec
	- Označují se písmenami (lze přenastavit na C1, C2…)
- $ Buňka
	- @ Průsečík sloupce a řádku

---

## Práce s tabulkovým procesorem
### Výběr buněk
- Jedna buňka
	- Kliknutí na konkrétní buňku
- Více buněk
	- Kliknutí a držením LMB
- Sloupec
	- Kliknutí na písmeno sloupce
- Řádek
	- Kliknutí na číslo řádku
- Celý list
	- Kliknutím na tlačítko v levém horním rohu (mezi A a 1)
	- Ctrl + A
- Více nesouvislých buněk
	- Podržením Ctrl a klikáním nebo držením LMB
### Formát buňky
- $ Obecný
	- Výchozí formát, žádné speciální úpravy
- $ Číslo
	- Umožňuje nastavit počet desetinných míst
- $ Měna
	- Přidá měnový symbol _(€,$, Kč)_ a zaokrouhluje
- Účetnický
	- Podobný měně, ale zarovnává symboly měny
- $ Datum a čas
	- Umožňuje různé formáty data (dd.mm.yyyy, mm/dd/yyyy, ...)
- $ Procenta
	- Vynásobí číslo 100 a přidá znak %
- Zlomky
	- Zobrazí číslo jako zlomek _(např. 1/2 místo 0,5)_
- Vědecký
	- Zobrazuje čísla v exponenciálním tvaru _(např. 1,23E+05)_
- $ Text
	- Uloží hodnotu jako text, i když obsahuje čísla
- $ #Vlastní_formát
	- Umožňuje vytvořit vlastní formát
### #Vlastní_formát
- Oddíly formátu:
    - 4 - kladná čísla; záporná čísla; nulové hodnoty; text
    - 2 - kladná čísla a nulové hodnoty; záporná čísla
    - 1 - všechna čísla
- Symbolika:
	- $ #
		- Pouze platné číslice
	- $ 0
		- Platné číslice a nuly
	- $ ?
		- Mezery místo nadbytečných nul
	- $ " "
		- Text v buňce
	- $ \
		- Zobrazení znaku
	- $ -
		- Mezera o šířce jednoho znaku
	- $ *
		- Opakování znaku
	- $ Mezera nebo ,
		- Násobek tisíců
		  
### Vzorce a jejich rozšiřování
- $ Zapisují se do buňky stejně jako klasický text
- $ Zápis musí začínat znakem 
- $ Výsledky se zobrazují klasicky v buňce a vzorce v poli vzorců
### Funkce
- Datum a čas
	- DATUM, DNES, DENTYDEN, …
- Logické
	- A, KDYŽ, NEBO, …
- Matematické
	- ZAOKROUHLIT, SUMA, …
- Text
	- ČÁST, HODNOTA.NA.TEXT, …
- Vyhledávání
	- VYHLEDAT, …
### Adresování
- $ Přepínání mezi adresováním při psaní vzorce → F4 (přidává a mění $)
- Typy
	- @ Relativní
		- C9
	- @ Absolutní
		- $C$9
	- @ Smíšené
		- $C9 / C$9

---
## Používaný SW
- Microsoft Excel
- Google Sheets
- Apple Numbers
- LibreOffice Calc