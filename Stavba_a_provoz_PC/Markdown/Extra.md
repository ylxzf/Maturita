---
tags:
---

# #HW
### #POST 
- POST - Power On Self Test
- $ Diagnostický program, který kontroluje hardware v zařízení a jejich součinnost
- Využívá Beep kód
	- Zvukové znamení
	- Oznamuje určitou zprávu POST

### #SETUP
- $ Součástí BIOSu
- Umožňuje konfiguraci
- Výchozí nastavení je uloženo v nevolatilní BIOS paměti
	- Dá se k němu vždy vrátit
- Uživatelské nastavení se ukládá do volatilní paměti

### #Volatilní 
- Energeticky závislý
- $ Po ztrátě napětí se veškeré informace uložené v pamětí ztratí

### #Nevolatilní
- Energeticky nezávislý
- $ Po ztrátě napětí se informace uložené v pamětí **ne**ztratí

### #CAS_latence
- CAS - Column Address Strobe
- Doba mezi okamžikem, kdy paměťový řadič požádá paměťový modul o data uložená na nějaké jeho adrese, a okamžikem, než se tato data objeví na výstupních pinech paměťového modulu
- $ Udává se v počtu hodinových cyklů
	- Číslo je bezrozměrné

### #Sektor
- $ Nejmenší adresovatelná jednotka na HDD

### #DMA
- DMA - Direct Memory Access
- $ Režim, kdy má HW přímý přístup do operační paměti bez účasti procesoru

### #Antialiasing
![[Pasted image 20250509173241.png]]

### #Bitová_šířka
- $ Označuje počet bitů, které procesor nebo počítačová architektura může zpracovávat najednou
- $ Určuje velikost dat, se kterými procesor pracuje, a může ovlivnit výkon a možnosti systému

### #Architektura
- $ x86
	- RAM
		- Dokáže maximálně adresovat $2^{32}$ adres
		- Max $2^{32}$B = 4GB
- $ x64
	- 64bit OS dokážou spustit 64bitové i 32bitové aplikace
	- CPU x64
		- Moderní procesory
	- RAM
		- Dokáže maximálně adresovat $2^{64}$ adres
		- Max $2^{64}$B = 16EB (exabytes)

---

# #OPS 

### #Operační_paměť
- RAM (Random Access Memory) - RWM (Read Write Memory)
- Volatilní paměť
- $ Uchovává data a instrukce pro běžící programy

### #Disk
- $ Je medium na které se ukládají data
- např. Flash disk, SSD, HDD, floppy disk

### #Partition
- $ Je to oddíl disku, který je nezávislý na zbytku disku

### #Autentizace
- ! Ověření identity uživatele (např. přihlášení pomocí uživatelského jména a hesla).

### #Autorizace
- ! Určení, jaká práva nebo přístup k systémům má uživatel (např. co může upravovat nebo zobrazit).
---

# #POS 
