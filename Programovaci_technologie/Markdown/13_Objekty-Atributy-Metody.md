---
tags:
  - PRM
---

## Základní informace
- Java je objektově orientovaný jazyk
- $ Umožňuje strukturované programování, ale kód musí být v třídě

### Třída
- $ Šablona / předpis jak bude objekt vypadat (tedy jaká si ponese data) a co bude umět (tedy jaké bude mít metody

---

## Objekty
- $ Objekt - Základní jednotka v OOP
- $ Objekt je vytvořen ze třídy
- $ Konkrétní pojmenovaná realizace nějakého objektu se nazývá **instance**
### Vytvoření instance:
- $ Instance se vytváří z tříd pomocí **konstruktoru**
- Konstruktor
	- @ Metod, která se jmenuje stejně jako třída
	- @ Zavolá se pomocí klíčového slova: `new`
### Rušení instancí
- $ O uvolnění paměti v Javě stará **garbage collector**
- Garbage collector
	- @ Program, který vyhledává nepotřebné instance
	- @ Vrací paměť která pro ně byla použita zpět k dalšímu využití
	- JVM ho spouští sama
	- Jestli je potřeba ho zavolat tak se zavolá pomocí příkazu: `System.gc()`
		- ! Neprovede svojí úlohu hned po zavolání metody
- $ Metoda `finalize()` (tzv. **finalizer**) vykoná svůj kód těsně před tím než je objekt zrušen

---

## Atributy
- $ Vnitřní proměnné objektů

### Zapouzdření
- Data (atributy) jsou pěvně svázány s objektem a je možné k nim zakázat přístup z venčí (z jiné třídy)
#### Modifikátory viditelnosti
- @ `public` - Odkudkoli
- @ `protected` - Ve stejné třídě, v balíčku (package), a podtřídách (i v jiných balíčcích)
- @ nic (default) - Ve stejném balíčku (package)
- @ `private` - Pouze v rámci vlastní třídy
#### Metody k umožnění přístupu k atributům
- Getter
	- Pro čtení hodnoty atributu
- Setter
	- Pro změnu hodnoty atributu


### Statické x Instanční atributy
- $ Statické
	- @ Hodnota je "sdílená" pro všechny instance této třídy
	- Klíčové slovo: `static`
- $ Instanční
	- Každá instance má svoje vlastní hodnoty atributů

### Viditelnost proměnných
- $ Nelokální proměnné
	- @ Jsou deklarovány uvnitř třídy, mimo jakoukoliv metodu
	- @ Obvykle se deklarují na začátku třídy
	- @ Jsou viditelné v rámci celé třídy
	- Jsou to atributy třídy
- $ Lokální proměnné
	- @ Jsou deklarovány uvnitř třídy, uvnitř nějakého bloku kódu / metody
	- @ Jsou viditelné od místa své deklarace do konce bloku ve kterém jsou deklarovány
	- ! Nejsou to atributy, ale typicky pomocné proměnné
- Stínění
	- V Javě je povoleno aby se lokální a nelokální proměnná jmenovaly stejně. Potom dojde k efektu, kdy lokální proměnná "zastíní" tu nelokální.
		- Jestli chceme použít nelokální proměnnou tak se použije klíčové slovo: `this`

### Konstanty
- $ Pojmenovaný kus paměti, který nemůže měnit svou hodnotu za běhu programu

---

## Metody
- Hlavička
	- $ Modifikátor viditelnosti
	- $ `static` - volitelné
		- Jestli ho neobsahuje tak je instanční metodou
	- $ Návratový typ
		- ! Speciální návratový typ `void`
			- Metoda nic nevrací
		- @ Jestli je uveden jiný návratový typ pak musíme v metodě použít klíčové slovo `return` v těle metody k vrácení hodnoty
	- $ Jméno metody
	- $ Seznam formálních parametrů
		- @ Data která vstupují do metody
		- Lokální proměnné, které platí pouze uvnitř metody
		- Udávají se v závorkách
		- U každého parametru specifikujeme datový typ a jeho jméno

### Přetěžování metod
- $ Můžeme mít metody se stejným jménem, ale musí se lišit parametrem
	- Počtem parametrů
	- Datovým typem parametrů
	- Pořadím parametrů

### Přepisování metod
- $ Souvisí s dědičností
- $ Metody, které zdědíme můžeme přepsat pomocí **anotace** `@Override` nad hlavičkou metody

### Rekurze
- $ Metoda, která uvnitř sebe volá sama sebe
- $ Jakýkoliv rekurzivní algoritmus lze realizovat i bez rekurze
- $ Problémy kterou jdou řešit rekurzí:
	- QuickSort
	- Bisekce
	- DFS
	- Faktoriál čísla
	- Fibonacciho posloupnost