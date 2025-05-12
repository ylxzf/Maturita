---
tags:
  - APV
---
## Datové formáty
- $ Způsob, jakým jsou data organizována
- Datové jednotky
	- $ Bit - Základní jednotka informace (0, 1)
	- $ Byte - Základní jednotka uložiště
		- @ 8 bitů
- Znakové sady
	- $ Číslo reprezentuje znak  
	- O jaký znak se jedná určuje kódovací tabulka
	- $ ASCII - American Standard Code of Information Interchange
		- @ Základní znaková sad
		-  V ASCII jsou uložené písmena, číslice, tisknutelné i netisknutelné znaky
	- $ UNICODE
		- @ Tabulka znaků všech existujících abeced
	- $ UTF-8
		- @ Způsob kódování řetězců znaků Unicode/UCS do sekvencí bajtů
	- $ Windows 1250
		- @ Umí češtinu

### Soubor
- $ Pojmenovaná sada dat, uložená na datovém médiu (Množina dat)
- Typy
	- $ Textové
		- @ Tvořeny tisknutelnými a řídícími znaky
		- Čistý text
	- $ Binární
		- @ Tvořeny jedničkami a nulami
		- Zvukové formáty, obrázky
- $ Vlastnosti
	- @ Jméno
	- @ Přípona
	- @ Cesta
	- Velikost
	- Datum vytvoření
- $ Atributy
	- @ R - Read
	- @ A - Archive
	- @ S - System
	- @ H - Hidden
- $ Komprese - Zmenšení objemu dat
	- $ Ztrátová
		- @ Tam, kde je možné ztrátu některých informací tolerovat. (mp3, jpg…)
	- $ Bezeztrátová
		- @ Tam, kde ztráta jednoho znaku by mohla znamenat nenávratné poškození dat. (`.wmv`, `.bmp`, `.flac`, …)

### Fonty
- $ True-type - `.ttf`
- $ Open-type - `.otf`

### Formáty
- $ Textové
	- `.txt`
	- `.rtf`
	- `.csv`
	- `.json`
	- `.html`
	- ...
- $ Binární
	- @ Dokumenty
		- `.pdf`
		- `.docx`
		- `.xlsx`
		- ...
	- @ Spustitelné
		- `.exe`
		- `.msi`
		- ...
	- @ Archivní
		- `.zip`
		- `.rar`
		- ...
	- #Rastrová_grafika 
	- #Vektorová_grafika
	- #Video
	- #Zvuk

---

## #Rastrová_grafika
- $ Celý obrázek je popsán pomocí jednotlivých barevných bodů
- $ Body jsou uspořádány do mřížky - **Rastr**
- $ Každý bod má určen svou přesnou polohu a barvu
- $ Velmi jednoduché pořízení snímku
- ! Zvětšování a zmenšování obrázku vede ke zhoršení obrazové kvality
### Barevná hloubka
- $ Určuje kolik barev je použito na jeden bod
### Barevné modely
- RGB - Red, Green, Blue
- CMYK - Cyan, Magenta, Yellow, Black
- HSL - Hue, Saturation, Lightness
- HSV - Hue, Saturation, Value
### Histogram
- $ Rozložení jasů v obraze
### Formáty
- Komprimované
	- Bezeztrátové
		- `.gif`
		- `.png`
	- Ztrátové
		- `.jpg`
- Nekomprimované
	- `.bmp`
	- `.tiff`
### Rasterizace
- $ Převod vektorové grafiky na rastrovou
### SW
- Adobe Photoshop
- GIMP


## #Vektorová_grafika
- $ Celý obrázek je zaznamenán matematicky pomocí geometrických útvarů (body, přímky, mnohoúhelníky, kružnice nebo křivky)
- $ Libovolné zmenšování a zvětšování obrázku bez ztráty kvality
- ! Složitější způsob pořízení obrázku oproti rastrové grafice
### Beziérova křivka
- $ Křivka je definována dvěma kotevními body, které značí její začátek a konec, a dvěma kontrolními body, které udávají její tvar
### Využití
- $ Fonty
- $ Loga
- $ Diagramy
- ...
### Formáty
- `.svg`
- `.ai`
### Vektorizace
- $ Převod rastru na vektor
## SW
- Adobe Illustrator
- CorelDRAW

---

## #Video
- $ Rychle po sobě jdoucí obrázky
### Parametry
- $ Rozlišení
	- Šířka x Výška
- $ Datový tok
	- Kolik bitů je využito, každou sekundu videa
- $ Framerate / FPS - Frames Per Second
	- Počet snímků za sekundu
- $ Poměr stran - Aspect ratio
### Formáty obrazu
- $ SD - Standard Definition
	- 480p
	- 640x480, 720x480(NTSC)
- $ HD - High Definition
	- 720p
	- 1280x720
- $ Full HD
	- 1080p
	- 1920x1080
- $ Quad HD
	- 1440p / 2K
	- 2560x1440
- $ Ultra HD
	- 2160p / 4K UHD
	- 3840x2160p
### Televizní normy
- Souhrn standardů kódování signálu pro televizní vysílání
- Standardy:
	- $ PAL - Phase Alternating Line
		- Evropa, Austrálie, část jižní Ameriky
	- $ NTSC - National Television System(s) Committee
		- Amerika, Japonsko, Jižní Korea
	- $ SECAM - Séquentiel couleur à mémoire
		- Francie, Rusko
### Kodek
- $ SW nebo HW nástroj na kódování dat
- $ Zajišťuje kódování a dekódování videa
- Stará se o kompresi
- např. H264, M265
### Formáty
- Komprimované
	- Ztrátové
		- `.mp4`
		- `.mkv`
		- `.mov`
	- Bezeztrátové
		- `.mkv`
		- `.mov`
- Nekomprimované
	- `.raw`
### SW
- Adobe Premiere Pro
- Sony Vegas
- DaVinci Resolve



## #Zvuk
- $ Mechanické vlnění vzduch
### Parametry
- $ Frekvence - v Hz
	- Výška zvuku
- $ Intenzita - v dB
	- Fyzikální energie zvuku
- $ Vzorkovací frekvence
	- Kolikrát za sekundu se měří
	- ! Musí být alespoň 2x vyšší než je maximální frekvence rekonstruovaného signálu!!!

### Kanály zvuku
- $ Mono
	- @ 1 kanál
- $ Stereo
	- @ 2 kanály - Levý a pravý
- $ 5:1
	- @ 6 kanálů
- $ 7:1
	- @ 8 kanálů
### Hardwarová zařízení
- $ Mikrofon
- $ Sluchátka
- $ Reproduktor
- $ Zvuková karta
### Formáty
- Komprimované
	- Ztrátové
		- `.mp3`
		- `.aac`
	- Bezeztrátové
		- `.flac`
		- `.ape`
- Nekomprimované
	- `.wav`
	- `.aiff`
### SW
- Adobe Audition
- Ableton
- FL Studio
- Audacity