---
tags:
  - PRM
---
## Numerická matematika
- $ Obor, který se zabývá řešením matematických problémů pomocí algoritmů a výpočtů na počítači
## Polynom (Mnohočlen)
- $P(x) = a_n x^n + a_{n-1} x^{n-1} + \dots + a_1 x + a_0$
- V programu ukládáme na příslušné pozice příslušné koeficienty - na pozici 0 uložíme koeficient $a_{0}$ atd.
	- Když má polynom stupeň 5, tak uložíme 6 koeficientů ($a_{0}$ - $a_{5}$)
- Polynom $P(x)=4x^{3}+5x−2$ uložíme takto:
	- ![[Pasted image 20250517160429.png]]
## Hornerovo schéma
- $ Slouží k výpočtu hodnoty polynomu v zadaném bodě
- Příklad:
	- Polynom: $P(x)=2x^3−6x^2+2x−1$
		- V bodě $x_{0} = 3$
	- $ Postup:
		- První koeficient 2 přepíšeme do spodní řádky
		- Vynásobíme $2 \times 3 = 6$, napíšeme do mezivýpočtů pod $-6$
		- Sečteme: $−6+6=0$, zapíšeme do výsledků
		- Vynásobíme $0 \times 3 = 0$, napíšeme pod $2$
		- Sečteme: $2+0=2$, zapíšeme do výsledků
		- Vynásobíme $2 \times 3 = 6$, napíšeme pod $-1$
		- Sečteme: $−1+6=5$, zapíšeme do výsledků
	- |Mocniny:|2|-6|2|-1|
		|---|---|---|---|---|
		|x = 3 (mezivýpočty)||6|0|6|
		|Výsledky:|2|0|2|5|
	- $ Hodnota polynomu v bodě $x=3$ je **5** (poslední číslo ve spodním řádku)
## Metoda půlení intervalu - Bisekce
- $ Slouží k výpočtu hodnoty polynomu v zadaném bodě
- Není moc rychlý a který nezohledňuje průběh funkce, ale vždy najde řešení (pokud nějaké je)
- $ Vstupní podmínky:
	- @ Potřebujeme dva krajní body $(a, b)$ mezi kterými se nachází právě jeden kořen
		- ! Funkce je mezi těmito krajními body $(a, b)$ spojitá
	- @ Máme zadánu požadovanou přesnost $\epsilon$ - desetinné číslo vyšší jak 0
- $ Postup:
	- Spočítej znaménko pro funkční hodnoty $f(a)$ a $f(b)$
		- Pro určení znaménka využijeme funkci [signum](https://cs.wikipedia.org/wiki/Funkce_signum)
	- Spočítej střed $c=\dfrac{a+b}{2}$
	- Spočítej funkční hodnotu $f(c)$
	- Platí-li že $|f(c)|<=\epsilon$ pak jsme našli kořen -> konec
	- Pokud ne, tak spočítej znaménko funkční hodnoty $f(c)$
	- Jako nový (přesnější) interval zvol ten kde se mění znaménka v krajních bodech, $(a, c) nebo $(c, b)$
	- Postup opakuj
## Newtonova metoda tečen
- $ Slouží k výpočtu hodnoty polynomu v zadaném bodě
- Vstupní podmínky:
	- Potřebujeme jeden startovací bod $x_0$
	- @ Funkce musí být "rozumná"  
		- Je spojitá
		- Je monotónní
		- Má derivaci
	- Máme zadánu požadovanou přesnost $\epsilon$ - desetinné číslo vyšší jak 0
- $ Postup:
	- Spočítej novou hodnotu $x_n+1$ pomocí vztahu: $x_{n+1}=x_n−\dfrac{f(x_n)}{f′(x_n)}$
	- Platí-li že $|f(x_{n+1})|<=\epsilon$ pak jsme našli kořen -> konec
	- Pokud ne, pak právě spočítané $x_{n+1}$ nastav jako nové $x_n$ a postup opakuj
