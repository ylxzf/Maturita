---
tags:
  - POS
---
## Pasivní síťové prvky
- $ Nepotřebují napájení
- $ Nepracují s daty
### Kabely
- Metalické
	- Koaxiální kabel
		- $ Asymetrický metalický elektrický kabel
		- Jeden válcový vnější vodič a jeden vnitřní drátový/trubkový vodič
		- Vnější vodič se často nazývá stíněním a vnitřní vodič jádrem
		- Vnější a vnitřní vodiče jsou odděleny nevodivou vrstvo
		- ![[Pasted image 20250516000153.png]]
		- Vrstvy
			- A - Plášť (Vnější izolace)
			- B - Vnější vodič (Stínění)
			- C - Dielektrikum (Nevodivá vrstva)
			- D - Vnitřní vodič (Jádro)
		- $ Už se nepoužívá
		- Rychlost až 10 Mbps
		- Tenký / Tlustý
	- Kroucená dvojlinka - Twisted Pair
		- $ Používán v telekomunikacích a počítačových sítích
		- $ Symetrický metalický kabel
		- $ Dvojice spirálově stočených vodičů v kabelu
		- 4 páry vodičů
			- @ Zelená
			- @ Modrá
			- @ Oranžová
			- @ Hnědá
		- Pro přenos 10 a 100 Mb Ethernetu - pouze 2 páry vodičů
			- V případě 1 Gb Ethernetu - všechny 4 páry vodičů (tedy i modrý a hnědý)
		- Provedení
			- $ UTP - Unshielded TP
				- Jednotlivé páry jsou vloženy do vnější plastické izolace
			- $ STP - Shielded TP
				- Kovové opletení, které zvyšuje ochranu před vnějším rušením
		- Rychlosti
			- Cat. 3
				- UTP
				- Pro telefonní kabely
				- 10 Mbps
			- Cat. 4
				- UTP
				- Pouze v USA
				- 16 Mbps
			- Cat. 5
				- UTP
				- 100 Mbps
			- $ Cat. 5E
				- UTP
				- Pro běžné LAN sítě
				- 1 Gbps
			- $ Cat. 6
				- UTP
				- 1 Gbps
			- $ Cat. 6A
				- STP
				- 10 Gbps
				- Původně jen na páteřní sítě, nyní i na LAN
			- Cat. 7
				- STP
				- 10 Gbps
- Optické
	- $ Světelné impulsy
	- Výhody: 
		- @ Odolnost proti elektromagnetickému rušení
		- @ Nemožnost odposlechu - Bezpečnost
	- Nevýhody: 
		- Vyšší cena oproti metalickým kabelům
	- Typy
		- #SingleMode - Jednovidové
			- @ Index lomu mezi jádrem a pláštěm optického vlákna je velmi malý
			- Kabelem prochází jen jeden paprsek bez lomů a ohybů
			- @ Lepší optické vlastnosti
		- #MultiMode - Mnohavidové
			- Paprsek se odráží od pláště vlákna
			- @ Horší optické vlastnosti
#### Značení kabelů
- AWG
	- Průměr vodiče
- 24MM - 24 vláken MultiMode
	- Počet vláken
- INSTALLATION CABLE
	- TP
	- Vodiče z měděného drátu
	- Méně ohebný
	- Ve zdích
- SOLID CABLE
	- TP
	- Vodiče z měděného drátu
- PATCH CABLE
	- TP
	- Vodiče z měděného lanka
	- Propojovací
	- Pružnější
- FIBER CABLE
	- Optický kabel
- 8*9/125 - 8 vláken SingleMode

### Konektory
- $ Koaxiální kabel - BNC konektor
- $ Kroucená dvojlinka - RJ45
- $ Optické kabely - FC a LC
### Patch panel
- $ Blok zásuvek
- Liší se počtem portů
### Rack
- $ Slouží pro mechanické upevnění síťových prvků

---

## Aktivní síťové prvky
- $ Potřebují napájení
- $ Pracují s daty
### Repeater - Opakovač 
- $ Zesilovač, tvarovač signálu
- HW prvek
- Elektronický aktivní prvek
- $ Nemá žádnou paměť – vše co přijme, zesílí a odešle "bez rozmyšlení" hned dál
- $ Pracuje na L1 ISO/OSI
- Latence v nanosekundách
### Hub - Rozbočovač
- $ Umožňuje větvení
- HW prvek
- Základ sítí s hvězdicovou fyzickou topologií
- $ Chová se jako Repeater
- $ Přeposílá data na všechny porty kromě zdrojového
- ! Neřídí provoz
- ! Nelze naráz vysílat a přijímat
- Byl nahrazen switchem
- ! Pracuje na L1 ISO/OSI
### Bridge - Most
- $ Slouží pro propojení podsíti
- SW / HW prvek
- Spojuje dvě části sítě na linkové vrstvě ISO/OSI
- Rozhoduje na základě MAC adres
- $ Odděluje provoz dvou segmentů sítě, tak že si ve své paměti RAM sám sestaví (lze i ručně) tabulku MAC adres a portů, za kterými se dané adresy nacházejí
- $ Pokud nemá v tabulce danou MAC adresu - posílá všude a přidá do tabulky
- $ CAM (Content Access Memory) tabulky
- Mohou vysílat a přijímat data ve stejnou dobu - Full-duplex
- $ Pracuje na L2 ISO/OSI
- Velká latence - stovky mikrosekund
### Switch - Přepínač
- $ Určuje, které rozhraní se použije pro přeposílání dat na základě MAC adresy
- HW prvek
- $ Pracuje s rámci (MAC adresy)
- Switche se používají v sítích, ve kterých dochází k relativně vyššímu zatížení sítě s větším počtem stanic
- $ CAM (Content Access Memory) tabulky
	- Tabulka kde jsou uložené MAC adresy
	- @ Adresa, port, čas
- $ Pracuje na L2 ISO/OSI
- Mohou vysílat a přijímat data ve stejnou dobu - Full-duplex
- Typy
	- $ Cut-through
		- Nejstarší typ
		- ! Může šířit rámce s chybou
		- Nelze komunikovat zároveň přes více jak 1 port
		- @ Nejmenší odezva
	- $ Fragment-free
		- Stejný jako Cut-through ale kontroluje rámce aby nešířil chyby
		- Větší latence než Cut-through
	- $ Store & Forward
		- Používá se dnes
		- @ Nešíří kolizní ani poškozená data
			- Kontroluje FCS
		- Velké latence
- Jak funguje
	- @ Nejprve zkontroluje zda je adresa příjemce v CAM tabulce   
	- @ Pokud ano pošle data na port  
	- @ Pokud ne pošle data na všechny porty   
	- @ Nakonec aktualizuje čas v CAM tabulku o adrese odesílatele
### Router - Směrovač 
- $ Zařízení propojující sítě, které pracují se stejným síťovým protokolem
- $ HW prvek - Pracuje s daty přes SW
- $ Oproti switchi je pomalejší – paket musí nejprve načíst do své vyrovnávací paměti (Cache) a až poté se rozhodne, co s ním bude dál dělat
- $ Pracuje s IP adresami - rozhoduje podle IP adresy
- ! Pokud obdrží blok dat s adresou, kterou nemá v tabulce, tak paket zruší a odesílateli odešle chybové hlášení
- Routovací (Směrovací) tabulka
	- |Network destination|Netmask|Gateway|Interface|Metric|
	|---|---|---|---|---|
	|127.0.0.0|255.0.0.0|On-Link|127.0.0.1|331|
	|255.255.255.0|255.255.255.0|127.0.0.1|127.0.0.1|331|
	|0.0.0.0|0.0.0.0|192.168.218.1|192.168.1.49|25|
- $ Pracuje na L3 ISO/OSI
- Směrování
	- Statické
		- @ Správce zadává adresy manuálně
	- Dynamické
		- @ Používají se Routing Protokoly
	- 
- $ NAT - Network Address Translation
	- Umožňuje přístup k internetu koncovým zařízením pod jinou IP adresou
	- @ Přepisuje adresu odesílatele v hlavičce paketu
		- Přepisy zaznamenává v CONNTRACK (Connection Tracking) tabulce.
		- Komu má přeposlat data pozná podle předchozího portu.
	- Existuje jen v IPv4
	- ! NAT neumožňuje přímé navázání spojení s venkovním počítačem
	- Varianty
		- 1:N
		- M:N
		- 1:1
	- $ SNAT - Source NAT
		- @ Používá se k připojování z privátní sítě do internetu
		- Dělá se po routingu
	- $ DNAT - Destination NAT
		- @ Používá se k přístupu k chráněným serverům
		- Dělá se předtím, než se provede routing
### Gateway - Brána
- Nejvyšší postavení v rámci síťových prvků
- $ Propojuje dvě sítě pracující s odlišnými komunikačními protokoly
### Síťové karty
- $ Slouží k tomu, aby PC měl síťové rozhraní a mohl se připojit do sítě
- Hlavní výrobce čipů pro sítové karty patří Intel a Realtek