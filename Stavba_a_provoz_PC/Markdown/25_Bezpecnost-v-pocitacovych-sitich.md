---
tags:
  - POS
---
## Bezpečnost v počítačové síti
- Security x Safety
	- @ Security (zabezpečení) - Útok z venku
	- @ Safety (bezpečnost) - Útok zevnitř

### Důvody útoků
- $ Získání dat
- $ Sabotování - Omezení funkčnosti sítě
	- @ Zahlcení sítě
	- @ Překonfigurováni sítě

---

## Řešení
### Základní bezpečnostní předpoklady
- $ Nepovolit fyzický přístup k HW
- $ Vypínání neaktivních portů

### Port Security
- $ Kontroluje, zda pakety přichází z povolené MAC adresy
- Pro nastavení Port security musí být port ve statickém módu
- Volí se, co se děje při porušení pravidel, tedy pokud přijde komunikace z MAC adresy, která není povolena
	- Default je Shutdown
	- Možnosti:
		- Protect
		- Restrict
		- Shutdown

### Access Control List - ACL
- $ ACL - seznam řízení přístupu
- $ Sekvenční (řazený) seznam pravidel
- $ Seznam pravidel, která řídí přístup k nějakému objektu
- Nová pravidla se přidávají vždy na konec seznamu
- $ Je dobré umísťovat více specifická pravidla na začátek a obecná (subnety apod. globální) na konec
- $ Číselné
	- @ Jsou označeny číslem a podle tohoto jakou má hodnotu jsou but standardní nebo rozšířené
	- ! Nevýhoda číselných je jejich zpráva nedají se libovolně mazat takže většinou pokud chceme provést změnu tak musíme celý smazat
	- Standardní - Standard
		- Kontrolují pouze zdrojovou adresu
	- Rozšířený - Extended
		- Kontrolují obě adresy a i další vlastnosti výších vrstev protokol, porty
- $ Pojmenované
	- @ Každý list má své jméno
	- @ Umožňuje upravovat či mazat jednotlivá pravidla v ACL
	- Standardní - Standard
	- Rozšířený - Extended

### IDS
- IDS - Intrusion Detection System (Systém pro detekci průniku)
- $ Obranný systém, který monitoruje síťový provoz a snaží se odhalit podezřelé aktivit
- Hlavní funkce:
	- Detekce neobvyklých aktivit, které by mohly vést k narušení bezpečnosti operačního systému nebo počítačové sítě a též možný aktivní zásah proti nim
	- Upozornění správce
- Méně náročný na HW než IPS
### IPS
- IPS - Intrusion Prevention System (Systémy pro prevenci průniku)
- $ Snaží se předcházet útokům, aby k nim vůbec nedošlo
- Hlavní funkce
	- Identifikace škodlivé činnosti
	- Zaznamenávání informací o jejím průběhu
	- Následném blokování této činnosti a také její nahlašován
	- Upozornění správce

### Firewall
- $ Bezpečnostní systém, který filtruje a kontroluje síťový provoz
- $ Určují se směry IN, OUT
- SW
	- @ Jako aplikace nebo služba v OS
	- @ Výhoda je že přesně ví jaké aplikace chce komunikovat
- HW
	- $ Samostatný aktivní sítový prvek, který má minimálně dva konektory
	- ! Nepozná přesně jaká aplikace chce komunikovat
		- @ Vidí jen adresu a port a protokolu
	- $ Výhoda je že chrání celou sít (vice zařízení), nejen jednoho konkrétního klienta

### Proxy server
- $ Prostředník mezi klientem (uživatelem) a serverem (cílovým serverem)
- $ Přijímá požadavky od klienta a sám je odesílá na server
- $ Přijaté odpovědi z internetu předává zpět klientovi
- Výhody:
	- Zlepšuje bezpečnost (filtrování obsahu, blokování nebezpečných stránek).
	- Zvyšuje rychlost díky ukládání často navštěvovaných stránek (cache).
	- Skrývá IP adresu uživatele (anonymita).

![[3_Ulozna-zarizeni#RAID]]

![[8_Napajeni-diagnostika-a-testovani-PC#Záložní zdroje - UPS]]

![[Stavba_a_provoz_PC/Markdown/Extra#Autentizace|Extra]]
![[Stavba_a_provoz_PC/Markdown/Extra#Autorizace|Extra]]

---

## Typy útoků
### DoS
- DOS - Denial of Service (odepření služby)
- $ Útok, který způsobí přetížení cílového serveru nebo sítě
- $ Cílem je zabránit legálním uživatelům v přístupu ke službám
- $ Útok pochází z jednoho zdroje
### DDoS
- DDOS - Distributed Denial of Service (distribuované odepření služby)
- $ Podobný útok jako DoS, ale pochází z více zdrojů najednou
- Je mnohem těžší ho zastavit kvůli velkému počtu útočníků

### MitM
- MitM - Man in the Middle (útok prostředníka)
- $ Může odposlouchávat, zachytávat a měnit přenášená data, aniž by si toho obě strany všimly
- Často se využívá na nezabezpečených sítích nebo při slabém šifrování
- Cílem je získat citlivé informace
