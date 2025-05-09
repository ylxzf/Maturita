---
tags:
  - HW
---
# Základní deska
- $ Základní část PC
- Anglicky Motherboard/Mainboard
- Osazená elektronickými součástkami a konektory
### Hlavní úlohy:
- $ Propojení všech komponentů počítače
- Poskytnout datové cesty
- Distribuovat napájení

### Umožňuje:
- Zapojení CPU a RAM do určených patic
- Připojení rozšiřujících karet do rozšiřujících slotů (ISA, PCIe, AGP, PCIe)
- Obsahuje nezávislou paměť ROM s #BIOS (spouští při startu PC)

### Hlavní části ZD:
- Socket
- Patice RAM
- Chipset
	- U starších počítačů - northbridge a southbridge
	- Dnes jsou integrovaný do jednoho čipu
- Čip s BIOSem
- Konektory sběrnic (PCI, AGP, PCIe, SATA, IDE, USB)
- Baterie pro zálohování nastavení v CMOS paměti
- Integrované prvky
	- Zvuková karta, síťová karta

### Typy základních desek
- $ AT - Advanced Technology
	- Předchůdce ATX
	- ! Musí mít AT zdroj
	- U desek AT se muselo téměř vše dokupovat ve formě rozšiřujících karet
	- ![[Pasted image 20250508192220.png]]
- $ ATX - Advanced Technology Extended
	- ! Musí mít ATX zdroj
	- Umožňuje spustit počítač stiskem klávesy nebo tlačítka na myši
	- Wake on LAN
		- Musí deska podporovat
	- ![[Pasted image 20250508193451.png]]
- $ micro ATX - Micro Advanced Technology Extended
- $ mini-ITX - Mini Information Technology Extended
	- Komponenty často chlazeny pasivně
- BTX - Balanced Technology Extended

### Zařízení integrovaná do MB
- Grafická karta (u starších desek)
- Síťová karta
	- Umožňuje propojit počítač k jiným počítačům prostřednictvím počítačové sítě
	- 10/100/1000 Mbps
- Zvuková karta
	- Karta obsahuje zvukový čip, který provádí digitálně analogový převod nahraného nebo generovanégo digitálního zvuku

---
# #BIOS
- BIOS - Basic Input Output System
- Používá MBR (Master Boot Record)
- $ Umožňuje komunikaci připojených hardwarových
	- Pak může být zaveden operační systém, kterému je pak předáno další řízení počítače
- Firmware
	- @ Permanentní software
	- ! #Nevolatilní Read-Only Memory
- $ Obsahuje #SETUP
	- Nastavení je uloženo ve #volatilní paměti
- $ Nástupce BIOS -> EFI (Extensible Firmware Interface)
### #UEFI
- UEFI - Unified Extensible Firmware Interface
- Používá GPT (GUID Partition Table)
- Od Windows 8
- $ Umožňuje Secure Boot
- Pro spuštění starších OS je nutná emulace BIOSu pomocí CSM (Compatibility Support Module)
- Po spuštění PC probíhá vše stejně
- ! Boot je odlišný
	- UEFI má vlastní zavaděč
		- v něm jsou uloženy zavaděče všech OS
	- Tomuto zavaděči je vyhrazen vlastní oddíl ESP (EFI System Partition)
- Startuje rychleji a je odolnější proti chybám

---
# #CPU
- CPU - Central Processing Unit
- Složitý sekvenční integrovaný obvod
- Nachází se na základní desce
- $ Čte z paměti strojové instrukce a na jejich základě vykonává program
- Využívá strojový kód (Machine code)
	- Každá architektura procesorů využívá jiný strojový kód (x86, ARM)

### Obsahuje: 
- #Řadič/Řídící_jednotka
- #Sada_registrů
- 1 nebo více #ALU (Arithmetic logic unit)
- 1 nebo více #FPU (Floating-point unit)

### Základní architektura procesoru
![[Pasted image 20250508201835.png]]
### #Řadič/Řídící_jednotka
- $ Zajišťuje řízení činnosti procesoru v návaznosti na povely programu
	- Načítání strojových instrukcí
	- Dekódování strojových instrukcí
	- Načítání operandů instrukcí z operační paměti
	- Ukládání výsledků

### #ALU
- ALU - Arithmetic Logic Unit (Aritmeticko logická jednotka)
- $ Provádí s daty aritmetické a logické operace

### #FPU
- FPU - Floating Point Unit (Jednotka plovoucí čárky)
- $ Provádí operace v plovoucí řádové čárce

### #Sada_registrů
- $ Slouží k uchování operandů a mezivýsledků
- Přístup do registrů je velmi rychlý
- Dělení:
	- Obecné
		- Pracovní
		- Univerzální
	- Řídící
		- Čítač instrukcí
		- Stavové registry
		- Registr vrcholu zásobníku
		- Indexové registry
- $ Bitová Šířka pracovních registrů je jednou ze základních charakteristik procesoru

### Výrobci procesorů
- AMD
- Intel
- Qualcomm
- ARM

### Dělení procesorů
- Podle šířky slova v bitech
	- 4, 8, 16, 32 a 64 bitů
- Podle počtu jader
	- Jednojádrové
	- Vícejádrové
- Podle vnitřní architektury
	- RISC (Reduced Instruction Set Computer)
	- CISC (Complex Instruction Set Computing)
- Podle patice procesoru
	- PGA - Intel
	- LGA - AMD

### Harvardská architektura
- $ Fyzicky odděluje paměť programu a dat a jejich spojovací obvody

## Procesory

### Intel 4004
- 4 bitový mikroprocesor
- $ První obchodně úspěšný mikroprocesor
- Harvardská architektura
### Intel 8086
- 16 bitový procesor
- 2 jednotky
	- Sběrnicová jednotka - BUI
	- Vykonávací jednotka - EU
- 14 16bitových registrů
- $ Adresování operační paměti - segmentace

### #Intel_80286
- 16 bitový mikroprocesor
- Architektura x86
- Dokázal adresovat 16MB paměti
- 4 nezávislé paralelně pracující jednotky
	- Sběrnicová jednotka - BU
	- Instrukční jednotka - IU
	- Prováděcí jednotka - EU
	- Adresovací jednotka - AU
- $ #Chráněný_režim
	- @ Umožňuje zajistit, že spuštěný program nemůže zasahovat mimo svůj vymezený prostor
	- Úrovně
		- 0 - jádro operačního systému
		- 1 - služby poskytované operačním systémem
		- 2 - systémové programy a podprogramy z knihoven
		- 3 - uživatelské operace

### #Intel_80386
- 32 bitový mikroprocesor
- Maximální velikost operační paměti 4096MB (4GiB)
- $ 3 módy činnosti
	- Reálný
	- Chráněný
	- Virtuální 8086
- 6 paralelně pracujících jednotek
	- Sběrnicová jednotka
	- Jednotka před výběru instrukcí
	- Instrukční jednotka
	- Prováděcí jednotka
	- Segmentační jednotka
	- Stránkovací jednotka
- $ #Stránkování
	- @ způsob, jak počítač přesouvá části paměti (stránky) mezi operační pamětí a diskem, když dojde volná operační paměť

### #Intel_80486
- 32 bitový mikroprocesor
- Pro počítače typu AT
- 8kB interní cache
- $ Matematický koprocesor - DX
	- Je to #FPU 
- Pětistupňový pipeline

### #Intel_Pentium
- 32 bitový mikroprocesor
- 64 bitová datová sběrnice
- $ Superskalární architektura
	- Za určitých okolností byl procesor schopen během jednoho strojového taktu dokončit až 2 instrukce

### AMD K6-2
- 32 bitový mikroprocesor
- $ 3DNow!
	- Operace v plovoucí desetinné čárce v 3D aplikacích

### AMD Athlon
- 32 bitový mikroprocesor
- $ HyperTransport
	- Vysokorychlostní plně duplexní "point to point" spoj mezi integrovanými obvody

### #Intel_Pentium_4
- 32 bitový mikroprocesor
- $ Hyperpipeline
	- Velmi hluboká instrukční pipeline, navržena tak, aby byla schopna dosáhnout velmi vysokých frekvencí (plánováno 10GHz)
- $ #Hyper-threading
	- @ Umožňuje procesoru tvářit se jako dva logické procesory

### Intel Core i3
- $ Určen pro levnější stolní počítače s jedním procesorem a notebooky
- Nejméně výkonné, nejméně úsporné
- U některých modelů integrované grafické jádro

### Intel Core i5
- $ Určen pro střední třídu počítačů, levné jednoprocesorové servery a běžné stolní počítače
- U některých modelů integrované grafické jádro

### Intel Core i7
- $ Určen pro víceprocesorové servery a výkonné stolní počítače
- Všechny modely podporují #Hyper-threading 

### Intel Core i9
- $ Určen pro 3D animace a vědecké výpočty
- $ Nejvýkonnější
- $ #Turbo_Boost
	- @ Možnost automaticky zvednout frekvenci využívaného jádra
- Vysoká spotřeba

### ARM
- ARM - Advanced RISC Machine
- Uplatnění:
	- Mobilní telefony
	- Herní konzole
	- atd.
---
# RAM
- Dělení:
	- Podle přístupu k buňkám paměti
	- Podle možnosti změny dat
	- Podle technologie realizace paměťové buňky nebo technologie výroby
	- Podle organizace paměti
- Primárně dělíme na:
	- @ ROM (Read Only Memory)
	- @ RWM (Read Write Memory)
- $ Aby bylo možné paměť použít jako paměť operační, musí umožňovat čtení i zápis (RWM)
	- Častěji je označována jako RAM
		- Obecné označení pro libovolná (polovodičová) paměť
		- @ Je #volatilní - Po ztrátě napětí se veškeré informace v ní uložené ztratí

### Dělení podle principu činnosti:
#### Statické
- $ Paměťová buňka SRAM je realizována jako bistabilní klopný obvod (vždy 1 ze 2 stavů)
- Rychlejší přístup než DRAM
#### Dynamické
- $ V paměti DRAM je informace uložena pomocí elektrického náboje na kondenzátoru
	- @ Náboj má tendenci se vybíjet -> je nutno provádět refresh k oživení buňky
- Buňka DRAM je jednodušší a menší než SRAM

### ROM
- ROM - Read-Only Memory
- $ Data jsou uložena trvale
- Jsou #nevolatilní
- Určené pouze ke čtení
#### PROM
- PROM - Programmable Read-Only Memory
- $ Obsah programován "přepalováním" propojek elektrickým impulsem
#### EPROM
- EPROM - Erasable Programmable Read-Only Memory
- $ Obsah programován elektricky
- $ Mazán UV světlem
#### EEPROM
- EEPROM - Electrically Erasable Programmable Read-Only Memory
- $ Obsah programován i mazán elektricky

### DIPP
- DIPP - Dual Inline Pin Package
- Integrované obvody osazené přímo na základních desce
- Kapacita 256kB
### SIPP
- SIPP - Single Inline Pin Package
- Druhá generace pamětí DRAM
- Datová šířka 8 bitů
- Kapacita 256kb, 1MB, 4MB
- 30 pinů
### SIMM
- SIMM - Single Inline Memory Module
- Stejný jako modly SIPP, ale má vylepšený konektor
- 2 provedení
	- 30 pinové s datovou šířkou 8 bitů
	- 72 pinové s datovou šířkou 32 bitů
### DIMM
- DIMM - Dual Inline Memory Module
- $ Samostatné elektrické kontakty na každé straně modulu
- Jsou 64 bitové
- $ #CAS_latence
- Dělí se na: 
	- 168 pinové SDR
		- SDR - Synchronous Dynamic RAM
	- 184 pinové DDR
		- DDR - Double Data Rate
		- $ Přenáší data na obou hranách hodinového signálu
			- @ Zvyšuje efektivní výkon 2x bez nutnosti zvyšování frekvence sběrnice
	- 240 pinové DDR2
		- DDR2 - Double Data Rate 2
		- Taktována na dvojnásobku DDR
	- @ 240 pinové DDR3
		- DDR3 - Double Data Rate 3
	- @ 284 pinové DDR4
		- DDR4 - Double Data Rate 4

### SO-DIMM
- SO-DIMM - Small Outline Dual Inline Memory Module
- Zmenšený modul DIMM
	- Pro notebooky, tiskárny, routery, apod.