---
tags:
  - HW
---
## Zobrazovací jednotky

### Základní pojmy
- $ Pro připojení zobrazovacích jednotek se používá grafická karta nebo video adaptér
	- @ Úkolem grafické karty je zpracování a převod digitálních dat na signály, které se použijí pro zobrazení na zobrazovací jednotce
- Základním principem pro vytváření barevných odstínů je aditivní míchání barev

#### Aditivní barevný model RGB
- ! Způsob míchání barev, při němž se jednotlivé složky barev **sčítají** a vytváří tak světlo **větší intenzity**
- ![[Pasted image 20250509204418.png]]

#### Gamut
- $ Dosažitelná oblast barev v určitém barvovém prostoru
	- Barvy mimo tuto oblast lze v daném barvovém prostoru zobrazit jen přibližně
- ![[Pasted image 20250509204521.png]]

#### Pozorovací úhel
- Udává úhel, pod kterým má obraz kontrast 10:1 (podle výrobce)

### CRT
- Cathode Ray Tube
- $ 3 elektronový děla
- @ Z děl vznikají elektronový paprsky
	- Jsou usměrňovány elektromagnetickým polem vychylovacích cívek
- @ Paprsky dopadají na stínítko
	- @ V otvorech stínítka se nachází **luminofory**
		- Luminofor - látka, která po předchozím dodání energie vyzařuje světlo
		- @ Ty se po dopadu elektronů na určitou dobu rozzáří červeně, modře nebo zeleně
	- Úkol masky (Kovová děrovaná fólie) je oddělit a nasměrovat paprsky pro jednotlivé luminofory na stínítku
	- 3 typy stínítek
		- Delta
		- Štěrbinová - In line
		- Trinitron
		- ![[Pasted image 20250509214605.png]]
- Bod monitoru je natolik malý, že lidské oko neregistruje jednotlivé luminofory
- $ Různými kombinacemi intenzit vyzařování jednotlivých složek RGB dostaneme unikátní zabarvení obrazového bodu
- Každý druh (barva) luminoforu má svoji vlastní katodovou trubici
- ![[Pasted image 20250509214803.png]]
- ![[Pasted image 20250509214817.png]]

### LCD
- LCD - Liquid Crystal Display
- Dělení technologií
	- reflektivní/transmisní
	- aktivní/pasivní
		- Aktivní využívají k řízení buněk aktivních zesilovacích prvků TFT (Thin Film Tranzistor)
- $ V zadní části panelu je zdroj světla
- $ Následují 2 desky
	- @ Elektrody z vodivého skla, mezi nimiž jsou tekuté krystaly
		- V přirozeném stavu "otáčí" procházející světlo o ~90 stupňů
	- @ Světlo prochází druhý, polarizačním filtrem s opačnou polarizací
- ![[Pasted image 20250509215349.png]]


#### Tekuté krystaly
- Organické látky
- Tvoří přechod mezi pevnými látkami a kapalinami
- Uspořádání tekutých krystalů:
	- Smektrické
	- Nematické
	- Cholesterické
	- ![[Pasted image 20250509215327.png]]

#### Parametry
- $ Response time
	- Čím menší, tím lépe (<20ms)
- $ Podsvícení
	- CFFL tubes
		- Dříve se používaly tenké trubice
		- ![[Pasted image 20250509215934.png]]
	- LED
		- Dnes se používá
		- Úspora energie
		- Větší životnost panelu
		- Nevznikají žádné tmavá místa
		- ![[Pasted image 20250509220116.png]]
- $ Rozlišení

![[Pasted image 20250509220243.png]]

### PDP
- PDP - Plasma Display Panel
- $ Plasma - skupenství složený z iontů a elementárních částic
- Princip:
	- 1 pixel je tvořen 3 subpixely (RGB) a každý z nich je vyplněn plazmou
	- Plazma emituje UV záření, které dopadá na **scintilátor** a ten se vlivem ionizujícího záření rozsvítí (scintilace = záblesk)
	- Každý scintilátor je naplněn jinou směsí, proto při dopadu UV záření produkuje světlo o jiné vlnové délce, tedy i jiné barvě

### OLED
- OLED - Organic LED
- Mezi průhlednou anodou a kovovou katodou je několik vrstev organické látky
	- Jsou to vrstvy vypuzující díry, přenášející díry, vyzařovací vrstva a vrstva přenášející elektrony
- Přivedením napětí jsou vyvolány kladné a záporné náboje, které se spojují ve vyzařovací vrstvě, a tím produkují světelné záření
- 2 druhy
	- @ S pasivní matricí - PMOLED
	- @ S aktivní matricí - AMOLED
		- Lepší ve všem, dražší#
- ! Omezená životnost buněk
- ![[Pasted image 20250509221234.png]]

## Dataprojektor
- $ Umožňují zobrazení na velké ploše

### LCD
- LCD - Liquid Crystal Display
- Obsahuje 3 LCD
	- 1 pro každou ze základních barev RGB
- $ Pomocí optické soustavy (dichroická zrcadla, čočky) je k těmto displejům přivedeno světlo od projekční lampy
	- @ Dichroické zrcadlo má schopnost odrážet či propouštět světlo v závislosti na vlnové délce
- $ Každý displej z procházejícího světla propustí jednu barevnou složku a příslušně upraví jas
- $ Pomocí optického hranolu jsou tři světelné paprsky opět spojeny do jednoho, který je odeslán do objektivu a na projekční plochu
- Princip:
	- Světlo z lampy dopadne na první zrcadlo, to propustí jednu složku a zbylé světlo odrazí
	- následuje zrcadlo pro druhou a nakonec pro třetí složku. Odražené paprsky světla pokračují samostatně do přiděleného LCD
- ![[Pasted image 20250509223043.png]]

### DLP
- DLP - Digital Light Processing
- $ Uvnitř projektoru se nachází jeden nebo více čipů DMD (Digital Micromirror Device)
	- @ Obsahují tisíce zrcátek mikroskopických rozměrů
		- Zrcátka se dokáží naklápět o přibližně 10 stupňů
		- $ Zrcátka určují barvu
	- $ Barevný kotouč
- ![[Pasted image 20250509223725.png]]
- ![[Pasted image 20250509224820.png]]

#### CRT
- $ 3 nezávislé obrazovky s vysokým jasem, které generují obraz a skrze optickou soustavu jej promítají na plátno
	- @ 1 obrazovka = 1 ze základních barev RGB
- ![[Pasted image 20250509225137.png]]