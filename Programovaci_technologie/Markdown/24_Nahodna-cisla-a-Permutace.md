---
tags:
  - PRM
---
## Náhodná čísla
- $ Generování náhodných čísel znamená vytvářet řadu čísel zcela náhodně, nepředvídatelně a bez žádné periody, tedy generovaná posloupnost by se neměla po nějaké době opakovat
- ! Toto není v počítači možné protože každý program, tedy i program pro generování náhodných čísel, se měl chovat deterministicky (předvídatelně), tzn. že by v každém kroku mělo být jasné co bude následovat
- $ V počítačových programech používáme tzv. "pseudonáhodných" čísel
	- @ Deterministický (předvídatelný) výpočet, který generuje posloupnost čísel takovou, že se jeví "jako by byla" náhodná

## Třídy
- Random
	- Metody:
		- `nextBoolean()`
		- `nextFloat()`
		- `nextDouble()`
		- `nextInt()`
		- `nextBoolean()`
- Generování ve vlastním rozsahu
	- `rd1.nextInt() % (max + 1)`
	- `rd1.nextInt(max - min + 1) + min`
## Permutace
- $ Posloupnost prvků ve které se každý prvek vyskytuje právě jednou