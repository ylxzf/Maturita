---
tags:
  - PRM
---
## Prvočíslo
- $ Přirozené číslo větší než 1, které je dělitelné jen dvěma děliteli:
	- @ Jedničkou a samo sebou
- ! Jednička není prvočíslo, neboť nemá dva různé dělitele
- $ Přirozená čísla větší než jedna, která nejsou prvočísly, se nazývají složená čísla
- $ Prvním prvočíslem je číslo 2, které je jediným sudým prvočíslem
### Prvočíselný rozklad:
- $ Vyjádření přirozeného čísla jako součinu mocnin prvočísel
- $ Každé přirozené číslo je možno rozložit na právě jeden prvočíselný součin
	- např. $12=2×2×3$

## Test prvočíselnosti
### Hrubá síla
- $ Od $2$
	- Protože to je první prvočíslo
- $ Do $\sqrt{n}$ , kde $n$ je číslo co cestujeme
	- Kontrolujeme jen do druhé odmocniny, protože se pak čísla opakují

### Eratosthenovo síto
- Vygenerování pole s čísly od 2
- Postupný odstraňování násobků čísel
- Začínáme 2
- Označíme ho jako prvočíslo
- Odstraňujeme násobky 2
- Pokračujeme na další číslo v poli 3
- Opakujeme to stejný
- 4 už tam není protože byl násobek 2
- atd.

## Eukleidův algoritmus
- $ Slouží k výpočtu největšího společného dělitele (NSD) dvou čísel
	- NSD dvou čísel je největší číslo, které obě čísla dělí beze zbytku
- Výpočet NSD (největší společný dělitel)
	- ![[Pasted image 20250517191823.png]]
- $ Výpočet NSN (nejmenší společný násobek)
    - NSN(a, b) = (a x b) / NSD(a, b)