---
tags:
  - PRM
---
## Algoritmus
- $ Přesný návod či postup, kterým lze vyřešit daný typ úlohy
- V programování by měl algoritmus splňovat určité požadavky:
	- $ Jednoznačnost (Determinovanost)
		- Každý krok algoritmu musí být jednoznačně a přesně definován
		- V každé situaci musí být naprosto zřejmé, co a jak se má provést a jak má provádění algoritmu pokračovat
	- $ Opakovatelnost
		- Toto souvisí s předchozí podmínkou
		- Každý algoritmus se musí pro stejná vstupní data a vstupní podmínky chovat stejně a dávat stejné výsledky
	- $ Obecnost (Univerzálnost)
		- Postup by měl být použitelný na celou škálu podobných problémů a ne jen na jeden konkrétní
	- $ Konečnost (Finitnost)
		- Každý algoritmus musí skončit v konečném počtu kroků
		- Tento počet kroků může být libovolně velký (podle rozsahu a hodnot vstupních údajů), ale pro každý jednotlivý vstup musí být konečný
		    - Pozor na "nekonečné" výpočty (Třeba vyčíslení Rudolfova čísla  π, nebo Eulerova čísla e )
- Způsoby zapsání:
	- @ Vývojovým diagramem
	- @ Programem

### Metody návrhu algoritmů
- $ Shora dolů (Top -> Down)
    - @ Začínáme hlavním problémem a ten rozkládáme na menší pod-úlohy a ty dále rozkládáme na menší a menší pod-úlohy až dospějeme k základním (elementárním) krokům
- $ Zdola nahoru (Bottom -> Top)
	- @ Začínáme elementárními kroky a ty skládáme k sobě a vytváříme funkce schopné řešit komplexnější úlohy a ty opět skládáme dohromady a vytváříme z nich systém řešící zadaný hlavní problém

### Programovací paradigmata
- $ Rozděl a panuj (Divide and Conquer)
	- @ Problém je rozdělen na menší podproblémy, které se řeší samostatně, a výsledky těchto podproblémů se kombinují do finálního řešení
	- Příklad:
		- QuickSort, MergeSort
- $ Hladový algoritmus (Greedy Algorithm)
	- @ V každém kroku se vybírá nejlepší možná volba bez ohledu na celkový kontext, s cílem dosáhnout optimálního řešení.
	- Příklad:
		- Problém obchodního cestujícího (TSP), Dijkstrův algoritmus
- $ Dynamické programování (Dynamic Programming)
	- @ Rozděluje problém na menší podproblémy, jejichž výsledky se ukládají, aby se předešlo jejich opětovnému výpočtu
	- Používá se pro optimalizační problémy
	- Příklad:
		- Fibonacciho posloupnost
- $ Použití hrubé síly (Brute Force)
	- Prozkoumává všechny možné možnosti a hledá řešení tím, že vyzkouší všechny kombinace
	- Příklad:
		- Problém obchodního cestujícího
- $ Hledání s návratem
	- Algoritmus zkouší různé možnosti a vrací se zpět, pokud zjistí, že daná možnost nevede k řešení
	- Příklad:
		- Problém N-královen, Sudoku, Labyrint


---

## SW Inženýrství
- $ Systematický, disciplinovaný a kvalifikovaný přístup k vývoji, tvorbě a údržbě SW
### Model vodopádu
- $ Zákazník ve většině případů neví co ze začátku chce, takže tento model není optimální
- Model:
	- Požadavky
	- Návrh
	- Analýza
	- Programování
	- Testování
	- Předání
	- Údržba
### Agilní přístup
- $ Předpokládají se možné změny
- $ Soustředí se na komunikaci se zákazníkem a upřesňování požadavků
### Customizace
- $ Přizpůsobení softwaru konkrétním potřebám uživatele nebo organizace
### Vytvářecí
- $ Singleton
	- @ Běží jenom jedna instance daného programu
- $ Multiton
	- @ Může běžet více instancí na jednou

## Cena - Čas - Kvalita
- $ Vždy je něčeho více


---

## Testování
- Proces ověřování, zda software funguje správně podle specifikace a neobsahuje chyby
- Typy testování
	- $ Jednotkové
		- Testují malé části kódu, např. metody nebo třídy
		- V Javě např. framework JUnit
	- Integrační
		- Testují spolupráci mezi moduly
	- Systémové
		- testují celý systém jako celek
	- Akceptační
		- Testuje zákazník, ověřuje, zda je aplikace použitelná
