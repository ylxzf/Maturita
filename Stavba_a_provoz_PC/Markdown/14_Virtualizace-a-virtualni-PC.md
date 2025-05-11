---
tags:
  - OPS
---
## #Virtualizace 
- $ Označení postupů, technik a prostředků, které umožňují v počítači přistupovat k dostupným zdrojům jiným způsobem, než fyzicky
### Virtualizace Hardwaru
- $ Virtualizujeme Hardware, abychom byli hardwarově nezávislý
- Nejčastěji se virtualizuje optický disk (CD, DVD, ...)
### Virtualizace OS
- $ Více virtuálních počítačů na 1 hardwaru
- Virtualizovaný OS je vždy pomalejší

### Hardwarová virtualizace
- $ Využívá hardware
	- @ např. procesory s AMD-V nebo Intel VT-x
	- ! Musí to HW podporovat
- $ **Virtuální stroje běží přímo na hardwaru** pomocí hypervisoru (např. VMware, Hyper-V)
- $ Umožňuje VM přímo komunikovat s HW
### Softwarová virtualizace
- $ Používá software pro simulaci virtuálních prostředí
	- např. QEMU, Docker pro kontejnery
- $ **Virtuální stroj běží na operačním systému**, který je ve své podstatě emulován nebo izolován pomocí softwaru
- $ Pomalejší než hardwarová virtualizace, protože všechny operace jsou prováděny přes hostitelský operační systém

### #Hypervizor
- $ Software, který umožňuje **spouštět a spravovat virtuální stroje** na jednom fyzickém počítači
- Dělí hardwarové prostředky (jako CPU, paměť, úložiště) mezi virtuální stroje
- ! Stará se o rozdělování system resources, **izolaci VM** a **abstrakci OS**
- $ Typ 1 (bare-metal):
	- @ Běží přímo na fyzickém hardwaru, bez hostitelského operačního systému
	- např. Microsoft Hyper-V
- $ Typ 2 (hosted):
	- @ Běží na hostitelském operačním systému a spravuje virtuální stroje na tomto OS
	- např. VirtualBox, VMware Workstation

### Typy virtualizace
#### #Emulace
- $ Emulace simuluje chování jiného počítačového systému.
- Typy emulátorů
	- CPU Emulator - Emuluje CPU jiné architektury
	- OS Emulator - Emuluje software OS, pro stejný hardware
	- Network Emulator - Emuluje síťové zatížení atd.
	- Application Emulator - Kompatibilita aplikace pro jinou platformu
#### #Paravirtualizace
- $ Umožňuj přímý přístup k #Hypervizor a ne přes abstrakci jako u #Plná_virtualizace 
- $ VM přistupuje napřímo k systémovým resources, díky tomu je rychlejší než #Plná_virtualizace 
- ! Je jenom částečně izolovaná
- $ Nejrychlejší typ virtualizace
#### #Plná_virtualizace
- $ Kompletně odizoluje host OS od ostatních VM
- $ Simuluje všechny komponenty a jejich činnost HW
- $ Nejlepší izolace

---

## SW pro virtualizaci
- #Emulace
	- Wine - Emulace windows aplikací v Linuxu
	- Dos-Box - Emulace DOSu
	- Blue Stack - Emulace Androidu
- #Paravirtualizace
	- VM Ware
	- Hyper V
	- Virtual Box
- #Plná_virtualizace
	- Hyper V
	- Virtual Box
	- Proxmox

---

## Přístup k VM
- $ Virtualizační aplikace
- $ Web
	- Proxmox
- $ Lokálně/Vzdáleně

---

## Kdy se používá jaká virtualizace?
- #Emulace
	- @ Když je potřeba spustit software určený pro jinou platformu nebo architekturu
- #Paravirtualizace
	- @ Když je potřeba dobrý výkon a je možné upravit operační systém pro spolupráci s virtualizací.
- #Plná_virtualizace 
	- @ Když je potřeba široká kompatibilita a není nutné upravovat operační systém
	- Funguje s jakýmkoli operačním systémem.