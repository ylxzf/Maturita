---
tags:
  - HW
---
# Úložná zařízení
### FDD
- FDD - Floppy Disk Drive
- $ Magnetické médium sloužící k ukládání a přenášení dat
- Varianty
	- 8"
	- 5,25"
	- 3,5"
- ![[Pasted image 20250508235307.png]]

### iomega ZIP
- ![[Pasted image 20250508235416.png]]

### HDD - Pevný disk
- HDD - Hard Disk Drive
- $ Zařízení, které se používá k trvalému uchování většího množství dat
- Uložená data se při odpojení napájení neztrácí
- ![[Pasted image 20250508235700.png]]
#### HDD - Geometrie
- $ Geometrie disku - Uspořádání stop
- $ Pokud disk obsahuje více povrchů, pak všechny stopy, které jsou přístupné bez pohybu čtecí hlavičky, se nazývají cylinder (válec)
- $ Adresa fyzického #Sektor u se skládá z čísla stopy (cylindru), čísla povrchu a čísla #Sektor u
	- Také se jí říká CHS (Cylinder, Head, Sector)
- ![[Pasted image 20250509000310.png]]
- 
#### HDD - Prokládání
- $ Data nejsou zapisována do za sebou jdoucích následujících sektorů, ale vždy do každého n-tého #Sektor u během jedné otáčky
- ! U současných disků se už nepoužívá
- ![[Pasted image 20250509000617.png]]

#### HDD - NCQ
- NCQ - Native Command Queuing (Přirozené řazení příkazů)
- $ Příkazy se řadí do fronty, což dovoluje optimalizovat jejich provádění
- Procesor požádá o posloupnost dat, která nejsou na stejném místě
	- Disk bez NCQ je bude číst tak, jak o ně procesor požádá
	- @ Disk s NCQ si nejprve srovná pořadí čtených bloků tak, aby k tomu potřeboval co nejméně otáček a přesunů hlavy
		- Seřazení nějakou dobu trvá, takže to nemusí vždy znamenat zrychlení
- ![[Pasted image 20250509001307.png]]

#### HDD - Technologie záznamu
- 3 způsoby zápisů podle orientace vektoru magnetické indukce
	- @ LMR - Longitudinal Magnetic Recording (Podélný zápis)
	- @ PMR - Perpendicular Magnetic Recording (Kolmý zápis)
	- @ SMR - Shingled Magnetic Recording (Šindelový/Překrývající se zápis)

##### LMR
- $ Jednotlivé bity jsou uchovávány jako opčně orientovaná magnetická pole vodorovně s plotnou disku
- Max kolem 150GB na čtverečný palec

##### PMR
- $ Vektory magnetické indukce jednotlivých bitů jsou orientovány kolmo na plotnu
- Až 1TB na čtvereční palec
- $ Disky s PMR nahradily starší disky s LMR
- Byla potřeba vyvinout novou diskovou hlavu

##### SMR
- $ Následující stopa se částečně překrývá s tou předchozí
- $ Nastávají problémy při zápisu
- Vyšší kapacita ale může dojít j snížení výkonu HDD
- Vhodný pro archivaci (kde se data nepřepisují)

#### HDD - Parametry
- $ Přenosová rychlost
	- Udávají se 2 hodnoty
		- @ Pro čtení
		- @ Pro zápis
- $ Otáčky ploten
- $ Přístupová doba
	- Doba vystavení hlaviček disku nad správnou skupinu stop - **seek time**
	- Doba, než se plotny otočí do potřebné pozice - **rotational latency**
	- Doba potřebná k přepnutí hlaviček - **head switch time**
		- ! V daný okamžik může pracovat **pouze jedna** z nic
	- Udává se střední hodnota přístupových dob
		- Okolo 5-10ms
- Vyrovnávací paměť
	- Rozhoduje nejen velikost, ale i její správné využití
- Střední doba mezi poruchami
	- Uvádí se v hodinách
		- Okolo 500-600 tisíc hodin
- $ S.M.A.R.T. - Self Monitoring Analysis and Reporting
	- Dnes podporován všemi disky i novými BIOSy
- Tepelný příkon
	- Mezi 5 - 12W
- Odolnost proti nárazům
- Hlučnost

#### HDD - Rozhraní
- Zastaralá
	- ST506
	- ESDI
	- @ PATA
	- @ SCSI
- Stále používaná
	- SAS
	- @ SATA
	- @ mSATA
	- @ M.2

##### ST506
- Max 16 hlav a 2 disky
- $ Analogový přenos = rušení

##### ESDI
- ESDI - Enhanced Small Device Interface
- Max 2 disky

##### IDE, ATA, ATAPI, PATA
- ATA - AT Attachment
- Rozhraní bylo uvedeno na trh pod názvem IDE (Integrated Drive Electronics)
- Rozhraní bylo rozšířeno na ATAPI (AT Attachment Packet Interface)
	- Připojení optické mechaniky
- ATA bylo po představení SATA přejmenováno na PATA

##### PATA
- PATA - Parallel ATA
- 40 žilový datový kabel
- K napájení disků byl použit konektor MOLEX
- ![[Pasted image 20250509004816.png]]

###### PATA - Režimy přenosu
- $ PIO - Programmed Input Output
	- @ Režim přenosu dat po sběrnici v počítači mezi periferiemi a operační pamětí
		- Data jsou přenášená za účasti procesoru
- #DMA 

###### PATA - vývoj
- ATA 1
	- Podpora 2 disků
	- Kapacita omezena na 2.1GB
- ATA 2
	- Též nazývána Fast ATA, Ultra ATA, Fast IDE, nebo EIDE
	- Obsahuje 2 řadiče -> podpora až 4 disků
	- Kapacita omezena na 137GB
- ATA 3
	- Podpora S.M.A.R.T
	- Objevují se 2,5" disky
- ATA / ATAPI 4
	- Zavedena podpora pro připojení CD-ROM
	- 80 žilový kabel
- ATAPI 5
	- Podpora vypalovaček
- ATAPI 6
- ATAPI 7


##### SCSI
- SCSI - Small Computer System Interface
- Podporuje až 8 zařízení
- Umožňuje připojení interních i externích zařízení
- $ Je možné připojit
	- @ Pevné disky
	- @ CD-ROM mechaniky
	- Páskové jednotky
	- Scannery
- ![[Pasted image 20250509010118.png]]
- ![[Pasted image 20250509010133.png]]

##### SATA
- SATA - **Serial** ATA
- ! Sériový port
- Je možné připojit
	- Pevné disky
	- Optické disky
- Na jeden SATA řadič lze připojit pouze jedno zařízení
- ![[Pasted image 20250509010605.png]]

### Flash Disk
- USB flash paměť - USB flash disk
- Náhrada diskety
- $ Data se nahrávají přes sběrnici USB

#### Flash paměť
- #Nevolatilní , semipermanentní, elektricky programovatelná (zapisovatelná) paměť
- $ Rozdíl od EEPROM je že, lze programovat každý blok samostatně 
- $ Data jsou ukládana v poli unipolárních tranzistorů s plovoucími hradly, zvaných "buňky", každá z nich obvykle uchovává 1 bit informace

### SSD
- SSD - Solid State Drive
- $ Ukládá data na flash paměť
- ! Neobsahuje pohyblivé mechanické části
- Má mnohem nižší spotřebu elektrické energie
- $ Omezená životnost buněk

#### mSATA
- mSATA- mini SATA
- Jiný konektor od SATA
- $ Určen pro notebooky, laptopy a další zařízení, vyžadující SSD v malém formátu
- ! Konektor je identický s PCI Express Mini Card, elektrické zapojení je odlišné – nekompatibilní
- ![[Pasted image 20250509011836.png]]

### M.2 SSD
- $ Rozhraní M.2 nahrazuje mSATA
- Výkonnější varianty využívají připojení do PCIe
- $ NVMe (NVM express) je rozhraní pro komunikaci mezi flash pamětí a řadičem
- Starší OS (Windows 7) nemají přímou podporu
- ![[Pasted image 20250509012305.png]]

---

## Dělení disku a souborové systémy
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
- $ Velikost MBR je 512b
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

### #Souborový_systém
- Souborový systém - File System
- $ Označení pro způsob organizace dat ve formě souborů a adresářů tak, aby k nim bylo možné snadno přistupovat
- $ Zajišťuje ukládání a čtení dat tak, aby s nimi mohli uživatelé pracovat ve formě souborů a adresářů
- Jsou uloženy na vhodném typu elektronické paměti, která je umístěná přímo v počítači (HDD, CD, ...) nebo pomocí počítačové sítě
- Jednoúčelová zařízení (MP3 přehrávač, digitální fotoaparát) nemusí podporovat všechny funkce souborového systému
#### Dělení informací uložené v systému souborů: 
- Metadata
	- $ Popisují strukturu systému souborů a nesou další služební a doplňující informace
	- @ Velikost souboru
	- @ Čas poslední změny
	- @ Čas posledního přístupu k souboru
	- @ Vlastník souboru
	- @ Oprávnění v sytému souborů
- Data
	- Vlastní obsah soubor který můžeme přečíst, když soubor otevřeme
	- $ SW, který realizuje souborový systém, bývá obvykle součástí OS

#### Dělení souborových systémů dle OS
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

#### #Žurnálování
- $ Každá změna (např. vytvoření, smazání, přesun souboru) se nejdřív zaznamená do žurnálu
- $ Pokud dojde k výpadku, systém může žurnál použít k obnovení nedokončených operací = menší riziko poškození dat
- Kroky
	- @ 1. Do žurnálu je zapsáno, co a kde se bude měnit
	- @ 2. Je provedena vlastní série změn
	- @ 3. Do žurnálu je zapsáno, že operace byla úspěšně dokončena
	- @ 4. Záznam v žurnálu je zrušen
- $ NTFS, ext3/4, HFS+

#### #Kvóty
- $ Limity nastavené správcem systému
- $ Omezují použití souborového systému
- Nejčastější omezeni: 
	- @ Velikost využitého místa - usage/block quota
	- Počet souborů - file/inode quota

#### Síťový souborový systém
- Označení pro systémy souborů, které jsou dostupné prostřednictvím počítačové sítě
- Soubory a adresáře leží na jiném počítači a přistupujeme k nim pomocí síťových služeb 

#### #FAT
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

#### #NTFS
- NTFS - New Technology File System
- Podporuje:
	- @ #Žurnálování
	- @ Access control list
	- Komprese na úrovni souborové systému
	- @ Šifrování
	- @ Diskové kvóty
	- Dlouhá jména souborů
	- Pevné a symbolické linky

#### #Ext2
- Implementován pro jádro Linuxu
- Umí adresáře
- Pevné a symbolické odkazy
- $ Pro každý soubor a adresář se ukládají práva UGO
	- @ vlastník (user)
	- @ skupina (group)
	- @ ostatní (other)

#### #Ext3
- #Žurnálování
- Zavádí indexy souborů (pro velké adresáře)

#### #Ext4
- $ Zpětně kompatibilní
- Posouvá limity na velikost souborů a disků
- Rychlejší než ext3

#### HFS+
- HFS - Hierarchical File System
- Vyvinutý společností Apple

#### ZFS
- ZFS - Zettabyte File System
- Pro OS Solaris
- Automatická kontrola a oprava konzistence zapsaných dat
- Horní kapacitní hranice až 16EB
- Zvýšení maximálního počtu souborů v jedné složce na úroveň 7,2*10^16

### Nástroje na rozdělení disku
- Microsoft fdisk
- Microsoft Disk Management (Správa disků)
- Parted
- GParted

---

## RAID
- RAID - Redundant Array of Inexpensive / Independent Disks (vícenásobné pole levných / nezávislých disků)
- Sestavování disků do diskových polí
- $ Metoda zabezpečení dat při selhání pevného disku
	- Zabezpečení závisí na zvoleném typu pole
- Ukládání dat na více disků, kdy jsou data při selhání některého z nich zachráněna
- Typy
	- RAID 0
	- RAID 1
	- RAID 5
	- RAID 6
- Používá se převážně v místech, kde jsou cenná data (servery)
- ! V žádném případě NEnahrazuje zálohování dat !!!

#### RAID 0
- ! Není skutečný RAID
	- Žádné redundantní informace
	- Žádná ochrana uložených dat
	- Při poruše členu pole dochází ke ztrátě dat
- Kapacita = součet všech členů
- 2 způsoby realizace
	- $ Zřetězení - Linear
		- @ Postupné ukládání na několik disků (zaplní 1., 2., ...)
		- Zvětšení kapacity kdykoliv přidáním členu
		- Při poruše nepřijdete o všechna data
	- $ Prokládání - Stripping
		- @ Ukládání dat cyklicky (střídavě)
		- @ Vyšší rychlost
		- ![[Pasted image 20250509024402.png]]

#### RAID 1
- $ Zrcadlení - Mirroring
- Nejjednodušší
- Efektivní
- Druhý disk zrcadlí tatáž data
- Při poruše 1 disku lze data čerpat z kopie
- $ Pomalejší zápis

#### RAID 5
- ! Vyžaduje minimálně 3 členy (2 + 1 disk)
- $ Data se zapisují postupně na disky a na ten poslední se zapíše parita
- Paralelní přístup k datům -> větší rychlost čtení
- $ Odolný vůči výpadku 1 disku (paritní nebo datový)
- Nižší rychlost zápisu
- ![[Pasted image 20250509024924.png]]

#### RAID 6
- Obdoba pole RAID 5
- ! Vyžaduje minimálně 4 členy (2 + 2 disky)
- $ Používá 2 paritní disky (Obsahují samoopravné kódy)
	- Na každém je parita vypočtena jiným způsobem
- $ Odolnost proti výpadku 2 disků
- Pomalý zápis
- ![[Pasted image 20250509025153.png]]

#### Ukládání dat do RAID
- Softwarově
	- Zápis obsluhuje OS
	- Nízká rychlost
- Hardwarově
	- Řadič se stará o RAID a CPU není tolik zatěžováno

#### Kombinované disková pole
- Pro lepší zabezpečení lze pole kombinovat
	- např. RAID 1 + RAID 0
		- Zrcadlení (Mirroring) zvyšuje zabezpečení
		- Prokládání (Stripping) zvyšuje rychlost
		- ![[Pasted image 20250509025653.png]]
	- RAID 5 + RAID 0
		- ![[Pasted image 20250509025736.png]]

---

## Optická média
- $ Data se nachází na spirále, začínající ve středu média a jsou uložena pomocí prohlubní v tenké vrstvě
- Rozdíly mezi jednotlivými typy médií spočívají v rozměrech datové spirály
	- Čím menší je velikost prohlubní, vzdálenost mezi nimi a vzdálenost mezi jednotlivými drahami spirály, tím více dat se na médium vejde
- Princip
	- $ Čte se pomocí laseru a senzoru
	- $ Podle toho, jak se laserový paprsek od prohlubně odrazí, vyhodnotí se 1 nebo 0
- ![[Pasted image 20250509030350.png]]

#### Základní pojmy
- $ Optická média a mechaniky pracují se světlem (Laserem)
- $ Pity a Landy
- $ Na velikost pitů, vzdálenost mezi nimi, rozměry datové spirály a vzdálenost mezi jejími závity mají zásadní vliv tyto parametry
	- $ Vlnová délka světla
		- Označuje vzdálenost 2 nejbližších bodů, které kmitají ve fázi
	- $ Numerická aperatura
		- Maximální úhel, pod kterým ještě může světelný paprsek vstoupit do světlovodu

#### Dělení podle počtu zápisů
- Lisovaný disk
	- ! Nelze na něj zapisovat, též označován ROM (např. DVD-ROM)
- Zapisovatelný disk
	- ! Lze jednou zapsat, též označován R, nebo Recordable (např. DVD-R)
- Přepisovatelný disk
	- $ Lze zapisovat vícekrát, též označován RW, nebo Rewriteable (např. DVD-RW)
	- Mají všechny vlastnosti zapisovatelného disku, navíc umožnují smazání obsahu a nahrání nového
	- $ Má v sobě chemickou vrstvu, která může být amorfní, nebo krystalické struktuře
		- $ Amorfní struktura světelný paprsek laseru pohlcuje
		- $ Krystalická ho odráží
		- $ Změna struktury -> zvýšení intenzity laserového paprsku -> vrstva se lokálně zahřeje a roztaví
		- $ Pokud je toto záření stálé, pak se vytvoří krystalická struktura. Pokud je však střídavé modulované, pak se vytvoří struktura amorfní

#### Dělení podle technologie
##### CD
- CD - Compact Disc
- Plastový kotouč
- Spirála má přibližně 20000 závitů
- $ Max 700 MB (80 minut zvuku)

##### DVD
- DVD - Digital Versatile Disk
- DVD5
	- 1 strana, 1 vrstva
	- $ Kapacita 4.7GB
- DVD9
	- 1 strana, 2 vrstvy
	- $ Kapacita 8,5GB

##### DVD-RAM
- $ Větší přepisovatelnost
##### 80mm disky
- Mini-CD
	- Kapacita 210MB
- Mini-DVD
	- Kapacita 1,4 - 5,2 GB
##### HD-DVD
- HD-DVD - High Definition DVD
- Modrý laser
- Kapacita:
	- Jednovrstvý až 15GB
	- Dvouvrstvý až 30GB
##### Blu-Ray Disc
- Modrý laser
- Kapacita:
	- Jednovrstvý až 25 GB
	- Dvouvrstvý až 50 GB