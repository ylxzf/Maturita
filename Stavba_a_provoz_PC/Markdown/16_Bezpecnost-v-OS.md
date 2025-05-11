---
tags:
  - OPS
---
## Bezpečnost
- $ Soubor opatření, která mají zamezit přístupu třetí strany, a aby počítač fungoval bez obtíží a tak jak má

---
## Hardwarová bezpečnost
- $ Zabezpečení pomocí fyzického zařízení
- Může chránit PC od všeho mezi podpětím elektriky, až po útoky po síti
### #UPS
- @ Chrání pc před výpadkem proudu, přepětím atd.
### 2 Zdroje
- @ Chrání PC před selháním zdroje
- U serverů
### Zamezení fyzického přístupu
- $ Zamknutí do skříně, elektrická mříž
### #RAID
- @ Chrání PC před selháním disku
### Secure Boot
- @ Chrání PC, před bootováním z externích medii
### #HW_Firewall
- @ Zařízení, které filtruje to co se děje na síti
- @ Nejlepší First Line of Defence
- @ Jedno zařízení může sloužit, jako firewall pro celou síť
- ! Nelze filtrovat jednotlivé aplikace
- $ Filtruje směr IN a ne OUT

---
## Softwarová bezpečnost
- $ Zabezpečení pomocí softwaru, který běží na systému
### Antivirus
- $ Program, který skenuje počítač a ostatní programy po podezřelých patternech, kterými se vyvolávají útoky na PC
	- Virus
		- @ Program, který se šíří nezávisle na uživateli
		- @ Chce omezit provoz PC, ukrást data
- Způsoby detekce
	- $ Skenování soboru po infikovaných souborech
	- $ Porovnávání souborů a aplikací oproti databázi virů
	- $ Heuristická analýza
	    - Může najít i dosud neznámý virus
	    - Analyzuje kód po známých patternech používaných virusy
	    - Zkouší aplikace na virtuálním počítači
### #SW_Firewall
- $ Stejné jako #HW_Firewall
- ! Je schopen blokovat jednotlivé procesy a aplikace
### BitLocker
- $ Nástroj pro šifrování disku, který chrání data před neoprávněným přístupem
### #Žurnálování
- $ Ochrana před korupcí dat při práci se soubory

![[Stavba_a_provoz_PC/Markdown/Extra#Autentizace|Extra]]

![[Stavba_a_provoz_PC/Markdown/Extra#Autorizace|Extra]]

---

## Pravidla pro práci s PC
- $ Zapnout a kontrolovat koncovky souborů
- $ Systém by měl být aktualizovaný
- $ Mít antivirus
- $ Neotevíráme neznáme soubory, aplikace, web stránky, emaily