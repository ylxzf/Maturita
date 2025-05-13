---
tags:
  - PVA
---
## Pole
- $ Datová struktura, která uchovává sekvenci prvků
- $ Ukládá množinu dat

### Statické x Dynamické
- Statické
	- $ Pevně daná velikost (velikost nelze změnit po vytvoření)
	- $ Přístup přes index (od 0)
	- $ Pole může obsahovat prvky pouze jednoho datového typu, jako jsou int, double, String, ...
	- Deklarace a inicializace: 
		``` java
		//deklarace
		int[] intArr = new int[5];
		
		//inicializace
		intArr = {1, 2, 3, 4, 5};
		```
	- Přístup k prvkům pole: 
		``` java
		intArr[0]
		```
	- Vlastnosti: 
	    - Velikost pole
	        - Atribut .length
	    - Vícerozměrné pole
	        ```java
	        int[][] twoDimensionalArr = new int[3][2];
			```
- Dynamické
	- $ Automatické rozšiřování
	    - @ Není nutné definovat pevnou velikost
	- $ ArrayList, Vector, LinkedList, aj.
	- Deklarace: 
		```java
		ArrayList<Integer> arrayList = new ArrayList<>();
		```
	- Vlastnosti: 
		- Metody: 
			- `add(element)`
				- Přidá prvek
			- `get(index)`
				- Vrátí prvek na daném indexu.
			- `set(index, element)`
				- Změní prvek na indexu.
			- `remove(index)`
				- Odstraní prvek na indexu.
			- `size()`
				- Vrací počet prvků.
### Homogenní x Heterogenní
- Homogenní
	- $ Prvky v poli mají stejný datový typ
	- Klasické pole
- Heterogenní
	- $ Prvky v poli můžou mít jakýkoliv datový typ
	- např. pole objektů (List)
### Asociované x Indexované
- Asociované
	- $ Klíč-hodnota
    - $ Každý klíč mapuje na jednu hodnotu
    - $ TreeMap, HashMap, Hashtable, LinkedHashMap, aj.
    - Deklarace:
		```java
	    HashMap<Integer, Character> map = new HashMap<>();
		```
	- Vlastnosti:
		- Metody:
			- `put(key, value)`
				- Vloží klíč a hodnotu.
			- `get(key)`
				- Vrátí hodnotu spojenou s klíčem
			- `containsKey(key)`
				- Zjistí, zda mapa obsahuje klíč
			- `remove(key)`
				- Odstraní dvojici klíč-hodnota
			- `size()`
				- Vrátí počet dvojic klíč-hodnota
- Indexované
	- $ Každý prvek je označen číslem - první je 0
	- Klasické pole

---

## Vyhledávání v poli
- $ Postupy pro nalezení prvků v datových strukturách.
### Časová složitost
- ! Závislost výpočetního času na velikosti vstupu N

### Vyhledávací algoritmy
#### Sekvenční vyhledávání
- $ Vhodný pro neuspořádané nebo malé seznamy
- Postup:
	- @ Algoritmus prochází seznam prvek po prvku
	- @ Porovnává aktuální prvek s hledaným
	- @ Pokud najde shodu, proces se neukončí a pokračuje až do konce seznamu
	- @ Pokud shodu nenajde, pokračuje k dalšímu prvku až do konce seznamu
- Časová složitost - $O(N)$
- Výhody
	- Jednoduchá implementace
	- Vhodný pro neuspořádané seznamy
- Nevýhody
	- Lineární časová složitost
	- Nemožnost optimalizace bez seřazení
	- Je nutno procházet celý seznam
#### Vyhledávání bez zarážky
- $ Vhodný pro neuspořádané nebo malé seznamy
- $ Rychlejší než sekvenční vyhledávání
- Postup:
	- @ Algoritmus prochází seznam prvek po prvku
	- @ Prochází prvky pole, dokud prvek najde nebo neprojde celý seznam
- Časová složitost - $O(N)$
- Výhody
	- Jednoduchá implementace
	- Vhodný pro neuspořádané seznamy
- Nevýhody
	- Lineární časová složitost
	- Nemožnost optimalizace bez seřazení
#### Vyhledávání se zarážkou
- $ Vhodný pro neuspořádané nebo malé seznamy
- $ Rychlejší než sekvenční vyhledávání
- $ Obsahuje zarážku na konci seznamu
- Postup:
	- @ Algoritmus prochází seznam prvek po prvku
	- @ Prochází prvky pole, dokud prvek najde nebo neprojde celý seznam
	- @ Na konec seznamu se přidává zarážka
	    - ! Zarážka je stejný prvek který se hledá
	- @ Prvek vždy najde na poslední pozici pole, takže nikdy neskončí chybou
- Časová složitost - $O(N)$
- Výhody
	- Jednoduchá implementace
	- Vhodný pro neuspořádané seznamy
	- Eliminuje nutnost kontroly hranic pole při hledání prvku
- Nevýhody
	- Lineární časová složitost
	- Nemožnost optimalizace bez seřazení
#### Binární vyhledávání
- $ Metoda hledání prvku v seřazeném seznamu
- Postup:
	- @ Seznam musí být seřazený
	- @ Určí se počáteční a koncový index seznamu
	- @ Spočítá se střední prvek seznamu (střední index)
	- @ Porovná se hodnota, kterou hledáme, se středním prvkem
	    - @ Pokud se hodnota rovná střednímu prvku, našli jsme hledaný prvek
	    - @ Pokud je hledaná hodnota menší než střední prvek, pokračujeme v levé polovině seznamu
	    - @ Pokud je hledaná hodnota větší, pokračujeme v pravé polovině seznamu
	- @ Tento proces se opakuje, dokud není nalezen požadovaný prvek nebo dokud začínající index překročí koncový seznam
- Časová složitost - $O(log n)$
- Výhody
	- $ Je velmi rychlý a efektivní
- Nevýhody
	- ! Potřebuje seřazený seznam!!!
	- Složitější implementace