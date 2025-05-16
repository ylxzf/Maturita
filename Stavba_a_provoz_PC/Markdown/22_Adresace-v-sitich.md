---
tags:
  - POS
---
## MAC address
- MAC - Media Access Control
- $ Jedinečný identifikátor síťového zařízení
	- První polovina - 1-24 bitů je určen OUI
	- Druhá polovina - 25-48 je specifická na NIC 
- Je přiřazována síťové kartě (NIC - Network Interface Card)
- Ve Window se jmenuje "Fyzická adresa"
- $ Vyskytuje se na L2 ISO/OSI
- $ Skládá se ze 48 bitů
- $ Šestice dvojciferných hexadecimálních čísel oddělených pomlčkami, dvojtečkami nebo mezerami nebo tři skupiny čtyř hexadecimálních čísel
- Notace
	- @ 01:23:45:67:89:ab
		- Často na Linuxu nebo MacOS
	- @ 0123.4567.89ab
		- Často na CISCO zařízení
	- @ 01-23-45-67-89-ab
		- Často na Windows
- Zjištění MAC adresy
	- Windows - `ipconfig /all`, `getmac`
	- Linux - `ifconfig`
- ![[Pasted image 20250516013325.png]]

---

## IP address
- IP - Internet Protocol
- $ Číslo, které jednoznačně identifikuje síťové rozhraní v počítačové síti
- $ IP adresa slouží k rozlišení síťových rozhraní připojených k počítačové síti
- Síťovým rozhraním může být síťová karta, ale může se jednat i o virtuální zařízení (loopback, rozhraní pro virtuální počítač…)
- Veškerá data jsou mezi síťovými rozhraními přenášena v podobě IP datagramů
- $ Vyskytuje se na L3 ISO/OSI
- Jelikož by pro běžné uživatele počítačových sítí bylo velice obtížné pamatovat si číselné adresy, existuje služba DNS (Domain Name System), která umožňuje používat snadněji zapamatovatelná doménová jména počítačů, která jsou automaticky převáděna na IP adresy
### IPv4
- 32bitové číslo
- $ Zapsáno po jednotlivých bajtech, oddělený tečkami
	- @ Hodnoty jednotlivých bajtů se zapisují v desítkové soustav
- $ Skládá se z NET ID a HOST ID
	- ![[Pasted image 20250516013802.png]]
- $ Maska
	- @ Určuje hranici mezi adresou podsítě a počítače
	- @ Jedná se o 32bitovou hodnotu zapisovanou stejně jako IP adresa
	- @ V binárním tvaru obsahuje jedničky tam, kde se v adrese nachází část síťová (NET ID) a (HOST ID) nuly tam, kde je počítač
	- @ Všechny PC, co patří do stejné sítě, mají stejnou NET ID
	- Speciální masky
		- /32 – maska pouze s jedním rozhraním v síti
		- /31 – síť s dvěma rozhraními dvojbodový spoj bez broadcastu
		- /30 – dvojbodový spoj s broadcastem
		- /0 – nezadaná hodnota nebo síť pouze jedna kde je $2^{32}$ rozhraní
- $ Třídy
	- ![[Pasted image 20250516013847.png]]
- Speciální vyhrazené adresy
	-  0.0.0.0 – adresa patří do třídy A a popisuje všechny adresy (0.0.0.0 výchozí brána u směrovačů), nebo také může znamenat nedefinovanou adresu
	- 255.255.255.255 – společný broadcast pro všechny sítě
	- 127.0.0.1 – local loop back (= slouží k testování síťové komunikace sama se sebou, pokud je potřeba) IPv4, slouží jako virtuální rozhraní
- $ Privátní adresy
	- Jsou takové adresy, co by se neměly vyskytovat na internetu, každá třída má svoje privátní adresy
	- Třída A
		- @ 10.0.0.0 - 10.255.255.255
		- Maska 255.0.0.0
	- Třída B
		- @ 172.16.0.0 - 172.31.255.255
		- Maska 255.255.0.0
	- Třída C
		- @ 192.168.0.0 - 192.168.255.255
		- Maska 255.255.255.0
- $ Každá síť má adresu sítě (Nejmenší adresa v síti) a broadcast (Největší adresa v síti)
- IP aritmetika
	- $ Jsou operace (Matematické a logické) určené pro počítání s IP adresou
	- $ Adresa sítě
		- @ Dá se zjistit logickým součinem IP adresy a masky
			- @ Převedeme si celou adresu do binárního tvaru a použijeme AND
	- $ Adresa broadcastu
		- @ Dá se zjistit logickým součtem IP adresy a negací masky (**Wildcard**)
			- @ Převedeme si celou adresu do binárního tvaru a použijeme OR
	- Výpočet velikosti sítě
		- Zneguje se maska, použije se jako celé číslo a přičte se 1
		- Počítačům lze přidělit o 2 míň (jedna je broadcast a druhá adresa sítě).
- $ ARP - Address Resolution Protocol
	- @ Pomocí IPv4 adresy můžeme zjistit MAC adresu jiného zařízení
- Dělení sítí
	- Důvod je si rozdělit adresy podle potřeby na místnosti
	- ! Každým dělením přicházíme o dvě adresy
	- ![[Pasted image 20250516015343.png]]
### IPv6
- 128bitové číslo
- $ Důvod vzniku IPv6 bylo kvůli nedostatku adres IPv4
- $ 8 skupin 4 hexadecimálních číslic
- Libovolný počet po sobě následujících skupin 0000 může být nahrazen dvěma dvojtečkami
- Tři druhy vysílání
	- Individuální (unicast)
	- Skupinové (multicast)
	- Výběrový (anycast náhrada za broadcast u IPv4)
- Podporuje šifrování
- Maska se píše pomocí CIDR notace
	- např. fe80::/10
- Vyhrazené adresy
	- @ :: /128 – nedefinovaná adresa
	- @ :: /0 – popisuje všechny adresy
	- @ ::1 /128 – loop back
	- @ Fe80:: /10 – lokální adresy
	- Ff00:: /8 – multicast adresa
	- 64:ff9b:: /96 – vložené adresy IPv4 na konci
	- 2000:: /2 – unikátní na světě
- ![[Pasted image 20250516020213.png]]

---

## Porty
- $ Číslo 0 až 65535
- $ Logický číselný identifikátor, který určuje, která aplikace nebo služba má zpracovat síťovou komunikaci na zařízení
- $ Na transportní vrstvě se používají čísla portů na rozlišení jednotlivých služeb (adresa na transportní vrstvě)
- $ Vyskytují se na L4 ISO/OSI
- Využívaný u TCP a UDP
- Dělení
	- @ Well known ports (0-1023)
		- Rezervované pro základní síťové služby a protokoly
	- @ Registered ports (1024-49151)
		- Používané různými aplikacemi a softwary
	- @ Dynamic ports (49151-65535)
		- Dočasné porty, které si vybírá operační systém


---

## Aplikační adresa
- Adresa je zde složena z URI (URL, URN) a je ve formě textu
### URL
- URL - Uniform Resource Loader
- Specifikuje adresu a způsob přístupu ke zdroji
### URN
- URN - Uniform Resource Name
- Jméno zdroje, které ho trvale identifikuje, bez informace o lokaci
### URI
- URI - Uniform Resource Identifier
- Obecný identifikátor zdroje, může být buď URL nebo URN

![[Pasted image 20250516022101.png]]