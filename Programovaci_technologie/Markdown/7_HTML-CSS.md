---
tags:
  - PVA
---
## HTML
- $ HTML - Hyper Text Markup Language
- $ Značkovací jazyk
- Interpretovaný jazyk
- $ Určuje strukturu webových stránek
- Skládá se z elementů
- $ Používá značky (tagy)
- $ Spolupracuje s CSS a JavaScriptem

### Struktura kódu
```html
<!DOCTYPE html>
<html>
	<head>
	</head>
	<body>
	</body>
</html
```


### Tagy
- $ Základní stavební prvek
#### Párové
- Nadpisy
	- `<h1></h1>`
	- `<h2></h2>`
	- ...
- Odstavec
	- `<p></p>`
- Link - Anchor
	- `<a></a>`
- Seznamy
	- Seřazený - Ordered
		- `<ol></ol>`
	- Neseřazený - Unordered
		- `<ul></ul>`
- Tabulka
	```html
	<table>
		<tr>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
		</tr>
	</table>
	```
- Formáty
	- Tučný
		- `<b></b>`
	- Kurzíva
		- `<i></i>`
	- Podtržený
		- `<u></u>`
#### Nepárové
- Obrázek - Image
	- `<img src="" />`
- Zlomení řádku - Break
	- `<br />`
- Vložit externí zdroj - Link
	- `<link>`

### Formuláře
```html
<form action="" method="POST">
	<input type="text" name="example">
</form>
```

#### Vstupní prvky
- Text
	- `<input type="text" name="username">`
- Heslo
	- `<input type="password" name="password">`
- Email
	- `<input type="email" name="email">`
- Telefonní číslo
	- `<input type="tel" name="phone">`
- URL
	- `<input type="url" name="website">`
- Číslo
	- `<input type="number" name="age" min="0" max="120">`
- Datum
	- `<input type="date" name="birthday">`
- Čas
	- `<input type="time" name="appointment">`
- Checkbox
	- `<input type="checkbox" name="subscribe" value="yes">`
- Radio tlačítko
	- `<input type="radio" name="gender" value="male"> Male
	- `<input type="radio" name="gender" value="female"> Female``
- File
	- `<input type="file" name="fileUpload">`
- Submit
	- `<input type="submit" value="Submit">`

---

## CSS
- $ CSS - Cascading Style Sheets
- $ Používaný k pokročilejší úpravě vizuální podoby webových stránek

### Propojení CSS s HTML
- Inline - Jako atribut HTML tagu
	```html
	<div style=”color: red;”></div>
	```
- Interní - `<style></style>` tag umístěn v `<head></head>` tagu
	```html
	<head>
		<style>
				div {
					color: red;
				}
		</style>
	</head>
	```
- Externí - Styly v samostatném CSS souboru, který se připojuje k HTML pomocí `<link>` tagu v `<head></head>` tagu
	```html
	<head>
		<link rel="stylesheet" href="">
	</head>
	```

### Selektory
- $ Selektor říká, který prvek bude používat daný CSS styl
- 3 typy
	- $ Třída - Class
		- @ Váže se na elementy, ke kterým byl přidělen
		- `.myClass {color: red; }`
	- $ Prvek - Element
		- @ Váže se na všechny elementy určeného typu
		- `div { color: red; }`
	- $ ID
		- @ Je to jedinečný identifikátor elementu
		- Váže se na ID atribut v HTML
		- `#menu {color: red; }`

### Box model
- $ Základní model rozvržení, který popisuje, jak jsou prvky na webové stránce zobrazeny a rozmístěny
- $ Každý prvek je renderován jako obdélník s obsahem, paddingem, borderem a marginem
- ![[Pasted image 20250513074220.png]]

#### Struktura
- $ Content
    - @ Oblast, kde je zobrazen hlavní obsah (text, obrázek, atd.)
    - Rozměry obsahu závisí na šířce a výšce, které jsou nastaveny pomocí CSS.
- $ Padding
    - @ Vnitřní prostor mezi obsahem a okrajem
    - Vytváří vnitřní mezeru kolem obsahu a zvětšuje velikost prvku
    ```css
    .padding {
    	padding: x(top) x(right) x(bottom) x(left);
    }
    ```
- $ Border
    - @ Okraj kolem obsahu a paddingu
    - Může mít různé tloušťky, barvy a styly (solid, dashed, dotted, atd.)
    ```css
    .border {
    	border: x(width) x(style) x(color);
    }
    ```
- $ Margin
    - @ Vnější prostor mezi boxem a okolními prvky
    - Ovlivňuje vzdálenost mezi prvky, ale nepřidává k celkové velikosti prvku

#### Box-sizing
- $ Určuje, jak se počítají rozměry prvku (šířka a výška)
- Content-box (default)
    - Šířka a výška zahrnují pouze obsah. Padding a okraj jsou přidány navíc.
- Border-box
    - Šířka a výška zahrnují obsah, padding a okraj

### Pozicování
- Pomocí CSS lze nastylovat, jak budou jednotlivé elementy umístěny
- Existují 2 základními druhy pozicování
	- $ Absolutní
		- @ Umístí objekt do stránky bez ohledu na okolní text
	- $ Relativní
		- @ Určuje pouze, o kolik se má objekt posunout oproti své normální pozic