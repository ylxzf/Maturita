---
tags:
  - OPS
---
## Co je to OS?
- $ Základní programové vybavení počítače
- $ Zavádí se do #Operační_paměť po startu počítače
- $ Zprostředkovává komunikaci s uživatelem a technickým vybavením pomocí uživatelského rozhraní

## Hlavní úkoly OS
- $ Zajišťovat komunikaci mezi uživatelem a počítačem
- $ Poskytuje vhodné prostředí pro spouštění programů
- Provádí správu dat
	- Většinou se jedná o diskové jednotky
- Provádí správu hardwarových zdrojů
	- Paměť, procesorový čas, I/O zařízení

## Vlastnosti
- $ Zpracování procesu
	- @ Monotask - Jednoúlohové
		- např. MS-DOS
	- @ Multitask - Víceúlohové - Schopnost operačního systému provádět několik procesů současně
		- @ Preemptivní
			- Pád jednoho programu nemůže ovlivnit chod jiných
		- @ Kooperativní
			- Procesor je vždy přidělen právě jedné aplikaci
			- Aplikace pracuje do doby, než sama uvolní procesor pro jinou aplikaci
			- ! Pád aplikace v tomto systému může vážné narušit chod jiných aplikací i operačního systému
		- @ Vláknový (Threadový)
			- Jednotlivé procesy jsou rozděleny na vlákna
			- Jedna aplikace mívá hlavní řídící vlákno, z kterého se pak děli další
- $ Prostředí
	- @ GUI - Graphical User Interface
		- Linux
			- GNOME
			- KDE
			- Xfce
		- Windows
			- Windows Desktop Environment
	- @ TUI - Text User Interface
	- Shell
- $ Uživatelé
	- @ Monouser - Jednouživatelský
		- DOS, Win95
	- @ Multiuser - Víceuživatelský

## Služby OS
- $ Aplikace nebo proces běžící na pozadí operačního systému, který zajišťuje specifické funkce a čeká na svou aktivaci či použití
- Běží nezávisle na uživateli
- Stavy:
	- @ Aktivní - Služba je spuštěná a vykonává svou funkci
	- @ Neaktivní - Služba není spuštěná -> Je připravená na aktivaci
	- @ Zakázaná - Služba je deaktivovaná a nemůže být spuštěná bez povolení
- $ Interní služby
	- @ Interní služby jsou základní funkce operačního systému, které jsou přímo integrovány do jeho jádra a zajišťují každodenní správu systémových prostředků
- $ Externí služby
	- @ Externí služby operačního systému poskytují rozhraní pro komunikaci s aplikacemi nebo uživatelskými programy mimo samotné jádro OS

## Výkon PC
- $ Nejslabší prvek určuje výkon
	- "Úzké hrdlo"

## Konfigurace OS
- $ Minimální konfigurace OS
	- Hardwarové minimum aby šlo nainstalovat OS
- $ Doporučená konfigurace OS
	- Kancelářský stroj
- $ Podle SW na PC

## Instalace
- $ Live OS
	- @ Bootování z USB, DVD, ...
	- Operační systém se zavede do operační paměti
- $ Lokálně instalovaný
	- Instalace na HDD, SDD, ...
	- Pro trvalé použití

## Vztahy OS a CPU
- #Bitová_šířka #Architektura 
![[1_Zakladni-deska-PC-CPU-RAM-BIOS-Setup#Intel_8086]]
![[1_Zakladni-deska-PC-CPU-RAM-BIOS-Setup#Intel_80286]]
![[1_Zakladni-deska-PC-CPU-RAM-BIOS-Setup#Intel_80386]]
![[1_Zakladni-deska-PC-CPU-RAM-BIOS-Setup#Intel_80486]]
![[1_Zakladni-deska-PC-CPU-RAM-BIOS-Setup#Intel_Pentium]]
![[1_Zakladni-deska-PC-CPU-RAM-BIOS-Setup#Intel_Pentium_4]]

## Windows
- $ MS-DOS
- Windows 3.11
- Windows NT 3.5
- $ Windows 95
- Windows NT 4
- Windows 98
- Windows 2000 (Windows NT 5.0)
- Windows Me
- $ Windows XP
- $ Windows Vista
- $ Windows 7
- Windows 8
- $ Windows 10

## Linux
- Kernel vytvořil Linus Torvalds, jako alternativní systém k UNIX