### Inhaltsverzeichnis

1. [Imperative vs. Deklarative](#imperative-vs-deklarative)
2. [Pure Functions](#pure-functions)
3. [Immutable Values](#immutable-values)
4. [Call by Value](#call-by-value)
5. [Call by Reference](#call-by-reference)
6. [Lazy vs. Eager Evaluation](#lazy-vs-eager-evaluation)

---

### Imperative vs. Deklarative

**Imperative Programmierung:**

- [Die imperative Programmierung](#imperative-programmierung) konzentriert sich darauf, wie ein Programm schrittweise funktioniert.
- Sie betont den Einsatz von Anweisungen, die den Zustand eines Programms ändern. Diese Anweisungen werden sequentiell ausgeführt, und der Programmierer muss die genauen Schritte angeben, die erforderlich sind, um das gewünschte Ergebnis zu erzielen.
- Beispiele für imperative Programmiersprachen sind C, C++, Java und Python.

**Deklarative Programmierung:**

- [Die deklarative Programmierung](#deklarative-programmierung) hingegen konzentriert sich darauf, was das Programm erreichen soll, anstatt wie es erreicht werden soll.
- Anstatt explizite Anweisungen oder Befehle zu geben, verwendet die deklarative Programmierung eine höhere Abstraktionsebene, um das gewünschte Ergebnis zu beschreiben.
- Deklarative Programmiersprachen sind oft prägnanter und ausdrucksstärker, da sie viele Implementierungsdetails abstrahieren.
- Beispiele für deklarative Programmierparadigmen sind die funktionale Programmierung (z. B. Haskell) und die logische Programmierung (z. B. Prolog).

---

### Pure Functions

Pure Functions haben 3 Regeln:

1. [Nur ein Rückgabewert](#nur-ein-rückgabewert)
2. [Rückgabewert nur abhängig von den Aufrufparametern](#rückgabewert-nur-abhängig-von-den-aufrufparametern)
3. [Verändert keine existierenden Werte außerhalb der Methode](#verändert-keine-existierenden-werte-außerhalb-der-methode)

| Aufgabe | Nur ein Rückgabewert | Resultat nur abhängig von übergebenen Parametern | Verändert keine existierenden Werte | pure oder impure |
|---------|-----------------------|-------------------------------------------------|---------------------------------------|-------------------|
| 1.1     | Ja                    | Ja                                              | Nein                                  | impure            |
| 1.2     | Ja                    | Ja                                              | Ja                                    | pure              |
| 1.3     | Ja                    | Ja                                              | Ja                                    | pure              |
| 1.4     | Ja                    | Nein                                            | Nein                                  | impure            |
| 1.5     | Ja                    | Ja                                              | Ja                                    | pure              |
| 1.6     | Ja                    | Nein                                            | Nein                                  | impure            |

---

### Immutable Values

Die Unveränderlichkeit kann dabei - wie Sie bereits gelernt haben - auf zwei Arten umgesetzt werden:

- [Kopie der Daten](#kopie-der-daten): Die ursprünglichen Daten (Original) wird unverändert gelassen. Es wird eine Kopie der Daten erstellt, die dann verändert wird.
- [Rekursion](#rekursion): Die Methode wird rekursiv aufgerufen und mit jedem neuen Aufruf werden neue "Kopien" der lokalen Variablen angelegt.
Wichtig ist, dass die Funktionen stets via call by value aufgerufen werden (und nicht call by reference), damit eine Kopie der Daten übergeben wird und nicht nur eine Referenz auf das Original. Funktionale Programmiersprachen können den call by reference auch ganz verhindern, um die Entwickler beim richtigen Anwenden des funktionalen Paradigmas zu unterstützen.

---

### Call by Value

[Call by Value](#call-by-value) heißt das der Methode die Parameter immer als Kopie der Originaldaten übergeben werden. Das hat zur Folge, dass wenn diese Daten in der Funktion angepasst werden, es keine Seiteneffekte auf die Außenstehende Variablen hat.

---

### Call by Reference

[Call by Reference](#call-by-reference) bedeutet, dass der Methode eine Referenz auf eine Variable übergeben wird. Wird nun dieser Parameter verändert, wird nicht nur in dem spezifischen Methodenkontext der Wert verändert, sondern auch außerhalb.

---

### Lazy vs. Eager Evaluation

Der Unterschied ist, dass bei der [Lazyevaluation](#lazy-evaluation) Ausdrücke erst dann evaluiert werden, wenn sie gebraucht werden. Bei der [Eagerevaluation](#eager-evaluation) werden sie sofort ausgewertet.

Codebeispiel(Lazy):

```javascript
function lazyAdd(a, b) {
    console.log("Adding"); // Diese Zeile wird nur ausgeführt, wenn das Ergebnis tatsächlich benötigt wird
    return () => a + b;
}

console.log("Start");
let resultFunc = lazyAdd(3, 4); // "Adding" wird noch nicht ausgegeben
console.log("Middle");
let result = resultFunc(); // "Adding" wird jetzt ausgegeben
console.log(result); // 7
