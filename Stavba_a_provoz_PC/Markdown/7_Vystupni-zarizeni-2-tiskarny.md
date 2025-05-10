---
tags:
  - HW
---
## Tiskárny
- Je výstupní zařízení
- $ Slouží k přenosu dat uložených v elektronické podobě typicky na papír
- Připojit tiskárnu můžeme přes:
	- #RS232
	- #LPT 
	- #USB
	- Bezdrátově

### Subtraktivní barevný model CMYK
- CMYK - Cyan, Magenta, Yellow, Black#
- $ Protiklad RGB
- ! Způsob míchání barev, při němž se jednotlivé složky barev **odečítají** a vytváří tak světlo **menší intenzity**
- ![[Pasted image 20250509230601.png]]

### Barevný tisk
- $ Smícháním dvou pigmentů omezíme barevné spektrum odráženého světla jen na tu část, která se nevyskytuje ve spektru žádného pigmentu (po smíchání všech pigmentů se tedy nebude odrážet nic a vznikne černá
- ![[Pasted image 20250509230706.png]]

### Rastrování
- $ Mimo 8 základních barev vytváří tiskárny další barvy tzv. polotónováním (rastrováním), tak, jak to dělá klasický ofset
- např. Pro tisk fialové používá tiskárna kombinaci tisku purpurových a azurových bodů na velmi malé ploše. Pro tisk světlých odstínů se používá míchání s bílou, tedy určité body se ponechávají nepotisknuté
- ![[Pasted image 20250509231143.png]]

### Parametry tiskáren
- $ DPI - Dots Per Inch
	- Typické hodnoty mezi 300 - 1200 DPI
- $ PPM - Pages Per Minute
	- @ Určuje rychlost tisku
- $ CPP - Cost Per Page
- Energy Star
	- Tiskárna je energeticky úsporná
- Dura Brite Ultra Ink
	- Vysoce kvalitní inkoust, který zachovává kvalitu barev
- Picture Bridge
	- Tisknutí obrázků a dokumentů přímo z digitálního zařízení

### Připojování tiskáren
- #LPT
- #USB 
- #BlueTooth
- #Wifi  
- LAN

### Tiskárny úderové
#### Typové
##### Znakové
- $ Obdoba elektrických psacích strojů
- ![[Pasted image 20250509231959.png]]
##### Bubnové (Válcová)
- Sada typů se znaky je umístěna po obvodu bubnu zvlášť v každé pozici na řádku
- Princip: 
	- @ Buben se otáčí ve shodném směru s pohybem papíru a ve vhodnou chvíli proti bubnu udeří kladívko
	- v celém řádku se tak vytisknou současně všechna A, B apod.
	- papír se současně pohybuje, charakteristickým rysem je, že všechna A jsou vytištěna výše než Z
- ![[Pasted image 20250509232412.png]]
##### Řetězové
- $ Jednotlivé typy se znaky jsou umístěny za sebou na řetězu
	- @ Neustále se pohybuje nad papírem kolmo na směr jeho posunu
- $ Z druhé strany papíru je sada kladívek, která udeří proti řetězu v okamžiku, kdy je proti kladívku ve správné pozici článek řetězu s písmenem
- ![[Pasted image 20250509232528.png]]
#### Jehličkové
- $ Řada až 24 jehliček je umístěna v tiskové hlavě
	- @ Projíždí nad papírem kolmo na směr jeho posunu
- $ Jehličky propisují přes barvící pásku na papír jemné body, z kterých se skládají písmena a obrázky
- $ Jehličky jsou připojeny k elektromagnetům, které je při tisku vystřelují proti barvící pásce
	- $ Tato páska dopadne v daném bodě pak na papír, kde otiskne malý barevný bod
- Nejsou vhodné pro tisk grafických dokumentů
- ![[Pasted image 20250509232902.png]] 
- Typy
	- 1 jehličkové
	- 7 jehličkové
	- 9 jehličkové
	- 24 jehličkové
- ![[Pasted image 20250509233103.png]]
### Tiskárny bezúderové
##### Inkoustové
- $ Princip tisku spočívá v tom, že inkoust je na papír vymršťován velkou rychlostí v podobě kapek o velikosti řádově desítky až jednotky pl (pikolitrů)
- ! Inkoust je umístěn v malé nádržce (cartridge)
	- Pohybuje se s tiskovou hlavou 
	- ![[Pasted image 20250509234340.png]]
- Technologie:
	- $ DOD - Drop On Demand
	- $ Continuous
###### DOD BubbleJet
- $ Topný rezistor způsobí zahřátí inkoustu v dutině trysky
	- @ Vlivem tepla vzniká bublina, která vytlačuje inkoust z dutiny ven
- $ Vystříknutím inkoustu na papír dojde k zániku bubliny, přitom vznikne v trysce podtlak, který způsobí její opětovné naplnění inkoustem
- ![[Pasted image 20250509233947.png]]
###### DOD InkJet
- $ V okamžiku, kdy má dojít k vystříknutí kapky inkoustu na papír, je do piezokrystalu zaveden elektrický proud, který způsobí jeho prohnutí
- $ Toto prohnutí piezokrystalu má za následek vystříknutí kapky inkoustu z dutiny trysky
- ![[Pasted image 20250509234416.png]]
###### Continuous
- $ Vytváří nepřetržitý proud velkého množství kapek inkoustu
- $ Vybrané kapky jsou vychýleny tak, aby dopadly na tiskové médium, ostatní jsou odváděny sběrným systémem zpět do zásobníku
- ![[Pasted image 20250509234406.png]]
##### Tepelné
- Tisknou na teplotně citlivý papír
- Používá se pro tisk daňových dokladů, lístků v prodejních a parkovacích automatech, registračních pokladnách, měřících a medicínských přístrojích apod.
- ![[Pasted image 20250509234529.png]]
##### Sublimační
- $ Sublimace barvy produkuje tzv. continuous tone tisk ve fotografické kvalitě 
- $ Princip tisku spočívá v ohřívání tělísek tiskové hlavy v širokém teplotním rozmezí
- ![[Pasted image 20250509234628.png]]
##### Voskové
- Používá barevný vosk
	- Je nanesen na přenosové roli v plátech jednotlivých základních barev za sebou
	- Tepelný tělíska ohřívají vosk
- ![[Pasted image 20250509234924.png]]
##### Laserové
- $ Data potřebná k vytištění jedné stránky jsou nejprve umístěna do paměti tiskárny
	- $ Tato (znaková) data jsou převáděna řadičem tiskárny na video data
	- $ Video data jsou posílána na vstup polovodičového laseru, který vysílá přerušovaný laserový paprsek
		- $ Paprsek je vychylován soustavou rotujících zrcadel tak, aby dopadal na válec z materiálu schopného uchovávat elektrostatický náboj
		- $ V místech dopadu paprsku dojde k nabití válce statickou elektřinou na potenciál řádově 1000 V
- $ Rotující válec prochází kolem kazety s barvicím práškem (tonerem), který je vlivem statické elektřiny přitažen k nabitým místům na povrchu
- $ Papír, který vstoupí do tiskárny ze vstupního podavače, je nejprve nabit statickou elektřinou na potenciál vyšší, než jsou nabitá místa na válci (cca 2 000 V)
- $ Když tento papír prochází kolem válce, dojde k přitažení toneru z nabitých míst válce na papír
- $ Toner je do papíru zažehlen, papír je zbaven elektrostatického náboje a umístěn do výstupního zásobníku
- ![[Pasted image 20250509235307.png]]

##### LED
- Alternativa k laserovému tisku
- $ Využívá elektroluminiscenční diody
- $ Základním rozdílem je použití jiného zdroje světla, který se využívá k expozici povrchu válce
- $ Namísto jednoho laserového paprsku rozmítaného zrcátkem jsou použity svítivé diody, které vytvářejí podél obrazového válce řadu
	- @ Mezi diodami a válcem je řada optických čoček

### 3D tiskárna
- $ Vyrábí reálný model z digitálního modelu vytvořeného pomocí některého z grafických programů