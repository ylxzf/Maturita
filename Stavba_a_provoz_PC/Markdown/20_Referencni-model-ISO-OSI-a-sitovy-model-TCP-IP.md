---
tags:
  - POS
---
## Referenční model ISO/OSI
- ISO/OSI - International Standards Organization / Open System Interconnection
- $ Referenční model - Popis, jak by měl být složitý systém uspořádán a jak jeho části spolupracují
- $ Hierarchický model  Každá vrstva má právě jednu nadřízenou a podřízenou
- $ Vrstvený model  Velký problém je rozdělen na několik menších
- $ Nemá reálnou implementaci
- $ Je to první model, který vytvořil koncept, podle kterého by se mohla řešit komunikace mezi počítači
- Pomáhá pochopit, kde v síti dochází k přenosu dat, a kde může vzniknout problém
- Sjednotit a vyřešit problémy v komunikaci mezi PC
- ! Koncepce ISO/OSI se prakticky vůbec neprosadila do praxe
- ! Reálném zapojení skutečné sítě se nazývá **architektura sítě**
- Řeší:
	- @ Jak se propojí PC
	- @ Jak se budou data posílat
	- @ Jak a co bude v hlavičce dat
	- @ Jak se komunikuje mezi sítěmi
	- @ Jak zajistit spolehlivost přenosu
	- @ Jak zajistí aby data měla stejný význam všude
	- ...
- $ PDU - Protocol Data Unit
- ![[Pasted image 20250515184715.png]]

### L1 - Fyzická vrstva - Physical layer
- $ PDU - Bit
- Nejnižší vrstva
- $ Zajistit přenos jednotlivých bitů mezi příjemcem a odesílatelem prostřednictvím fyzické přenosové cesty (kabel), kterou tato vrstva bezprostředně ovládá a zajistit fyzické propojení.
- $ Zařízení pracující na této úrovni nerozumí obsahu dat
- Zařízení pracující na této vrstvě: 
	- @ #Repeater
	- @ #Hub
- Funkce:
	- @ Zpracování signálu
	- @ Udržuje začátek a konec přenos
	- Lineární kódování
	- Bitová synchronizace v synchronní sériové komunikaci
	- Paralelní a sériový přenos
	- Synchronní, asynchronní a arytmický přenos
	- Přenos v základním a přeloženém pásmu
	- Poskytuje standardizované rozhraní fyzickému přenosovému
### L2 - Linková vrstva - Link layer
- $ PDU - Frame (Rámec)
- ! Zajišťuje bezchybnou komunikaci v rámci jedné sítě
- $ V této vrstvě jsou definovány přístupové metody k médiu
- $ Používá MAC adresy
- 2 podvrstvy: 
	- $ Vyšší podvrstva LLC (Logical Link Control)
		-  Zajišťuje úkoly celé původní linkové vrstvy (přenos celých rámců)
	- $ Nižší podvrstva MAC (Media Access Control)
		- Jsou implementovány přístupové metody
		- @ Zajišťuje fyzické adresování, řízení přístupu k médiu
		- @ Hardwarově závislá
- $ Rámec je rozdělen na hlavičku, data a patičku
	- Hlavička: 
		- @ Adresa odesílatele
		- @ Adresa příjemce
	- Patička: 
		- @ FCS - Frame Check Sequence
			- Používá se pro zjištění chyby
			- ! Rámce se číslují
- Zařízení pracující na této vrstvě: 
	- @ Bridge
	- @ Switch
-  Funkce:
	- @ Zajištění spolehlivost
	- @ Přístup ke sdílenému médiu
	- @ Řeší konflikty při vícenásobném přístupu ke sdílenému médiu
	- @ Řízení toku, aby vysílající nezahltil příjemce
### L3 - Síťová vrstva -  Network layer
- $ PDU - Packet
- $ Zajišťuje komunikaci mezi sítěmi
	- @ Routing (směrování)
- $ Síťová vrstva zajistí, že transportní vrstvě, která leží nad ní, připadá, že pracuje s jedinou rozsáhlou sítí
- $ IP adresy
- Paket se skládá z:
	- Hlavička
		- Index, IP adresa příjemce a odesílatele
	- Tělo
- Zařízení pracující na této vrstvě: 
	- @ Router
	- @ L3 Switch
-  Funkce:
	- @ Přijímá datové pakety od transportní vrstvy a rozhoduje, jak pakety doručit na základě adresy
	- @ Stará o síťové adresování
### L4 - Transportní vrstva - Transport layer
- $ PDU - Segment
- $ Porty
- Řízena OS
- Funkce:
	- Rozlišování různých příjemců a odesilatelů v rámci jednotlivých uzlů
	- @ Zajištuje spolehlivý přenos mezi dvěma koncovými uzly
	- @ Posílá oznámení o správném doručení dat a o chybě
### L5 - Relační vrstva - Session layer
- $ PDU - Bajty (soubor)
- $ Stará se o správu a synchronizaci relací mezi dvěma zařízením
-  Funkce:
	-  Zahajuje, ukončuje spojení a také ho udržuje
### L6 - Prezentační vrstva - Presentation layer
- $ PDU - Bajty (soubor)
- $ Jde o to, aby přenesená data měla pro příjemce stejný význam, jaký měla pro odesilatele.
- Zajišťuje
	- @ Správné kódování
	- @ Interpretaci - aby se správně zobrazovali znak
	- @ Šifrování
	- @ Kompresi
	- Stará se o potřebné konverze
### L7 - Aplikační vrstva - Application layer
- $ PDU - Bajty (soubor)
- $ Určuje, jak mají být data přebírána a předávána mezi jednotlivými aplikacemi.
-  Funkce:
	- @ Poskytuje aplikacím datový kanál pro komunikaci

---

## Síťový model TCP/IP
- $ Má reálnou implementaci
- $ Soubor protokolů, které říkají jak se budou data adresovat, přenášet, směrovat a přijímat.
- $ Je to praktický model
- ![[Pasted image 20250515230117.png]]

### Vrstva síťového rozhraní - Network Interface layer 
- $ Je složená z Fyzické a linkové vrstvy ISO/OSI model
- $ Definuje, jak se dat mají přenášet po přenosovém médiu
- Zodpovědná za přenos dat mezi dvěma zařízeními
### Síťová vrstva - Internet layer 
- $ Definuje, jak by měla probíhat komunikace mezí sítěmi a posílání paketů
- $ Stará se o to, aby se jednotlivé pakety dostaly od odesílatele až ke svému skutečnému příjemci, přes případné směrovače resp. brány
- Routování a adresování
- Spolehlivost by měl zajišťovat ten, kdo ji bude potřebovat
	- Tedy vyšší vrstvy, případně samotné aplikace
### Transportní vrstva - Transport layer 
- $ Komunikace mezi dvěma koncovými uzly, buď spolehlivým nebo nespolehlivým přenosem.
- Porty
- TCP - Transmission Control Protocol
	- Spolehlivý přenos
- UDP - User Datagram Protocol
	- Nespolehlivý přenos
### Aplikační vrstva - Application layer 
- $ Zajišťuje přístup aplikace k síti
- $ Formátování, Autentizace
- $ Složena z 5. až 7. vrstvy ISO/OSI

---

## Protokoly
### TCP
- TCP - Transmission Data Protocol
- $ Pracuje na transportní vrstvě
- Vlastnosti: 
	- Zajišťuje spolehlivý a spojovaný přenos
	- Služba se spojením, má fáze navázání spojení, přenos dat a ukončení spojení
	- Rozlišování aplikací pomocí portů
### UDP
- UDP - User Datagram Protocol
- $ Pracuje na transportní vrstvě
- Vlastnosti:
	- Zajišťuje nespolehlivý a nespojovaný přenos
		- Pro takové aplikace, které nepotřebují spolehlivost
	- Nemá fázi navazování a ukončení spojení
	- Rozlišování aplikací pomocí portů
### IP
- IP - Internet Protocol
- $ Pracuje na síťové vrstvě
- ! Zatímco u TCP a UDP se adresuje aplikacím tak u IP se adresuje fyzický počítač v síti
- Verze
	- #IPv4 - IP version 4
		- 32bitové adresy
	- #IPv6 - IP version 6
		- 128bitové adresy
		- Podpora bezpečnosti
		- ! Není zpětně kompatibilní s #IPv4
- Vlastnosti:
	- Nespolehlivý
		- Při nesprávném doručení paketů se nestará o nápravu
	- Nespojovaný
		- Spojení mezi uzly není pevně dáno, pakety se posílají různými cestami
### HTTP
- HTTP - Hyper Text Transfer Protocol
- $ Internetový protokol určený pro výměnu hypertextových dokumentů ve formátu HTML
- $ Vyhrazen TCP port 80 a 8080
### HTTPS
- HTTPS - HTTP Secure
- $ Slouží k přenosu **zašifrovaných** hypertextových dokumentů ve formátu HTML
- $ Vyhrazen TCP port 443
### FTP
- FTP - File Transfer Protocol
- $ Určen primárně pro přenos souborů
- $ Vyhrazen TCP port 21
### SMTP
- SMTP - Simple Mail Transfer Protocol
- $ Internetový protokol určený pro přenos zpráv elektronické pošty
- $ Vyhrazen TCP port 25
### DHCP
- DHCP  - Dynamic Host Configuration Protocol
- $ Používá se pro automatické přidělování IP adres prostřednictvím aktivních prvků sítě jednotlivým zařízením v počítačových sítích (PC, PDA, tiskárny, IP telefony…), čímž zjednodušuje jejich správu
- Vyhrazen UDP port 67 (server) a UDP port 68 (klienti)
### DNS
- DNS - Domain Name System
- $ Umožňuje překlad IP adresy na srozumitelnější doménové jméno počítače
- Vyžaduje existenci DNS serveru
	- Sdružuje databázi IP adres a jim přidělených doménových jmen počítačů v síti
- Vyhrazen TCP port 53 a UDP port 53
