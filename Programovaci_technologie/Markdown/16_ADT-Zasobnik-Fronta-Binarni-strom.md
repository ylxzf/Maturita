---
tags:
  - PRM
---
## ADT

### Zásobník - Stack
- $ Přidává i odebírá prvky pouze z jednoho konce
- $ Struktura typu LIFO (Last In - First Out)
	- @ Naposledy přidaný odchází jako první
- Metody:
	- $ `push()`
		- Vložení prvku na vrchol zásobníku (nový prvek je parametr)
	- $ `pop()`
		- Odebrání prvku z vrcholu zásobníku (vrátí odebraný prvek)
	- $ `isEmpty()`
		- Test na prázdnost zásobníku
	- $ `peek()`
		- Vrátí vrchol zásobníku
- Příklady použití:
	- Obrácení posloupnosti
	- Kontrola párování závorek
	- DFS (prohledávání grafu do hloubky)
- Vysvětlení:
	- $ Push
		- ![[Pasted image 20250516100440.png]]
		- ![[Pasted image 20250516100456.png]]
	- $ Pop
		- ![[Pasted image 20250516100541.png]]
		- ![[Pasted image 20250516100551.png]]

### Fronta - Queue
- $ Přidává prvky na konec a odebírá je ze začátku
- $ Struktura typu FIFO (First In - First Out)
	- @ Neboli první přidaný odchází jako první
- Metody:
	- $ `enqueue()`
	- $ `dequeue()`
	- $ `isEmpty()`
	- `getFirst()`
	- `getLast()`
- Příklady použití:
	- paměť cache - požadavky jsou zpracovávány v pořadí v jakém přicházejí
	- BFS (prohledávání grafu do šířky)
- Vysvětlení:
	- ![[Pasted image 20250516100812.png]]

### Binární strom
- $ Začíná z jednoho uzlu (kořene) a z něj vedou cesty do pod-uzlů a tak dále
	- Každý uzel může mít 0, 1, nebo 2 pod-uzly
- Průchody stromem:
	- $ Preorder
		1. @ Vypíšu hodnotu aktuálního uzlu
		2. @ Vypíšu hodnotu levého pod-uzlu
		3. @ Vypíšu hodnotu pravého pod-uzlu
	- $ Inorder
		1. @ Vypíšu hodnotu levého pod-uzlu
		2. @ Vypíšu hodnotu aktuálního uzlu
		3. @ Vypíšu hodnotu pravého pod-uzlu
	- $ Postorder
		1. @ Vypíšu hodnotu levého pod-uzlu
		2. @ Vypíšu hodnotu pravého pod-uzlu
		3. @ Vypíšu hodnotu aktuálního uzlu
- Příklady použití:
	- Převod Morseovy abecedy na text
	- Pro uložení dat, kde potřebuji rychle vyhledávat. (Je rychlejší než sekvenční vyhledávání)
