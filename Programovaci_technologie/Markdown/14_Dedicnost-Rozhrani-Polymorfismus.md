---
tags:
  - PRM
---
## Dědičnost - Inheritance
- $ Umožňuje nám rozšiřovat už existující kód bez rizika že "rozbijeme" již funkční kód uvnitř třídy / interface ze které dědíme
- $ Základní / rodičovská třída definuje základní vlastnosti a metody
	- @ Třídy které se stanou potomky této třídy tyto vlastnosti a metody získají
	- Potomci poté mohou tyto vlastnosti / metody využít, přepsat, nebo přidat další
		- Když třída dědí metodu s `final` nemůže ji přepsat
- $ Klíčové slovo pro použití dědičnosti: `extends`
- ! Každá třída může být potomkem POUZE jedné třídy
- $ Pokud není u třídy uvedeno z jaké třídy dědí, pak "defaultně" dědí z `java.lang.Object()`
	- Třída Object nemá žádného předka
- $ Pomocí klíčového slova `super` se odkazujeme na nejbližšího předka

### Abstraktní třída
- $ Třída která obsahuje minimálně jednu abstraktní metodu
- $ Označena klíčovým slovem: `abstract`
- ! Z abstraktní třídy NELZE vytvářet instance
- $ Z abstraktní třídy se typicky podědí odvozená třída a v té si doprogramujeme funkčnost všech abstraktních metod.

---

## Rozhraní - Interface
- $ Objekt, který předepisuje metody, které je nutné doprogramovat ve třídě, která toto rozhraní implementuje
- Rozhraní může rovněž obsahovat konstanty
- $ Třída může implementovat libovolný počet rozhraní

---

## Polymorfismus
- ![[13_Objekty-Atributy-Metody#Přetěžování metod]]