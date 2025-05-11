---
tags:
  - OPS
---
![[9_Operacni-system#Definice_OS]]
## Linux
- $ Jádro (Kernel) OS je open-source
- $ Od #Intel_80286 
- #Multiuser systém
- #Multitask systém

## Distribuce
- $ Obsahují jádro a další programy potřebné pro spuštění, správu OS a další utility
- Každá je lepší pro něco jiného
- Distribuce
	- @ Ubuntu
	- @ CentOS
	- @ Debian
	- @ Linux Mint
	- Arch
- Live OS
	- $ GParted
	- $ CloneZilla
- Lokálně nainstalovaný

## Uživatelské rozhraní - UI
- $ GNOME
	- @ Používá ho defaultně Ubuntu
- $ KDE
	- @ Vše je plně customizovatelné
- Xfce

## Linux oprávnění
- $ Nastavujou se oprávnění pro 3 skupiny (UGO)
	- @ UGO - User (vlastník) Group (skupina) Other (ostatní)
- $ Příkaz `chmod` změní oprávnění souboru nebo adresáře v #Terminal 
	- @ r - read, w - write, x - executable
	- `chmod 644 file.txt` - Owner: rw-, Group: r--, Others: r--
- $ Příkaz `chown` mění vlastníka souboru nebo adresáře v #Terminal 
- ! Oprávnění x u adresáře - **možnost vstoupit do adresáře**
- ! Adresáře začínají na **d**
- ! Sticky bit - pouze vlastník souboru (ne ostatní uživatelé) může soubor v adresáři s tímto bitovým nastavením **smazat nebo přejmenovat**
	- @ `chmod +t /path/to/directory`

| Number | Permission | Sum   | Meaning                 |
| ------ | ---------- | ----- | ----------------------- |
| 0      | – – –      | 0+0+0 | žádná oprávnění         |
| 1      | – – x      | 0+0+1 | pouze spuštění          |
| 2      | – w –      | 0+2+0 | pouze zápis             |
| 3      | – w x      | 0+2+1 | zápis a spuštění        |
| 4      | r – –      | 4+0+0 | pouze čtení             |
| 5      | r – x      | 4+0+1 | čtení a spuštění        |
| 6      | r w –      | 4+2+0 | čtení a zápis           |
| 7      | r w x      | 4+2+1 | čtení, zápis a spuštění |

## #Terminal
- $ Obalový program, který spouští shell-
### Shell
- $ Shell je program, který interpretuje a vykonává příkazy
- $ Shell běží uvnitř terminálu
- $ Příkazový interpret
- $ Základní prostředek pro komunikaci uživatele se systémem
- ! Case-sensitive
- např. BASH (Bourne Again Shell)
### BASH program
- `.sh` soubor
- Musí začínat `#!/bin/bash`
- Spouští se pomocí: `./script.sh`
### Příkazy
- $ Instalace aplikací - závisí na distribuci
	- @ Ubuntu - `sudo apt install firefox`
	- Arch - `sudo Pacman -Syu firefox`
- $ Správa uživatelů
	- @ `useradd` - Přidání uživatele
	- `passwd` - Nastavení hesla
- $ Navigace
	- @ `cd` - Změní aktuální pracovní adresář
		- `cd ..` - Přejde o úroveň výše v adresářové struktuře
		- `cd ~` - Přejde do domovského adresáře aktuálního uživatele
	- @ `ls` - Zobrazí obsah aktuálního pracovního adresáře
		- `ls -l` - Zobrazení podrobného seznamu souborů s informacemi
		- `ls -a` - Zobrazení skrytých souborů
	- `pwd` - Zobrazení aktuálního pracovního adresáře
- $ Práce se soubory a adresáři
	- @ `cp` - Kopíruje soubory nebo adresáře
		- `cp zdroj cíl`
	- @ `rm` - Odstraňuje soubory nebo adresáře
		- `rm -r` - Odstraní adresáře a jejich obsah.
	- @ `mkdir` - Vytváří nový adresář
	- `mv` - Přesouvá nebo přejmenovává soubory a adresáře
		- `mv zdroj cíl` 
	- `rmdir` - Odstraňuje prázdný adresář
- $ Práce s textovými soubory
	- @ `cat` - Zobrazuje obsah souboru
	- @ `touch` - Vytvoření souboru
	- Editory
		- @ `nano` - Textový editor pro úpravu souborů v terminálu
		- @ `vim` - Pokročilý textový editor v terminálu, vhodný pro zkušenější uživatele
- $ Síťové příkazy
	- @ `ping` - Odesílá ICMP echo požadavky na danou adresu a zjišťuje, zda je dosažitelná
	    - ICMP - Internet Control Message Protocol
	- @ `ip` - Moderní nástroj pro správu síťových rozhraní a adres
		- `ip addr`
		- `ip route`
	- @ `ifconfig` - Zobrazuje a nastavuje síťová rozhraní (starší příkaz, stále používaný v některých distribucích)
- $ Nápověda
	- @ `man` - Zobrazení manuálu příkazu
		- `man cd`
	- @ `--help` za příkazem - Vyvolání nápovědy pro příkaz
	- `help` - Zobrazení všech příkazů