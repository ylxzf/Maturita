---
tags:
  - OPS
---
![[9_Operacni-system#Definice_OS]]

## Síťový OS
- $ OS, které je přizpůsobeno tomu, aby poskytovalo síťové služby ostatním počítačům.

---

## Služby síťového OS
- $ NAS - Network Attached Storage
- $ #Autentizace #Autorizace 
	- #Active_Directory, Pgina
- Tiskové služby
	- Print over LAN

![[9_Operacni-system#Služby_OS]]

---

## Dělení
### Vyhrazené x Nevyhrazené
- Vyhrazené
	- $ Vyhrazené podporují jen síťové služby a nedá se na nich pracovat.
- Nevyhrazené
	- $ Nevyhrazené fungují jako server, ale i jako workstation
### Peer-to-peer (P2P) x Klient - Server
- P2P - Peer-to-peer
	- $ Je to decentralizovaný síťový model, ve kterým počítače fungují jako client i server zároveň
	- $ Všechny zařízení mají stejné pravomoci
	- $ Zařízení společně sdílejí data napřímo
	- Použití
		- @ Použití je Torrent, Distributed Computing, CDN
	- ![[Pasted image 20250511061325.png]]
- Klient - Server
	- $ Je to model, ve kterém je je nadřazený server, který poskytuje data Klientům, kteří si o ně žádají.
	- Klient
		- @ Někdo, kdo využívá službu serveru
	- Server
		- @ Někdo, kdo poskytuje službu
	- ![[Pasted image 20250511061315.png]]
### Výrobce
- $ Microsoft Windows Server
- $ Novell
- Red hat
- Cisco Internetwork OS - Cisco IOS

---

## Hardwarové požadavky na server
- $ Záleží co bude server dělat a jaké služby bude nabízet
- #Virtualizace
	- Dostatek procesorů pro, každou VM
	- SSD disky a #RAID
	- ~4GB RAM * Virtuál
- #Active_Directory
	- - Není potřeba moc paměti
	- Počet síťových karet, podle zatížení
- #IIS
	- Počet síťovek, podle zatížení
	- Procesor, RAM, disky

---

## Windows Server 2008/2012
- $ Operační systém navržený pro správu sítí a poskytování služeb více uživatelům ve firmách nebo datových centrech

### Instalace WS
- $ Fyzická nebo virtuální instalace
- ! Většinou se nainstaluje kombinace fyzické a virtuální instalace
	- @ Nainstaluje se WS fyzicky a dovnitř se nainstaluje WS virtuálně
		- Pomocí Hyper-V
			- Podporuje #Paravirtualizace, #Plná_virtualizace 
	- @ Používá se virtuální OS pro síťové služby.
		- HW nezávislost
- Verze
	- @ Standard - GUI/TUI
	- @ Datacenter - GUI/TUI
		- Podporuje více VM a má sofistikovanější virtualizační engine

## Doména
- $ Skupina počítačů sdílejících společnou adresářovou databázi
- Základní jednotka AD, tvoří ji min. 1 DC (Domain Controller)

### #Active_Directory 
- AD - Active Directory
- $ Správa domény
- ! Přidat počítač do AD může doménový správce, nebo uživatel s těmito oprávněními.
- ! Odebrat počítač z AD může lokální správce, doménový správce nebo uživatel s těmito oprávněními

### #IIS
- IIS - Internet Information Services
- $ Web server pro Windows Server

### Group Policy Managment Tool
- $ Úprava přístupu, přes celou organizace, všechny počítače a uživatele.
- Správa přes Group Policy Objects

---

## #DNS
- DNS - Domain Name System
- $ Funguje jako dictionary - každá doména má jedinečnou IP Adresu
	- **[www.example.com](http://www.example.com)** - 93.184.216.34
- $ DNS - Forward zone
	- Překlad IP adresy na hostname
- $ DNS - Reverse zone
	- Překlad hostname na IP

---

## Pojmy
- DHCP - Dynamic Host Configuration Protocol
	- Automatické přiřazování IP adres počítačům
