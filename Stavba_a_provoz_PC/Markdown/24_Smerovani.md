---
tags:
  - POS
---
## Směrování
- $ Proces, při kterém se hledá cesta mezi zařízeními
- $ Směrování zajišťuje router (směrovač) nebo L3 switch
- $ Proces probíhá na L3 ISO/OSI
- 2 typy protokolů
	- $ Routed - Směrovaný
		- @ Podle nich se přenášejí data (pakety) přes síť
		- Protokol který se dá směrovat
		- IP, IPx, ...
	- $ Routing - Směrovací
		- @ Pomáhá směrovačům zjistit nejlepší cestu k cílové síti
		- RIP, OSPF, IGRP, ...
- 2 typy směrování
	- Statické
	- Dynamické

### Směrovací tabulka
- $ Říká, kam se mají jednotlivé pakety poslat
- $ Tabulka se záznamy o sítích
- $ Používá se pro určení trasy paketu
- $ Směrovací tabulka se prohledává od nejmenšího rozsahu po největší, pokud nemá shoda, tak se ohlásí Network Unreachable.
- Poslední záznam bývá 0.0.0.0 netmask 0.0.0.0 má adresu dalšího switch na trase(Gateway)
	- V tomto případě je vždy shoda
- Příklad: 
	- Network destination - Určuje rozsah adres, pro které platí tento záznam (**Adresa sítě**)
	- Netmask - Maska sítě
	- Gateway - Další router na trase (On-Link znamená že je adresa na kabelu)
	- Interface - Rozhraní
	- Metrika - Je ocenění sítě neboli jinými slovy její “rychlost” trasy
	- ![[Pasted image 20250516031137.png]]

### Statické směrování
- $ Jednoduchý tip směrování, kde jsou adresy sítí zadány manuálně.
### Dynamické směrování
- $ Dynamicky se vytváří směrovací tabulka - podle ní se určuje, jak data se budou data posílat.
- Používají se routing protokoly
	- ![[Dynamic-Routing-Protocol.png]]
#### IGP
- IGP - Interior Gateway Protocol
	- Pojem Gateway odkazuje na router
- $ Používají se v rámci jednoho #Autonomní_systém
##### Distance Vector
- $ Vhodné pro malé sítě, má dlouhou #Doba_konvergence 
- $ V pravidelných intervalech se rozesílají směrovací tabulky sousedním routerům
- ! Protokoly nemají představu o topologii sítě
- $ RIP - Routing Information Protocol
	- Jednoduchá #Metrika 
		- $ Počet routerů do cíle - Hop Count
			- @ Připojená síť má metriku 0
	- Nenáročný na HW
	- $ Používá Bellman-Ford algoritmus
	- Aktualizuje se každých 30s
		- @ Posílá tabulku
	- AD - 120
	- Verze
		- @ RIPv1
			- Classful
				- NEzahrnuje masku podsítě
		- @ RIPv2
			- Classless
				- Zahrnuje masku podsítě
- $ IGRP - Interior Gateway Routing Protocol
	- @ Proprietární Cisco protokol
	- Classful
		- NEzahrnuje masku podsítě
	- Nepoužívá se
	- Metrika se skládá z:
		- @ Bandwidth - Rychlost
		- @ Delay - Latence
		- @ Reliability - Spolehlivost
		- @ Load - Zatížení
##### Link State
- $ Vhodné pro větší sítě tyto protokoly vědí o topologii sítě a stavu na síti
- Vytváří mapu trasy
- $ Rychlá konvergence
	- ! Ale hodně zatěžují síť, něž si vytvoří mapu a směrovací tabulky
- $ IS-IS - Intermediate System to Intermediate System
	- @ Používá Dijkstrův algoritmus
	- Classless
		- Zahrnuje masku podsítě
	- Router si dělá databázi o stavu sítě
- $ OSPF - Open Shortest Path First
	- @ Používá Dijkstrův algoritmus
	- Classless
		- Zahrnuje masku podsítě
	- Modernější verze IS-IS
	- Má IPv4 a IPv6 implementaci
	- Hierarchická struktura
		- ! Musí být vždy zadaná Area 0
		- ! Všechny oblasti se musí propojit přes Area 0
		- Každá oblast má hlavní router a backup router
##### Hybrid
- $ Kombinace Link state a Distance Vector
- $ EIGRP - Enhanced Interior Gateway Routing Protocol
	- @ Vylepšený IGRP
	- Classless
		- Zahrnuje masku podsítě
	- @ Proprietární Cisco protokol
	- @ Používá DUAL algoritmus
	- Metrika se skládá z:
		- @ Bandwidth - Rychlost
		- @ Delay - Latence
		- @ Reliability - Spolehlivost
		- @ Load - Zatížení

#### EGP
- EGP - Exterior Gateway Protocol
	- Pojem Gateway odkazuje na router
- $ Slouží k propojení velkých #Autonomní_systém
##### Path Vector
- $ BGP - Border Gateway Protocol

---

### NAT
- NAT - Network Address Translation
	- Umožňuje přístup k internetu koncovým zařízením pod jinou IP adresou
	- @ Přepisuje adresu odesílatele v hlavičce paketu
		- Přepisy zaznamenává v CONNTRACK (Connection Tracking) tabulce
		- Komu má přeposlat data pozná podle předchozího portu.
	- Existuje jen v IPv4
	- $ CONNTRACK (Connection Tracking) tabulka
		- Uchovává informace o aktivních síťových spojeních
	- ! NAT neumožňuje přímé navázání spojení s venkovním počítačem
	- Varianty
		- @ 1:N - Nejpoužívanější
			- 1 veřejná, mnoho privátních
		- @ M:N kde M < N
			- Jde jenom přes SNAT
		- @ 1:1
	- $ SNAT - Source NAT
		- @ Používá se k připojování z privátní sítě do internetu
		- Dělá se po routingu
	- $ DNAT - Destination NAT
		- @ Používá se k přístupu k chráněným serverům
		- @ Pokud chceme komunikovat s vnitřní adresou, musí se komunikovat rozdělením a rozlišením podle portu
		- ! Nelze určit, jak vypadá síť za NATem
		- Dělá se předtím, než se provede routing

---
## Pojmy
### Vlastnosti protokolů
#### #Administrative_Distance - AD
- Administrative Distance - Administrativní vzdálenost
- $ Ohodnocení protokolu
- První hodnota v `[110 / 10]`
    - 110 je AD
        - OSPF
    - 10 je Metrika pro daný protokol
#### #Metrika
- $ Slouží k číselnému ocenění tras do cílových sítí
- $ Nejlepší trasa má nejmenší metriku
- Odvozuje se z:
    - Rychlosti linky
    - Latence
    - Počtu směrovačů na trase
    - atd.
- např. #<0;15>
- \# → Hop count pro RIP
    - Podsítě kterými se projde nejkratší cestou od zdrojového směrovače do cílové podsítě
#### #Konvergence
- $ Síť je zkonvergovaná právě tehdy, když mají všechny směrovače správné a kompletní informace o celé síti
- Stav, kterého chceme dosáhnout
#### #Doba_konvergence
- $ Je to doba, kterou směrovače potřebují k výměně všech směrovacích informaci, vypočtu nejlepších cest a aktualizaci směrovacích tabulek

### Jiné
#### #Autonomní_systém
- $ Autonomní systém je síť zařízení, která sdílejí společnou směrovací politiku a mají unikátní identifikátor (ASN)
- $ Směrování v rámci AS používá interní protokoly (např. OSPF), mezi AS se používá BGP