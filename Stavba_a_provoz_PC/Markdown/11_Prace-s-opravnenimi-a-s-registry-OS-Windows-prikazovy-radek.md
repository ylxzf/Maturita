---
tags:
  - OPS
---
![[9_Operacni-system#Definice_OS]]

## #Windows_Users
- $ #Administrator - Správce
	- @ Plný přístup k systému
	- @ Může instalovat programy, měnit nastavení systému, spravovat jiné účty
	- @ Používá se pro správu počítače
- $ #User - Uživatel
	- @ Může používat programy a měnit svá vlastní nastavení
	- @ Nemůže instalovat programy pro všechny uživatele nebo měnit systémová nastavení
- $ Guest - Host
	- @ Velmi omezený účet, určený pro **dočasné uživatele**
	- Nemůže instalovat programy ani měnit nastavení
	- Většinou vypnutý
- Jiné
	- $ Power User
		- Mezi User a Administrator oprávnění
		- Legacy account
			- Už se nepoužívá
	- $ Systémové účty
		- např. Local Service, Network Service
			- používá je Windows pro vnitřní služby, ne pro běžné uživatele

### Vytvoření účtu
- Win + R ->  `lusrmgr.msc`
- V CMD: `net user username password /add`

## #Windows_Groups
- $ Users
- $ Administrators
- Power Users
- Guests
- Remote Desktop Users

## Uživatelské prostředí
- GUI
	- Windows Desktop Environment
- TUI
	- MS-DOS
## Windows atributy - #RASH
- $ R - Read-only
- $ A - Archive
- $ S - System
- $ H - Hidden

## Registry
- $ Souborová databáze, do které Windows ukládá veškerá nastavení
- Poprvé se objevily ve Windows 3.11
- Win + R -> `regedit`

## CMD - příkazy
- Příkazy pro správu souborů a složek:
	- @ `dir` - Zobrazí seznam souborů a složek v aktuálním adresáři
	- @ `cd` - Změní aktuální adresář
	- @ `md` / `mkdir` - Vytvoří nový adresář
	- @ `rm` / `rmdir` - Odstraní prázdný adresář
	- @ `del` - Odstraní soubor
	- @ `copy` - Zkopíruje soubor
	- @ `move` - Přesune soubor nebo složku
	- @ `ren` - Přejmenuje soubor nebo složku
- Příkazy pro práci s textem a soubory
	- @ `echo` - Zobrazí text v příkazovém řádku
	- @ `type` - Zobrazí obsah souboru
	- `find` - Vyhledá text v souboru
- Příkazy pro správu uživatelů
	- @ `net user` - Zobrazí seznam uživatelských účtů na počítači
	- @ `net user username /add` - Vytvoří nového uživatele
	- @ `net user username password` – Změní heslo uživatele
	- @ `net localgroup` - Zobrazí místní uživatelské skupiny.

## License
- $ Windows 10 Home
	- Základní edice pro běžné uživatele
- $ Windows 10 Pro
	- Umožňuje všechny funkce, které W10 nabízí
	- Obsahuje BitLocker, vzdálenou plochu, připojení k doméně atd.
- Windows 10 Enterprise
	- Určený pro velké firmy s rozšířenou správou a bezpečnostními funkcemi

## Instalace Driverů (Ovladačů)
- $ Win + R -> `devmgmt.msc`
- $ Najdeme zařízení pro které chceme získat drivery -> Properties -> Details -> Hardware IDs
- ![[Pasted image 20250510230251.png]]