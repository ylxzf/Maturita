---
tags:
  - OPS
---
## #Zavedení_OS - Boot
- Proces kdy se operační systém zavede do #Operační_paměť 
1. $ Zapnutí PC
2. $ Z flash paměti se zavede inicializační kód BIOS
3. $ Provede se kontrola HW #POST 
4. $ BIOS najde zařízení, kde je zavaděč OS k dispozici a začne zavádět OS
	- Na začátku datového média se obvykle vyskytuje záznam s pevnou strukturou ( #MBR, #GPT )
5. $ Hledá se #Bootloader a pak se spouští
6. $ Načítá se jádro (kernel) OS
7. $ Spouští se systémové služby OS
8. $ Start UI
9. $ Přihlášení uživatele (jestli je OS #Multiuser)

### Média, která lze použít pro zavedení OS
- CD-ROM
- Floppy disk
- USB
- HDD
- LAN

### #Bootloader - zavaděč


## Více OS na jednom pevném disku

### Virtuálně 
- #Virtualizace 
- $ Typy virtualizace
	- @ #Emulace
		- Emuluje HW platformu aplikace, která se má spustit v emulátoru
	- @ #Paravirtualizace
		- Využívá prostředky hosta.
	- @ #Plná_virtualizace
		-  Virtualizuje veškeré HW prostředky, které potřebuje pro běh.
- Není třeba formátovat oblast HDD
- $ Procesor musí podporovat virtualizaci
	- AMD-V
	- Intel VT-x
### Fyzicky
- $ Disk se nejprve musí rozdělit na více oddílů - Každý OS vyžaduje svůj vlastní oddíl
	- U #MBR jenom 4 primární oddíly - 1 z nich Extended
		- Až 128 oddílů
	- U #GPT 128 oddílů
- $ Disky se dají rozdělit pomocí programů (GParted/Parted - Linux, Disk Managment - Windows) nebo příkazů (fdisk)
- ! Při instalaci Windows Multibootu se musí instalovat systémy od nejstarších

### Boot Manager
- $ Je program, který umožňuje výběr operačního systému nebo spouštění speciálních režimů (např. recovery mode) při startu počítače
- Umístěn v #MBR nebo EFI oddílu
- $ např. GRUB, Windows Boot Manager, Lilo (Linux Loader)
### Bez boot manageru
- $ OS se spouští se z oddíl který má příznak (flag) **boot** (nebo **active**)
	- Dělat to takhle pokaždé by bylo zbytečné a nepraktické -> Používají se Boot managery

### Vlastnosti oddílů HDD
- Typ
- Souborový systém
- Kapacita