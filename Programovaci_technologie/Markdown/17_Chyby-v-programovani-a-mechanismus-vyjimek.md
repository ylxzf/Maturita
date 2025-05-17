---
tags:
  - PRM
---
## Chyby v programování
- $ Syntaktická
	- @ Porušení gramatiky / syntaxe programovacího jazyka
	- @ Překlep, nebo zapomenutý středník
	- @ Snadno odhalitelná, protože jí odhalí překladač již během překladu (syntaktické analýzy), program je nepřeložitelný
- $ Sémantická
	- Jedná se chybu v logice / sémantice programu
	- @ Typicky prohozené / zapomenutá instrukce
	- Hůře odhalitelná, protože program je přeložitelný, ale pokaždé počítá špatně
- $ Běhová
	- @ Chyba, která nastává za běhu programu a jen někdy
	- @ Typicky nějaká neošetřená, nestandardní situace (dělení nulou, nebo přístup mimo pole)
	- ! Nejhůře odhalitelná, protože program je přeložitelný, většinou běží správně, ale při některých špatných vstupních podmínkách skončí chybou
	- Právě s tímto typem chyb nám může pomoci mechanismus výjimek

## Výjimky
- $ Nestandardní událost, která nastane během provádění programu a která naruší normální běh instrukcí
	- např.: při chybném otevření souboru, při překročení mezí pole, při aritmetické chybě apod...
- ! Z pohledu práce s výjimkou v programovacím jazyce je výjimka objekt
	- @ Error 
		- Závažné chyby ve JVM
		- Neošetřujeme
	- @ Exception
		- Výjimečné stavy
		- Můžeme / musíme ošetřit 
- ![[Pasted image 20250516114609.png]]

### Vyhození výjimky
- Neúmyslně
- Úmyslně
	- @ Klíčový slovo: `throw`
	- ! Pozor neplést s klíčovým slovem: `throws`
		- Klíčové slovo throws slouží k označení metod u kterých chceme říct, že výjimku uvnitř metody neřešíme, ale posíláme jí výše

### Zpracování výjimky
- 3 metody + 1:
	- Propagace
		- Oznámení chyby
	- Ošetření
		- Použijeme v případě když chceme výjimku hned vyřešit
		- Blok `try-catch-finally`
	- Kombinace propagace a ošetření
	- (Ignorace)