---
tags:
  - HW
---
## Grafické Karty
- $ Grafická karta se stará o grafický výstup na obrazovku
- $ Grafická karta může být integrovaná:
	- @ Na základní desce (IGP - Integrated Graphics Procesor)
		- Hodně low-end
	- @ V procesoru (APU- Accelerated Processing Unit)
- $ Nebo může být ve formě rozšiřující karty
### Sběrnice grafických karet
- ![[2_Rozhrani-a-konektory#ISA]]
-  ![[2_Rozhrani-a-konektory#EISA]]
-  ![[2_Rozhrani-a-konektory#VESA Bus]]
-  ![[2_Rozhrani-a-konektory#PCI]]
-  ![[2_Rozhrani-a-konektory#AGP]]
-  ![[2_Rozhrani-a-konektory#PCIe]]
### Parametry grafických karet
- $ Rozlišení
	- Udává se jako počet bodů v ose X krát počet bodů v ose Y
- $ Obnovovací frekvence
	- Určuje, kolikrát za vteřinu je grafická karta schopna aktualizovat obraz
- $ Barevná hloubka
	- Udává se jako 1 číslo -> říká kolik různých barev je karta schopna zpracovat
	- např. 24 bit, 32 bit
- $ Velikost paměti

### Součásti grafických karet
#### GPU
- GPU - Graphics Processing Unit
- $ Výpočetní jádro grafické karty
- Vyžaduje intenzivní chlazení a výkonný elektrický zdroj
#### Paměť
- Slouží k ukládání informací nutných pro grafické výpočty
#### RAMDAC
- RAMDAC - Random Access Memory Digital to Analog Converter
- Převodník digitálního signálu
#### Výstupy
##### VGA
- VGA - Video Graphics Array
- ! Analogový grafický vstup
- $ 15 pinů
- ! Liší se od RS232!!!
- Pro CRT monitory a jiné
- ![[Pasted image 20250509162805.png]]

##### DVI
- DVI - Digital Visual Interface
- $ Digitální grafický výstup
- ![[Pasted image 20250509163235.png]]

##### HDMI
![[2_Rozhrani-a-konektory#HDMI]]

##### Display Port
![[Pasted image 20250509163444.png]]


### Výrobci grafických čipů
- Nvidia Corp. (3dfx)
- AMD
- Intel

### Výrobci grafických karet
- ASUS
- EVGA
- MSI
- GigaByte
- Zotac

### Základní pojmy
#### Texel
- Texel - **TEXT**ture **EL**ement nebo **TEX**ture pix**EL**
- $ Základní jednotka textury
	- @ Textura je tvořena polem texelů
- Renderer mapuje texely do odpovídajících pixelů

#### Shader
- $ Počítačový program sloužící k řízení částí programovatelného grafického řetězce GPU
- Plně programovatelné součásti grafického čipu
- Stará se o zpracování obrazu s několika dalšími jednotkami
- Základní typy: 
	- Vertex shader
	- Pixel shader
	- Geometry shader
	- Shadery pro teselaci

##### Neunifikovaný shader
- Typy
	- Geometry shader
	- Vertex shader
	- Pixel shader
	- Tessellation shader
	- Compute shader
- $ Každá část čipu byla určena pro daný shader

##### Unifikovaný shader
- Umí zpracovávat pixel, vertex i geometry shader úlohy

### Zvyšování výkonu
- Spolupráce více grafických karet
- Technologie: 
	- @ CrossFire - AMD
		- Módy:
			- Supertiling - dlaždice
			- AFR - Alternate Frame Rendering (sudý/lichý snímek)
			- SFR - Scissors Frame Rendering (vodorovné půlsnímky)
			- Hybrid Crossfire (Spolupráce integrované a dedikované GPU)
	- @ SLI - Nvidia
		- Módy
			- SFR - Split Frame Rendering (vodorovné půlsnímky)
			- AFR - Alternate Frame Rendering (sudý/lichý snímek)
			- SLI #Antialiasing (vyhlazování)
			- Hybrid SLI
- 2 - 4 karty

---

## Zvukové karty
- $ Rozšiřující karta počítače pro vstup a výstup zvukového signálu
- $ 2 hlavní čipy:
	- @ Digitálně-analogový převod
	- @ Záznam analogového signálu (Digitalizace, Analogově-digitální převod) a uložení v číslicové podobě

### Digitalizace
- $ Provádí se pomocí vzorkování
	- @ V každém časovém intervalu se zjistí a zaznamená aktuální stav signálu - vzorek
	- @ Čím kratší je interval mezi vzorkováním, tím je vyšší vzorkovací frekvence -> bude pořízeno více vzorků a výsledný záznam bude kvalitnější
- Souvisí Shannonův-Nyquistův-Kotělnikovův teorém
	- "Přesná rekonstrukce spojitého, frekvenčně omezeného, signálu z jeho vzorků je možná tehdy, pokud byl vzorkován frekvencí alespoň dvakrát vyšší, než je maximální frekvence rekonstruovaného signálu."
- ! Vzorkovací frekvenci musí být alespoň 2x vyšší než je maximální frekvence rekonstruovaného signálu!!!
- Nejčastější vzorkovací frekvence
	- 11025 Hz - telefonní kvalita
	- 22050 Hz - rádio kvalita
	- 44100 Hz - CD kvalita
	- 48000 Hz - DVD kvalita
	- 96000 Hz - studiová kvalita

### Formáty uložení zvuku
- Nekomprimované
	- .wav
- Komprimované
	- Bezeztrátové
		- .flac, .ape
	- Ztrátové
		- .mp3, .wma

### Konektory na ZK
![[2_Rozhrani-a-konektory#Zvuková karta]]

---

## #Síťová_karta
- #NIC - Network Interface Controller
- $ Slouží ke vzájemné komunikaci počítačů v počítačové síti
- Nejčastěji integrovaná na základní desce

### Rychlosti síťových karet
- 10 Mbps - zastaralé
- 10/100 Mbps - zastaralé
- 10/100/1000 Mbps

### #MAC_Adresa
- MAC - Media Access Control
- $ Jedinečný 48bitový identifikátor každé ethernetové síťové karty
- Zjistit se dá pomocí příkazu: **ipconfig /all**

### #IP_Adresa
- IP - Internet Protocol
- $ Číslo, které identifikuje síťové rozhraní v počítačové síti
- Verze: 
	- @ IPv4
		- 32bitové adresy
		- 0.0.0.0 - 255.255.255.255
		- 2^32 adres - 4,3 miliard
	- @ IPv6
		- 128bitové adresy
		- 0000:0000:0000:0000:0000:0000:0000:0000 - ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff
		- 2^128 adres
- $ Privátní adresy:
	- Třída A:
		- @ 10.0.0.0 - 10.255.255.255
		- 16646144 adres
	- Třída B:
		- @ 172.16.0.0 - 172.31.255.255
		- 1040384 adres
	- Třída C:
		- @ 192.168.0.0 - 192.168.255.255
		- 65024 adres

### Kabeláž pro propojení PC do sítí
- $ Starší sítě se propojovaly pomocí koaxiálního kabelu
- $ Dnes TP (twisted pair - kroucená dvojlinka)

#### Kroucená dvojlinka
- Dělení podle způsobu zapojení
	- @ Přímá - Straight Through
	- @ Křížená - Crossover
- Dělení podle stínění
	- @ Nestíněná - UTP (Unshielded Twisted Pair)
	- @ Stíněná - STP (Shielded Twisted Pair)

#### Optické vlákno
- Světlo
- Velmi rychlé