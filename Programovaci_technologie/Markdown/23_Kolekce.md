---
tags:
  - PRM
---
## Kolekce
- $ Soubor dat, které jsou většinou stejného typu a který má požadované chování

--- 

## Iterator
- $ U kolekcí, které jsou iterovatelné, můžeme využívat iterátory
- $ Iterátory jsou objekty, které slouží k procházení kolekcí

## List
- $ Uchovává prvky v přesně daném pořadí a umožňuje duplikáty
- Každý prvek má svůj index
- Metody:
	- `size()` – vrátí aktuální počet prvků v seznamu
	- `isEmpty()` – vrátí `true`, pokud je seznam prázdný
	- `contains(Object o)` – vrátí `true`, pokud seznam obsahuje objekt z parametru
	- `add(Object o)` – přidá objekt na konec seznamu
	- `add(int index, Object o)` – vloží objekt na zadaný index
	- `get(int index)` – vrátí objekt na zadaném indexu
	- `set(int index, Object o)` – nahradí prvek na daném indexu novým objektem
	- `remove(Object o)` – odebere první výskyt objektu ze seznamu
	- `remove(int index)` – odebere prvek na zadaném indexu
	- `indexOf(Object o)` – vrátí index prvního výskytu objektu, nebo `-1`
	- `lastIndexOf(Object o)` – vrátí index posledního výskytu objektu, nebo `-1`
	- `clear()` – vymaže celý obsah seznamu
	- `subList(int fromIndex, int toIndex)` – vrátí podseznam mezi dvěma indexy
	- `iterator()` – vrátí `Iterator` pro průchod seznamem
- např. ArrayList, LinkedList

## Set
- Množina jedinečných hodnot
	- `size()` – vrátí aktuální počet prvků v množině
	- `isEmpty()` – vrátí `true`, pokud je množina prázdná
	- `contains(Object o)` – vrátí `true`, pokud množina obsahuje objekt z parametru
	- `add(Object o)` – přidá objekt do množiny (pouze pokud tam ještě není)
	- `remove(Object o)` – odebere objekt z množiny, pokud existuje
	- `clear()` – vymaže celý obsah množiny
	- `iterator()` – vrátí `Iterator` pro průchod množinou
	- `toArray()` – převede množinu na pole
	- `equals(Object o)` – porovná dvě množiny na rovnost obsahu
	- `hashCode()` – vrátí hash kód množiny (důležité pro použití v `Map`)
- např. TreeSet, HashSet

## Map
- $ Ukládání dvojic klíč–hodnota, kde každý klíč je jedinečný a slouží k přístupu ke své hodnotě
- Metody:
	- - `size()` – vrátí aktuální počet dvojic (klíč–hodnota) v mapě
	- `isEmpty()` – vrátí `true`, pokud je mapa prázdná
	- `containsKey(Object key)` – vrátí `true`, pokud mapa obsahuje daný klíč
	- `containsValue(Object value)` – vrátí `true`, pokud mapa obsahuje danou hodnotu
	- `get(Object key)` – vrátí hodnotu přiřazenou ke klíči, nebo `null`, pokud klíč neexistuje
	- `put(K key, V value)` – vloží nebo nahradí hodnotu ke klíči
	- `remove(Object key)` – odstraní záznam s daným klíčem
	- `clear()` – vymaže celý obsah mapy
	- `keySet()` – vrátí `Set` všech klíčů
	- `values()` – vrátí `Collection` všech hodnot
	- `entrySet()` – vrátí `Set` obsahující `Map.Entry` (páry klíč–hodnota)
	- `equals(Object o)` – porovná dvě mapy na základě obsahu
- např. TreeMap, HashMap