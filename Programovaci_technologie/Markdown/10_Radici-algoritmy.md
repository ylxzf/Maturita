---
tags:
  - PVA
---
## Řadící algoritmy
- $ Metoda, jak uspořádat seznam prvků podle určitého pořadí (např. vzestupně nebo sestupně)
- $ Cílem je zajistit, aby byly všechny prvky v seznamu seřazeny podle specifikovaného kritéria
### Časová složitost
- ! Závislost výpočetního času na velikosti vstupu N

### Bubble sort
- $ Je jednoduchý, ale neefektivní řadicí algoritmus vhodný pro malé nebo téměř seřazené seznamy
- Postup:
	- @ Prochází seznam a porovnává každý prvek s následujícím
	- @ Pokud jsou prvky v nesprávném pořadí (větší na začátku), vymění se
	- @ Tento proces se opakuje pro každý prvek, dokud není seznam seřazený
	- @ Při každém průchodu seznamem se počet porovnání zkracuje, protože poslední prvky jsou už na správném místě
- Časová složitost - $O(N^2)$
- Výhody
	- Implementace je jednoduchá a snadno pochopitelná
	- Je stabilní (u prvků se stejnou hodnotou nezmění jejich pořadí)
- Nevýhody
	- Pomalý a nízká efektivita $O(N^2)$
	- Vysoký počet porovnání a výměn
	- Neefektivní pro velké seznamy

### Select sort
- $ Jednoduchý řadící algoritmus vhodný pro malé seznamy
- ! Vždy $O(N)$ výměn
- Postup:
	- @ Prochází seznam a hledá nejmenší (nebo největší) prvek
	- @ Tento prvek vymění s prvním prvkem v seznamu
	- @ Poté pokračuje se zbytkem seznamu a hledá nejmenší prvek ve zbylém neseřazeném úseku
	- @ Tento postup se opakuje, dokud není seznam celý seřazen
- Časová složitost - $O(N^2)$
- Výhody
	- Implementace je jednoduchá a snadno pochopitelná
- Nevýhody
	- Pomalý a nízká efektivita $O(N^2)$
	- Neefektivní pro velké seznamy
	- ! Není stabilní, protože při výměně prvků může změnit relativní pořadí prvků se stejnou hodnotou

### Insert sort
- $ Je jednoduchý, ale neefektivní řadicí algoritmus vhodný pro malé nebo téměř seřazené seznamy
- $O(N^2)$ výměn v nejhorším případě
- Postup:
	- @ Začneme od druhého prvku seznamu
	- @ Porovnáme ho s předchozím prvkem a vložíme na správné místo
	- Tento proces opakujeme pro všechny prvky v seznamu
- Časová složitost - $O(N^2)$
- Výhody
	- Implementace je jednoduchá a snadno pochopitelná
	- Je stabilní (u prvků se stejnou hodnotou nezmění jejich pořadí)
- Nevýhody
	- Nízká efektivita
	- Nevhodný pro velmi velké seznamy

### Quick sort
- $ Efektivní, ale složitější řadicí algoritmus, který používá princip **rozděl a panuj**
- $ Rozděluje seznam na menší části podle pivotu a rekurzivně je třídí
- $ Je rychlý pro velké seznamy
- $O(N^2)$ výměn v nejhorším případě
- Postup:
	- @ Vybere se pivot (první, poslední, střední nebo náhodný prvek)
	- @ Seznam se rozdělí na dvě části
	    - @ Menší než pivot a větší než pivot
	- @ Tento postup se rekurzivně aplikuje na obě části
	- @ Tento proces se opakuje, dokud nejsou všechny části seřazeny
- Časová složitost - $O(N^2)$
- Výhody
	- $ Rychlý (průměrná časová složitost $O(n \times log n)$
	- Efektivní pro velké množství dat
- Nevýhody
	- Nejhorší časová složitost $O(n^2)$ při špatném výběru pivotu
	- ! Není stabilní (prvky se stejnými hodnotami mohou změnit pořadí)