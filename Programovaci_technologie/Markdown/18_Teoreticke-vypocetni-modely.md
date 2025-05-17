---
tags:
  - PRM
---
## Výpočetní složitosti
- $ Používá se k porovnání efektivity a rychlosti jednotlivých algoritmů
- Zapisuje se jako funkce - $O(...)$
	- ! Funkce bývá monotónně rostoucí nebo konstantní
- Typy:
	- @ Konstantní - $O(1)$
	- @ Logaritmická - $O(logn)$
	- @ Lineární - $O(n)$
	- @ Linearitimická (Lineárně-logaritmická) - $O(n \times logn)$
	- @ Kvadratická - $O(n^2)$
	- @ Faktoriálová - $O(n!)$
### Časová složitost - Time complexity
- $ Závislost času na velikosti vstupu $n$
- $ Udává, jak dlouho trvá algoritmu zpracovat vstup
- Cílem je často minimalizovat čas, který algoritmus potřebuje k dokončení
- Příklady:
	- @ Konstantní - $O(1)$
		- Přístup do pole na základě indexu
	- @ Logaritmická - $O(logn)$
		- Binární vyhledávání
	- @ Lineární - $O(n)$
		- Sekvenční (lineární vyhledávání) vyhledávání
	- @ Linearitimická (Lineárně-logaritmická) - $O(n \times logn)$
		- QuickSort (ideální stav)
	- @ Kvadratická - $O(n^2)$
		- Bubble, Select, nebo Insert sort
	- @ Faktoriálová - $O(n!)$
		- Generování všech permutací
### Paměťová složitost - Space complexity
- $ Závislost množství použité paměti na velikosti vstupu $n$
- $ Udává, kolik paměti (např. proměnné, pole, zásobníky) algoritmus potřebuje

---

## Konečné stavové automaty
- $ Matematický model počítače, který se používá při studiu vyčíslitelnosti algoritmů
- $ Představuje velmi jednoduchý počítač bez jakékoliv paměti
- ! Na stupnici výpočetních modelů je konečný automat ten nejslabší / nejjednodušší výpočetní model
- Použití:
	- Vyhodnocení regulárních výrazů
	- Vyhledávání v textu
	- Pro kontrolu správné syntaxe v překladači programovacích jazyků
### [Mealyho automat](https://www.youtube.com/watch?v=LioitkXDfmA)
- Definice
    - $ Mealyho automat je definován jako šestice ($Q$, $\Sigma$, $\Delta$, $\delta$, $\lambda$, $q_0$), kde:
        - $Q$ je konečná množina stavů
        - $\Sigma$ je konečná množina vstupních symbolů
        - $\Delta$ je konečná množina výstupních symbolů
        - $\delta$: $Q$ $\times$ $\Sigma$ $\rightarrow$ $Q$ je přechodová funkce
        - $\lambda$: $Q$ $\times$ $\Sigma$ $\rightarrow$ $\Delta$ je výstupní funkce
        - $q_0$ $\in$ $Q$ je počáteční stav
- Princip
	- $ Výstup závisí na aktuálním stavu a vstupním symbolu.
	- $ Výstupní symbol se generuje při každém přechodu do nového stavu.
### [Mooreův automat](https://www.youtube.com/watch?v=MFnRF07SoFo)
- Definice
    - $ Mooreův automat je definován jako šestice ($Q$, $\Sigma$, $\Delta$, $\delta$, $\lambda$, $q_0$), kde:
        - @ $Q$ je konečná množina stavů
        - $\Sigma$ je konečná množina vstupních symbolů
        - $\Delta$ je konečná množina výstupních symbolů
        - $\delta$: $Q$ $\times$ $\Sigma$ $\rightarrow$ $Q$ je přechodová funkce
        - ! $\lambda$: $Q$ $\rightarrow$ $\Delta$ je výstupní funkce
        - $q_0$ $\in$ $Q$ je počáteční stav
- Princip
    - $ Výstup závisí pouze na aktuálním stavu, nikoli na vstupním symbolu
        - ! Vstupní symbol jenom ovlivňuje přechod mezi stavy, ale ne přímo výstup
    - $ Výstupní symbol se generuje po přechodu do nového stavu


---

## Turingův stroj
- $ Matematický model počítače, který se používá při studiu vyčíslitelnosti algoritmů
- Church–Turingova teze
	- @ Každý možný výpočet lze úspěšně uskutečnit algoritmem běžícím na počítači, je-li k dispozici dostatek času a paměti
	- Jinak řečeno totéž:
		- ! Ke každému algoritmu existuje ekvivalentní Turingův stroj
		- @ 1 stroj -> 1 problém
### Univerzální Turingův stroj
- $ 1 stroj -> všechny řešitelné problémy