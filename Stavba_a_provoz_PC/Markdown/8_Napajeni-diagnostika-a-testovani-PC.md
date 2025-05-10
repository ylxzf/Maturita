---
tags:
  - HW
---
## Počítačový zdroj
- $ Měnič napětí
- $ Mění střídavé napětí 230V/50Hz z rozvodné sítě na stejnosměrná napětí pro napájení komponentů
	- Hlavní větvě poskytují napětí:
		- @ 3.3V
		- @ 5V
		- @ 12V
	- Komponenty si je dále mění tak, jak potřebují
- Ovlivňuje stabilitu počítače
- $ Počítač nemá stabilní spotřebu. Jeho spotřeba se neustále mění
- Pokud je použit zdroj s malým výkonem, může se při velkém zatížení stát, že počítač přestane pracovat. Proto je třeba dbát na to, aby počítačový zdroj měl dostatečný výkon

### AT vs ATX zdroj
- AT zdroj
	- $ Má vypínač připojený přímo do silové části pomocí 4-žilového kabelu a uzemnění na kostru skříně
- ATX zdroj
	- ! I ve vypnutém stavu dodává pomocné napětí 5V
		- Pomocí nějž se celý zdroj přes základní desku zapíná


### Konektory na zdroji
- Napájení základní desky AT 2x6 pin
	- ![[Pasted image 20250510010712.png]]
- Napájení základní desky ATX 20+4 pin
	- ![[Pasted image 20250510010736.png]]
- Napájení periférií 4 pin (MOLEX)
	- ![[Pasted image 20250510010753.png]]
- Napájení SATA
	- ![[Pasted image 20250510010815.png]]
- Napájení disketové mechaniky (FDD – Berg)
	- ![[Pasted image 20250510010837.png]]
- Napájení procesoru
	- ![[Pasted image 20250510010907.png]]
- Napájení grafické karty
	- ![[Pasted image 20250510010944.png]]

---

## Záložní zdroje
- UPS - Uninterruptible Power Supply
- $ Základní součástí je AC/DC měnič, DC/AC měnič a baterie
	- @ AC/DC měnič slouží k dobíjení baterie a napájení elektroniky UPS
	- @ DC/AC měnič vyrábí ze stejnosměrného napětí bat

### Výběr záložního zdroje
- Je nutné zjistit, jaký je příkon počítače, který chceme zálohovat
- Nejviditelnější hodnotou, obvykle napsanou přímo na zdroji je tzv. **zdánlivý výkon** ve voltampérech (VA)
- $ Důležitější údaj je skutečný výkon ve wattech (W)
- Důležitým faktorem při výběru je požadovaná doba zálohování

### Typy záložních zdrojů
#### Off-line UPS
- $ Nejjednodušší konstrukce
- $ Mají na svém vstupu připojené odrušovací filtry
- $ Objeví-li se rušivé elektrické složky, které už není tento filtr schopen korigovat, dojde k výpadku elektrické energie a přepojení na baterii
- $ Stejnosměrný proud z baterie se převádí na proud střídavý, dojde ke zvýšení napětí na požadovaných 230 V, a to poté putuje do samotného spotřebiče
- ![[Pasted image 20250510012114.png]]
#### Line-Interactive UPS
- $ Konstrukce vznikla postupným vylepšováním technologie Off-line
- Automatická regulace napětí (AVR) vyrovnává dočasné podpětí nebo přepětí v síti na ideální úroveň 230 V
- ![[Pasted image 20250510012154.png]]
#### On-line UPS
- Záložní zdroje tohoto typu pracují na principu dvojité konverze napětí pro dosažení maximální kvality výstupního napětí
- $ Trvalé připojení baterie ke vstupnímu usměrňovači a zároveň k výstupnímu měniči
	- @ Baterie se tak neustále dobíjí a v případě, že dojde k problému v síti nebo výpadku, slouží baterie jako okamžitý zdroj energie
- ![[Pasted image 20250510012331.png]]

### Parametry UPS
- Podpětí
- Přepětí
- Napěťové rázy
- Kolísání frekvence
- Harmonické zkreslení sinusového průběhu napětí
- Šum
- Způsob komunikace s PC
	- #RS232 
	- #USB 
	- SNMP - Simple Network Management Protocol

---

## Benchmarky
- Benchmarky - diagnostické programy pro PC
- Použití:
	- $ Zjištění teploty uvnitř PC nebo u jednotlivých komponentů
	- $ Zjištění opotřebení HDD kvůli včasné záloze dat
	- $ Zobrazení řady užitečných informací
	- $ Testování stability při přetaktování a zvyšování výkonu obecně

### Programy
- $ AIDA64 Extreme
	- Dokáže otestovat:
		- Pevný disk
		- Procesor
		- Paměti
		- Stabilitu systému
		- Jednoduchý test monitoru
- $ CPU-Z
	- Zobrazí:
		- Pracovní frekvence
		- Frekvence sběrnice
		- Hodnotu násobiče
		- Napětí jádra
		- Velikost TDP
		- Cache procesoru
		- Výrobní technologii
		- Instrukce
		- atd.
- $ GPU-Z
	- Zobrazí:
		- Informace o aktuální i jiné grafické kartě v PC
		- Verze BIOSU
		- Verzi ovladačů
		- Kdy byl čip uveden
		- kolik má tranzistorů
		- Aktuální údaje o taktu paměti a GPU
		- Teplotu
		- Napájecí napětí
		- at.
- $ HWiNFO32/64
	- program nabídne podrobné informace o procesoru a grafice jako CPU-Z a GPU-Z
	- navíc máte vše sdruženo v jednom okně společně s informacemi o HDD, optické mechanice, RAM, základní desce nebo čipové sadě
- $ 3D Mark
	- Stress test
	- Hodně verzí
	- Zatěžuje GPU i CPU