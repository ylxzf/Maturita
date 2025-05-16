---
tags:
  - OPS
---
## Dělení disků
- $ Důvody pro dělení disku: 
	- @ Instalace více OS
	- @ Používání více souborových systémů
	- Přehlednost
	- Bezpečnost a rychlost
	- @ Usnadňuje zálohování

### #Diskový_oddíl
- Diskový oddíl - **Partition**
- $ Slouží k rozdělení fyzického disku na oddíly (fyzické nebo logické), se kterými je možné nezávisle manipulovat
- $ Z pohledu souborů se rozdělený disk jeví jako několik samostatných disků
	- Mohou být různě zformátovány a mohou obsahovat i různé operační systémy
- $ Rozdělení fyzického disku na diskové oddíly bývá uvedeno v tzv. Partition Table
	- Ten se nachází na 1. #Sektor u v tzv. Master Boot Record

#### #MBR
- MBR - Master Boot Record
- $ Hlavní spouštěcí záznam, který je umístěn v 1. #Sektor u disku
- ! MBR dokáže adresovat maximálně 2 TB disky
- $ Nástupcem je #GPT což je součást standardu EFI
- $ Velikost MBR je 512B
	- Zavaděč OS
	- Tabulka rozdělení disku na logické oddíly
	- Číselný identifikátor disku

##### #MPT
- MPT - Master Partition Table
- $ Obsahuje seznam logických oddílů na fyzickém disku a informace o umístění zaváděcích sektorů jednotlivých disků
- ! Max 4 záznamy
	- Jestli je potřeba rozdělit 1 disk na více logických oblastí, potom jeden ze 4 záznamů odkazuje na #EPT

##### #EPT 
 - Max 4 záznamy
 - $ Obvykle je jeden oddíl využit jako logický disk a následuje link na další #EPT 
 - $ V rozšířeném oddíle lze vytvořit "libovolný" počet logických oddílů
	 - Omezený velikostí disku

#### #GPT
- GPT - GUID Partition Table
- $ Nahrazuje starší tabulku #MBR, která neumožňuje použít disk větší než 2TB
- Součástí standardu EFI

#### #Bootloader
- Bootloader - Zavaděč
- $ Označení pro počítačový program, který je při bootování spuštěn po provedení #POST 
- $ Cílem je aktivace jádra OS
- Zavaděč je uložen v tabulce #MBR 
- NTLDR, LILO (Linux Loader), GRUB

#### Typy diskových oddílů
- 2 typy
	- Primární
		- $ Až 4 primární oddíly
		- ! Jeden z těchto oddílů by měl být označen jako aktivní 
	- Rozšířený
		- $ Je implementován jako 1 primární oddíl rozdělený na větší počet logických disků
		- ! Na disku může být pouze 1 rozšířený oddíl

### Nástroje na rozdělení disku
- fdisk
- Microsoft Disk Management (Správa disků)
- Parted
- GParted
---

## #Souborový_systém
- Souborový systém - File System
- $ Označení pro způsob organizace dat ve formě souborů a adresářů tak, aby k nim bylo možné snadno přistupovat
- $ Zajišťuje ukládání a čtení dat tak, aby s nimi mohli uživatelé pracovat ve formě souborů a adresářů
- Jsou uloženy na vhodném typu elektronické paměti, která je umístěná přímo v počítači (HDD, CD, ...) nebo pomocí počítačové sítě
- Jednoúčelová zařízení (MP3 přehrávač, digitální fotoaparát) nemusí podporovat všechny funkce souborového systému

### Jednotky souborového systému
- $ File - Soubor
	- @ Soubor je kolekce jedniček a nul, které jsou uspořádané podle jejich formátu.
- $ Cluster
	- @ Je to nejmenší adresovatelná jednotka na datovém mediu.
		- ! V jednom clusteru nemůže být uloženo více než 1 soubor.
		    - Proto soubor o 1 byte zabírá na disku 1kB
- $ Byte
	- @ Základní jednotka pro úložiště dat
	- @ 8 bitů
- $ Bit
	- @ Základní jednotka informace
	- @ Nejmenší jednotka v počítačích
### Dělení informací uložené v systému souborů: 
- #Metadata
	- $ Popisují strukturu systému souborů a nesou další služební a doplňující informace
	- @ Velikost souboru
	- @ Čas poslední změny
	- @ Čas posledního přístupu k souboru
	- @ Vlastník souboru
	- @ Oprávnění v sytému souborů
- Data
	- Vlastní obsah soubor který můžeme přečíst, když soubor otevřeme
	- $ SW, který realizuje souborový systém, bývá obvykle součástí OS

### Dělení souborových systémů dle OS
- MS Windows
	- FAT12/16/32
	- NTFS
- Linux
	- Ext2/3/4
	- XFS
- Solaris
	- UFS
	- ZFS
- MacOS
	- HFS
	- HFS+

### #Žurnálování
- $ Každá změna (např. vytvoření, smazání, přesun souboru) se nejdřív zaznamená do žurnálu
- $ Pokud dojde k výpadku, systém může žurnál použít k obnovení nedokončených operací = menší riziko poškození dat
- Kroky
	- @ 1. Do žurnálu je zapsáno, co a kde se bude měnit
	- @ 2. Je provedena vlastní série změn
	- @ 3. Do žurnálu je zapsáno, že operace byla úspěšně dokončena
	- @ 4. Záznam v žurnálu je zrušen
- $ NTFS, ext3/4, HFS+

### #Kvóty
- $ Limity nastavené správcem systému
- $ Omezují použití souborového systému
- Nejčastější omezeni: 
	- @ Velikost využitého místa - usage/block quota
	- Počet souborů - file/inode quota

#### Síťový souborový systém
- Označení pro systémy souborů, které jsou dostupné prostřednictvím počítačové sítě
- Soubory a adresáře leží na jiném počítači a přistupujeme k nim pomocí síťových služeb 

### #FAT
- FAT - File Allocation Table
- $ Tabulka, která obsahuje informace o obsazení disku v systému vytvořeném pro DOS
- ! Současně se tak označuje tento souborový systém
- Verze
	- FAT
		- Velikost disku 2MB
		- Neumí podadresáře
	- FAT12
		- Doplněna podpora podadresářů
	- FAT16
		- Velikost disku podle velikosti clusteru 32MB až 4GB
	- VFAT
		- Dlouhá jména souborů
	- @ FAT32
		- Velikost disku až 8TB
		- Velikost souboru max. 4GB
	- FAT+
		- velikost souboru až 256GB
	- @ exFAT
		- Moderní souborový systém

### #NTFS
- NTFS - New Technology File System
- Podporuje:
	- @ #Žurnálování
	- @ Access control list
	- Komprese na úrovni souborové systému
	- @ Šifrování
	- @ Diskové kvóty
	- Dlouhá jména souborů
	- Pevné a symbolické linky

### #Ext2
- Implementován pro jádro Linuxu
- Umí adresáře
- Pevné a symbolické odkazy
- $ Pro každý soubor a adresář se ukládají práva UGO
	- @ vlastník (user)
	- @ skupina (group)
	- @ ostatní (other)

### #Ext3
- #Žurnálování
- Zavádí indexy souborů (pro velké adresáře)

### #Ext4
- $ Zpětně kompatibilní
- Posouvá limity na velikost souborů a disků
- Rychlejší než ext3

### HFS+
- HFS - Hierarchical File System
- Vyvinutý společností Apple

### ZFS
- ZFS - Zettabyte File System
- Pro OS Solaris
- Automatická kontrola a oprava konzistence zapsaných dat
- Horní kapacitní hranice až 16EB
- Zvýšení maximálního počtu souborů v jedné složce na úroveň 7,2*10^16


### Linux Oprávnění
- ![[13_Zakladni-prace-s-OS-Linux-terminal#Linux oprávnění]]
- ![[11_Prace-s-opravnenimi-a-s-registry-OS-Windows-prikazovy-radek#Windows atributy - RASH]]