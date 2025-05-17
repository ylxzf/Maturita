---
tags:
  - PRM
---
## Pojmy
### Vrchol (Uzel)
- $ Bod , z vrcholu mohou vést hrany
### Hrana
- $ Značí propojení vrcholů
### Sled
- $ Posloupnost uzlů a hran
### Tah
- $ Sled, kde se neopakují uzly
### Cesta
- $ Posloupnost orientovaných hran, při které vždy následující hrana začíná v uzlu, v němž skončila předchozí hrana
### Kruh
- $ Uzavřená cesta
### Cyklus
- $ Uzavřená orientovaná cesta
### Souvislý graf
- $ Graf, u kterého pro kteroukoliv dvojici uzlů existuje alespoň jedna cesta

---

## Typy hran
### Neorientovaná hrana 
- $ Neuspořádaná dvojice, bez vyznačení směru průchodu, hranou lze procházet oběma směry
### Orientovaná hrana 
- $ Uspořádaná dvojice vrcholů, má vyznačený směr průchodu, hranou lze procházet pouze ve vyznačeném směru
### Násobné hrany
- $ Více hran spojující stejné vrcholy
### Most
- $ Hrana, jejímž odebráním se zvýší počet komponentů v grafu
### Smyčka
- $ Hrana vedoucí z vrcholu do něj samotného
### Rovnoběžné hrany
### Násobné hrany se smyčkou

![[Pasted image 20250517141741.png]]

---

## Typy grafů
### Neorientovaný graf
- U hrany nezáleží na pořadí vrcholů
- $ Strom
	- @ Souvislý les
- $ Les
	- @ Jednoduchý graf bez kružnic
- Množina navzájem nepropojených stromů
### Orientovaný
- $ Hrany mají pevně danou orientaci
- Orientovaný strom
	- Má jeden hlavní vrchol (kořen), z něho mají hrany určený směr
- $ Potomek
	- @ Každý vrchol, do kterého vede z tohoto vrcholu orientovaná hrana
- $ List
	- @ Vrchol, který nemá potomky
- $ Větev 
	- @ Jednoznačně určená cesta od kořene k listu

![[Pasted image 20250517144226.png]]

---

## Průchody grafem
- $ Snaha o nalezení cesty z nějakého startovního uzlu do nějakého cílového uzlu, nebo do všech ostatních dosažitelných uzlů
### DFS
- $ DFS - Depth-first-search (Průchod do hloubky)
- Princip:
	- @ Algoritmus začne v libovolném startovacím uzlu a vydá se do jeho prvního souseda
	- @ Poté se opět vydá prvním sousedem toho souseda, atd. až projde všechny dosažitelné uzly
	- @ Algoritmus dříve či později dojde k případu, že bude mít na výběr více cest
	- @ Potom potřebujeme nějaké pravidlo, např. jako na animaci výše: Uzly bereme podle abecedy
	- ![[DFS.gif]]
- Algoritmus si uzly ukládá do zásobníku (nebo je realizován rekurzivně) a značí si je:
	- @ Fresh - Ještě nebyl objeven
	- @ Open - Právě objeven
	- @ Close - Už byl prozkoumán
- Postup:
	- 1. Nastav všechny uzly jako FRESH
	- 2. Vyber startovní uzel, a zavolej na něm funkci prohledat

	- 1. Funkce prohledat
	- 2. Nastav uzel který prohledáváš jako OPEN
	- 3. Na všech FRESH sousedech uzlu U rekurzivně zavolej funkci prohledat
	- 4. Prohledáváný uzel nastav jako CLOSED
### BFS
- $ BFS - Breadth-first-search (Průchod do šířky)
- Princip:
	- @ Algoritmus začne v libovolném startovacím uzlu a prohledá nejprve všechny sousedy startovacího uzlu
	- @ Poté všechny sousedy těch sousedů, atd. až projde všechny dosažitelné uzly
	- @ Algoritmus dříve či později bude dojde k případu, že bude mít na výběr více cest
	- @ Potom potřebujeme nějaké pravidlo, např. jako na animaci výše: Uzly bereme podle abecedy
	- ![[BFS.gif]]
- Algoritmus si uzly ukládá do zásobníku (nebo je realizován rekurzivně) a značí si je:
	- @ Fresh - Ještě nebyl objeven
	- @ Open - Právě objeven
	- @ Close - Už byl prozkoumán
- Postup:
	- 1. Nastav všechny uzly jako FRESH
	- 2. Vyber startovní uzel, nastav ho jako OPEN a přidej ho do fronty
	- 3. Dokud není fronta prázdná
	- 4. Vyber uzel U z fronty
	- 5. Všechny FRESH sousedy uzlu U nastav jako OPEN a přidej je do fronty
	- 6. Uzel U nastav jako CLOSED
	- 7. Vrať se zpět na bod 3.

---

## Reprezentace
### Matice incidence
- $ Je to matice, která má jeden řádek pro každou hranu grafu a jeden sloupec pro každý vrchol grafu
- $ Pokud vrchol náleží hraně, je na dané pozici 1 a pokud ne, tak 0
- ![[Pasted image 20250517154450.png]]
### Matice sousednosti
- $ Prvek matice na pozici $A[i][j]$ indikuje, jestli mezi vrcholy $i$ a $j$ existuje hrana
- $ Pro neorientované grafy je matice sousednosti symetrická $A[i][j] = a[j][i]$
- $ Slouží k analýze vlastností grafa jako je třeba délka nejkratší cesty
- Reprezentace hran:
    - Binární hodnoty: 1 nebo 0 indikují existenci nebo neexistenci hrany
    - Hodnoty s váhou: Číselné hodnoty (např. délka hrany)
- ![[Pasted image 20250517154439.png]]
### Seznam sousedů
- $ Typicky spojový seznam, jehož prvky jsou také spojové seznamy
- $ Každý vrchol má v seznamu vrcholy s nimiž sousedí.