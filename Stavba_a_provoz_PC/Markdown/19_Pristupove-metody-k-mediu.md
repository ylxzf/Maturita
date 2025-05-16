---
tags:
  - POS
---
## Přístupové metody
- $ Popisují způsob, jak regulovat a řídit přístup jednotlivých komunikačních uzlů na společném přenosovém médiu

## Dělení
- Chování vůči kolizím
	- $ Bez detekce kolizí
	- $ Zcela vylučují kolize (CA - Collision Avoidance)
		- @ Nepřipouští vznik kolizí
	- $ Detekují kolize (CD - Collision Detection)
		- @ Snaží se předcházet kolizím, ale nedokáží zaručit, že nevzniknou
			- ! Pokud vzniknou, naleznou je a snaží se je řešit
- Existence náhodného prvku při rozhodování
	- $ Deterministické (řízené)
		- @ Jednoznačně definovaná pravidla s předvídatelným výsledkem
		- @ Bez vlivu náhodných jevů
		- @ Token Ring, Token Bus, FDDI
	- $ Nedeterministické (neřízené)
- Existence centrálního prvku
	- $ Centralizované
		- @ Existence centrálního prvku, který přiděluje oprávnění k vysílání
		- ! Pokud vypadne centrální stanice -> Vypadne celá síť
		-  Obvykle deterministické
	- $ Decentralizované / Distribuované
		- @ Neexistuje centrální prvek
		- @ Každá stanice jedná sama za sebe
		- Jsou si rovny
		- Spolupracují navzájem o CSMA
- Naslouchání
	- $ Naslouchají (CS - Carrier Sense)
		- @ Uzly naslouchají, zda v síti právě probíhá přenos
	- $ Nenaslouchají

## ALOHA
- $ PC odešle data bez ohledu na ostatní, pokud nedostane včas potvrzení o přijetí, posílá data znova
- $ Stav přenosového kanálu se nemonitoruje
	- @ Nehledí na to, že může vysílat jiná stanice
- Nedeterministická
### Modifikovaná ALOHA
- Stejný princip jako u ALOHY
- $ Než odešle data, zjišťuje, zda nevysílá jiná stanice

## CSMA
- $ CS - Carrier Sense
	- @ Odposlouchávání -  „Naslouchání nosné"
- $ MA - Multiple Access
	- Více zařízení (například počítačů nebo síťových uzlů) má současně přístup ke stejnému komunikačnímu médiu
### CSMA / CD
- CSMA / CD - Carrier Sense Multiple Access with Collision Detection
- $ Naslouchající
- $ Vícenásobný přístup s detekcí kolizí
- Postup:
	- @ Uzel se rozhodne vysílat
	- @ Začne naslouchat přenosovému médiu
	- @ Zjistí, že je přenosové médium nepoužívané = nikdo nevysílá
	- @ Začne vysílat
	- @ Zjistí, že již někdo vysílá
	- @ Opět vysílá až je to možné
	- @ Počká než se medium uvolní
- Kdy dojde ke kolizi:
	- ! Více uzlů zjistí, že je médium neužívané a rozhodnou se vysílat
	- ! Více uzlů zjistí, že je médium používané a chtějí vysílat
		- Čekají na uvolnění
		- Médium se uvolní a všechny začnou ve stejný okamžik vysílat
- Výhody
	- $ Jednoduchost
	- Rychlost
	- Nízká cena komponent
	- Nemá žádný řídící prvek
- Nevýhody
	- ! Čím víc stanic tím víc kolizí (může dojít až k zahlcení sítě)
		- @ Eliminuje se to použitím switchů a bridgů, které filtrují pakety
	- Nedeterministická povaha
		- @ Přidělování času je náhodné
		- Nelze zaručit, za jak dlouho bude zpráva doručena
		- Nehodí se k řízení provozu v reálném čase
	- Nezaručitelnost přístupu uzlu k médiu (nehodí se na přenos v reálném čase)
	- $ Nelze zjistit, zda byla zpráva adresátovi doručena
### CSMA / CA
- CSMA / CA - Carrier Sense Multiple Access with Collision Avoidance
- $ Odvozena od CSMA/CD
	- @ Tady ale nedetekuje kolize, ale předchází jim
- Postup:
	- @ Uzel se rozhodne vysílá
	- @ Začne naslouchat přenosovému médiu
	- @ Zjistí, že přenosové médium je nepoužívané
	- @ Pošle testovací data (RTS; Ready to send), aby se ujistil, že opravdu nikdo nevysílá
		- @ Pokud obdrží CTS (clear to send), rezervuje čas potřený pro poslání svých dat
		- @ Pokud ne - Vysílá někdo jiný - Čeká náhodnou dobu
- Výhody: 
	- Efektivní
	- Spolehlivý
- Nevýhody: 
	- Relativně pomalé
		- Pokaždé se rezervuje…
	- Nevhodné pro velké sítě
		- Čím větší sítě, tím více se síť zpomaluje
## Token passing
- $ Metoda založena na přidělování práva k vysílání
- $ V sítí obíhá token (pešek; vysílací právo)
- $ Uzel, který dokončí posílání dat, předá token svému následovníkovi
- Postup:
	- @ Datový paket s tokenem je předáván z uzlu na uzel, dokud nedorazí k příjemci
	- @ Příjemce potvrdí přijatý datový paket a pošle token zpět odesílateli, odesílatel uvede token do stavu, že vše přišlo v pořádku a předá dalšímu síťovému uzlu na další vysílání dat
- Výhody: 
	- $ Zabraňuje vzniku kolizí
	- Spolehlivý
- Nevýhody: 
	- Je náročnější na výkon sítě – uzel musí zkoumat přijaté zprávy, zda jde o data nebo token
	- Každý uzel má zaručený přístup k přenosovému médiu a při přenosu se vyžaduje potvrzení doručení dat
	- Velká latence
	- ! Když počítač, který má token zanikne - Zanikne i token - Musí se vygenerovat nový
		- @ Toto hlídá Aktivní monitor (některý z počítačů v kruhu, který má speciální schopnosti)