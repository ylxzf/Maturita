---
tags:
  - HW
---
## Konektory na MB
### Zvuková karta
- $ Růžový
	- Mikrofon
- $ Zelený
	- Sluchátka / Přední levý a pravý reproduktor
- $ Modrý
	- Line in
	- Pro nahrávání audia
- Šedý
	- Boční levý a pravý reproduktor
- Černý
	- Zadní levý a pravý reproduktor
- Žlutá
	- Centrální reproduktor a subwoofer

### PS/2
- 6kolíkový konektor mini-DIN
- $ Pro připojení myši a klávesnice (dnes USB)
- ![[Pasted image 20250508224438.png]]

### eSATA
- $ Pro připojení vnějších datových zařízení (externí disky)
- ![[Pasted image 20250508224853.png]]
- ![[Pasted image 20250508224907.png]]

### S/PDIF
- S/PDIF - Sony/Philips Digital Interface
- $ Přenos digitálně kódovaného zvukového signálu
- ![[Pasted image 20250508225118.png]]

### HDMI
- HDMI - High Definition Multimedia Interface
- Rozhraní pro přenos nekomprimovaného obrazového a zvukového signálu v digitálním formátu
- ![[Pasted image 20250508225342.png]]

### RS232
- $ Sériový port
- Vybudován kolem UART (Universal Asynchronous Receiver / Transmitter)
	- Univerzální obvod
- $ Obousměrný, plně duplexní (obousměrná komunikace může probíhat současně) interface
- 2 provedení
	- 9 pinů
	- 25 pinů
- $ Konektor v počítači vždy měl kolíky
- Kontinuální přenos složený ze:
	- Start bitu
	- 5 - 8 datových bitů
	- Nepovinně z paritního bitu
	- Stop bitu
- ![[Pasted image 20250508230353.png]]

### LPT
- $ Paralelní port
- Režimy činnosti: 
	- SPP - Standard Parallel Port
		- Tiskárny
	- EPP - Enhanced Parallel Port
		- HDD, CD-ROM, ZIP disky
	- ECP - Extended Capability Port
		- Scannery a výkonné tiskárny
- Původně jednosměrný, později obousměrný
- ![[Pasted image 20250508230747.png]]

### USB
- USB - Universal Serial Bus
- $ Sériový port
- Moderní způsob připojení periferií k počítači
- technologie Plug & Play
- Verze: 
	- USB 1.1
		- 1,5 - 12 Mbps
	- USB 2.0
		- 480 Mbps
	- USB 3.1 1st gen
		- 5 Gbps
	- USB 3.1 2nd gen
		- 10 Gbps
	- USB-C
		- Výkon až 100W
- $ Jedno zařízení je Master

### FireWire
- $ Sériový port
- ![[Pasted image 20250508231605.png]]

### Bezdrátový přenos
- IrDA
	- Přenos pomocí IR (infra-red) záření
- Bluetooth
	- Rádiové spojení v pásmu 2,4 GHz
	- Rychlost až 24 Mbps
- Wi-Fi - Wireless Fidelity
	- Pracuje v pásmu 2,4 nebo 5 GHz
	- Rychlost až 1800 Mbps

## Sběrnice
- Sběrnice - Bus
- $ Skupina signálových vodičů
- $ Má za účel zajistit přenos dat a řídících povelů mezi dvěma a více elektronickými zařízeními
- Přenos dat se řídí stanoveným protokolem
- $ Slouží pro připojení různých zařízení k základní desce
- Dělení sběrnic:
	- Sériové
	- Paralelní
- Dělení vodičů sběrnic
	- Řídící
	- Adresové
	- Datové
- Parametry sběrnic
	- Šířka přenosu
	- Maximální frekvence

### ISA
- ISA - Industry Standard Architecture
- Sběrnice pro rozšiřující karty, která byla vyvinuta firmou IBM
- $ Adresová část sběrnice měla šířku až 24 bitů
- $ Datová část sběrnice měla šířku 16 bitů
- Zastaralá sběrnice - v současné době se MB s ISA sloty nevyrábějí
- ![[Pasted image 20250508232751.png]]

### EISA
- EISA - Extended Industry Standard Architecture
- $ Adresová část sběrnice měla šířku 32 bitů
- $ Datová část sběrnice měla šířku 32 bitů
- Lze vložit i ISA karty
- ![[Pasted image 20250508233014.png]]
- ![[Pasted image 20250508233025.png]]

### VESA Bus
- VESA - Video Electronics Standards Association
- $ Slot pro grafické karty
- Standard lokální sběrnice - VESA Local BUS -> VL-Bus
- $ Přímý přistup do systémové paměti - #DMA 
- $ Šířka 32bitů
- ![[Pasted image 20250508233432.png]]

### PCI
- PCI - Peripheral Component Interconnect
- $ Paralelní přenos dat
- $ Šířka 32 nebo 64 bitů
- Verze:
	- PCI 2.2
	- PCI 2.3
	- PCI 3.0

### PCI-X
- PCI-X - PCI Extended
- $ Zpětně kompatibilní s PCI 2.3
- Šířka 64 bitů
- ![[Pasted image 20250508234015.png]]

### AGP
- AGP - Accelerated Graphics Port
- Point-to-point spoj
- Úprava sběrnice PCI
- $ Odstranění arbitrážního obvodu
- $ Šířka 32 bitů

### PCIe
- PCIe - PCI Express
- $ Náhrada za starší standardy PCI, PCI-X, AGP
- ! Komunikuje **sériově** pomocí paketů
- Verze: 
	- PCIe x1, PCIe x4, PCIe x8
		- Síťové karty, rozšiřující konektory, zvukové karty, modemy, apod.
	- PCIe x16
		- Grafické karty

---

![[3_Ulozna-zarizeni#HDD - Rozhraní]]
