---
tags:
  - OPS
---
## Zálohování
- $ Proces, při němž vzniká kopie zdrojových dat za účelem ochrany při ztrátě a poškození dat
- Záloha dat
	- @ Komprimovaná
	- @ Nekomprimovaná
- $ Archivace dat
	- @ Dlouhodobé uchovávání dat, které již nejsou potřeba pro každodenní využití, obvykle za použití komprimace

### Typy zálohování
#### Plné
- $ Obsahuje všechna data na disku v době jejího vytvoření
- $ Tvoří základ pro budoucí přírůstkové a rozdílové zálohy nebo slouží jako samostatná záloha
- ! Můžeme použít i když neznáme #Souborový_systém  nebo když je na disku #BitLocker
	- Poté se zálohuje bit po bitu, jinak se zálohují jen složky a soubory.
- $ Kompresní poměr těchto záloh je okolo 1:2
	- Je možnost nekomprimované verze **bit po bitu**.
- $ Rychlá obnova při ztrátě dat, protože všechny data jsou už ve struktuře
#### Rozdílové
- $ Rozdílový typ zálohy zálohuje jen rozdíl mezi základním blokem a zálohovaným oddílem
- $ Při ztrátě zálohy, která není ta základní **je možné obnovit oddíl plně**, protože zálohy na sebe nejsou navázané
- $ Kompresní poměr těchto záloh je okolo 1:2 
#### Přírůstkové
- $ Přírůstková záloha dělá rozdíl mezi nově zálohovaným segmentem a předchozí zálohou
- $ Tento rozdíl je pak uložen jako záloha.
- Výhoda je malá velikost konsekutivních záloh.
- $ Kompresní poměr je polovina přírůstku - 1:2
- ! Při ztrátě jedné zálohy už není možné obnovit plnohodnotnou poslední zálohu. Zálohy jsou na sebe navázané.

## Software pro zálohování
- $ CloneZilla
- $ Acronis True image
## Datové struktury na disku
- $ Popisuje jak jsou data na disku uložena

![[Stavba_a_provoz_PC/Markdown/Extra#Disk|Extra]]

![[Stavba_a_provoz_PC/Markdown/Extra#Partition|Extra]]

### Proč dělit disk na oddíly?
- ! Na 1 oddíl nelze nainstalovat fyzicky 2 OS nebo více #Souborový_systém 
- $ Rychlejší zálohy
### MBR
![[3_Ulozna-zarizeni#MBR]]

### GPT
![[3_Ulozna-zarizeni#GPT]]