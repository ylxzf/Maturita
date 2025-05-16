---
tags:
  - POS
---
## VLAN - [video](https://www.youtube.com/watch?v=12bQIfqBBbQ)
- VLAN - Virtual Local Area Network
- $ Slouží k logickému rozdělení sítě nezávisle na fyzickém uspořádání
- $ Rozdělení sítí na L2 ISO/OSI
- $ Používá se pro vytvoření více sítí v jednom switchi a kvůli bezpečnosti
- Výhody VLANu
	- @ Snížení broadcastů
	- @ Zjednodušená správa
	- @ Zvýšení zabezpečení
	- Oddělení speciálního provozu
	- Snížení HW
### Rozsahy VLAN
![[Pasted image 20250516023726.png]]

## Módy
- $ Access
	- @ Umožňuje přenos pouze 1 VLAN na jednom kabelu mezi switchi
	- ! Pokud mezi switchi chceme propojit 8 VLAN budeme potřebovat 8 kabelů, které propojí každou VLAN
	- Vhodné pro propojení koncového zařízení se switchem
- $ Trunk
	- @ Mód, při kterém více VLAN sdílí jeden kabel

### Přiřazování na port (Cisco)
- VLAN se vytvoří: 
	- Switch(config)# VLAN [číslo vlany]
- Přepneme se do nastavení této VLANy a nastavení jména: 
	- Switch(config-vlan)# name [jméno]
- Vylezeme z nastavení VLAN: 
	- Switch(config)# exit
- Vybereme rozhraní: 
	- Switch(config)# interface fa0/1
- Trunk:
	- Přepneme mód na portu defaultně dynamic nebezpečné přepíná se do trunk:
		- Switch(config-if)# switchport mode trunk
- Access:
	- Přepneme mód na portu na access: 
		- Switch(config-if)# switchport mode access
	- Poslední krok je, že přiřadíme port do VLAN: 
		- Switch(config-int)# switchport access vlan [číslo vlany]


