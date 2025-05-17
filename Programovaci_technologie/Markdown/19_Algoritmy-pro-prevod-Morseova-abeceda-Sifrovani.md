---
tags:
  - PRM
---
## Šifrování
- $ Šifrování je proces převodu čitelné informace na nečitelný formát
- $ Účelem je ochrana dat před neoprávněným přístupem
- $ Tento proces využívá šifrovací algoritmus a šifrovací klíč
- $ Mezi základní typy šifrování patří symetrické (stejný klíč pro šifrování i dešifrování) a asymetrické (veřejný a soukromý klíč)

## Morseova abeceda
- ! Není to šifra, ale kódovací systém pro přenos informací
- $ Používají se krátké (•) a dlouhé (−) signály
- $ Slova se oddělují lomítkem /, písmena mezerou
- $ Každé písmeno má odpovídající sekvenci teček a čárek
- Implementace:
	- Pomocí tříd `HashMap` a `StringBuilder`
	- Pomocí binárního stromu (pro efektivní převod z morseovky do textu)
	- ![[Pasted image 20250516202133.png]]

## Caesarova šifra
- $ Jednoduchá substituční šifra, která posouvá každé písmeno v abecedě o pevně daný počet míst
	- ! Písmena z konce abecedy se posunou cyklicky na začátek abecedy
- Nevýhody:
	- Existuje pouze 25 možných klíčů, což umožňuje prolomení brute-force útokem
	- Statistická analýza frekvence písmen může pomoci rychle odhalit použitý posun

## Afinní šifra
- $ Písmena v textu jsou nahrazována podle matematického pravidla využívajícího aritmetické operace na pozicích písmen v abecedě
- Šifrovací vzorec:
	- $ $E(x) = (ax + b) \ mod\ n$
		- @ $E(x)$ - zašifrovaný znak
		- @ $a$ a $b$ - klíče šifry (může být libovolné celé číslo)
		- @ $x$ - pozice písmene v abecedě
		- @ $n$ - velikost abecedy (pro anglickou abecedu $m = 26$)
- Dešifrovací vzorec:
	- $ $D(y) = a^{-1} ⋅(y−b)\ mod\ m$
		- $a^{-1}$ - multiplikativní inverzní číslo k $a$
- Podmínky:
	- $0 < a < n$
	- $0 <= b < n$
	- $0 <= x < n$
	- $0 <= y < n$
	- @ $a \neq 0$
	- @ $a \neq n$
	- ! $a$ nedělí $n$
		- @ $n$ často bývá prvočíslo

## VIC šifra
- Jednoduchá na šifrování i dešifrování pokud znám klíč, ale téměř neprolomitelná pokud klíč neznám
- Klíčem je:
	- Náhodná permutace číslice 0 až 9 (každá číslice právě jednou)
	- Náhodný text obsahující
	    - Přesně 10 znaků z čehož jsou právě dvě mezery
	    - Ve zbylých písmenech se žádné neopakuje
	- např.: 
		- ![[Pasted image 20250516204212.png]]
		- První řádek je náhodná permutace _**(0-9)**_
		- Druhý řádek je náhodný text splňující požadavky
		- Třetí a čtvrtý řádek jsou uvozeny číslicemi, které vychází na mezery v druhém řádku a obsahují zbylá písmena šifrované abecedy
		- Příklad šifrování:
			- Šifrování probíhá tak, že znaky šifruji číslem (dvojicí čísel) podle průsečíku znaku v tabulce
			- ![[Pasted image 20250516204303.png]]

