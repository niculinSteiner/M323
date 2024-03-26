### Inhaltsverzeichnis - Teil 1

1. [Imperative vs. Deklarative](#imperative-vs-deklarative)
2. [Pure Functions](#pure-functions)
3. [Immutable Values](#immutable-values)
4. [Call by Value](#call-by-value)
5. [Call by Reference](#call-by-reference)
6. [Lazy vs. Eager Evaluation](#lazy-vs-eager-evaluation)

------
### Teil 2
7. [Functions as Value](#function-as-value)
8. [Weitere Datentypen](#weitere-datentypen)
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
console.log(result); //
```
### [Function as Value](#function-as-value)
- Java Streams: Beliebt für funktionale Paradigmen in Java, aber oft umfangreicher in der Code-Struktur.
- Scala: Bietet Unveränderlichkeit (immutable lists) und prägnanten, deklarativen Code.
#### Heigher Order Functions (HOF)
Eine HOF (High Order Function) in Scala ist einfach eine Funktion, die eine andere Funktion als Argument annimmt und/oder eine Funktion zurückgibt.
Bsp:
```
def applyOperation(numbers: List[Int], operation: Int => Int): List[Int] = {
  numbers.map(operation)
}

```
#### Map, Filter, Foldleft, FlatMap
- Die *map-Funktion* ist ein fundamentales Konzept in der funktionalen Programmierung. Sie ermöglicht es, eine Operation auf jedes Element einer Liste (oder einer anderen Collection) anzuwenden und daraus eine neue Liste mit den bearbeiteten Elementen zu erstellen.
- Die *filter-Funktion* ist ein weiteres zentrales Konzept in der funktionalen Programmierung. Sie ermöglicht es, Elemente aus einer Liste (oder einer anderen Collection) auszuwählen, die eine bestimmte Bedingung erfüllen, und daraus eine neue Liste mit diesen Elementen zu erstellen.
- Die *foldLeft-Funktion* ist ein wichtiges Werkzeug in der funktionalen Programmierung. Sie wird verwendet, um eine Liste (oder eine andere Sammlung) von Elementen zu einem einzelnen Wert zu reduzieren, indem sie eine Akkumulatorfunktion sequenziell auf die Elemente der Liste anwendet.
- Die Operation, die von *flatMap* durchgeführt wird, ist somit eine Kombination aus map (Anwendung einer Funktion auf jedes Element) und flatten (Vereinigung aller resultierenden Listen in eine einzige Liste).

#### First-Class Citizens
Das bedeutet, dass Funktionen wie jede andere Variable behandelt werden können. Sie können als Argumente an andere Funktionen übergeben, von Funktionen zurückgegeben und in Variablen gespeichert werden. Ein besonders mächtiges Konzept ist dabei die Möglichkeit, dass Funktionen andere Funktionen als Rückgabewert haben. 
Das Zurückgeben von Funktionen durch andere Funktionen ermöglicht:
- Höhere Abstraktionsstufen: Erstellung komplexerer Funktionen durch Kombination einfacherer Funktionen.
- Currying und Partial Application: Schaffung von Funktionen, die einige Argumente vorab festlegen und den Rest bei späteren Aufrufen erwarten.
- Funktionale Komposition: Zusammensetzung mehrerer Funktionen zu einer neuen Funktion.
Dieses Konzept wird vorallem bei Eventhandling(Funktionen, die aufgrund bestimmter Ereignisse aktiviert werden.) oder Callbacks(Funktionen, die als Parameter übergeben und später ausgeführt werden.) angewendet.

#### Currying
Currying ist ein Konzept in der funktionalen Programmierung, bei dem eine Funktion mit mehreren Argumenten in eine Folge von Funktionen umgewandelt wird, die jeweils genau ein Argument nehmen. Dies ermöglicht eine höhere Flexibilität und Modularität im Code.
Currying bietet folgende Vorteile:
- Teilweise Anwendung: Ermöglicht es, einige Argumente einer Funktion vorab zu binden und die restlichen später zu übergeben.
- Funktionale Komposition: Vereinfacht das Zusammensetzen von Funktionen.
- Code-Wiederverwendbarkeit: Fördert das Schreiben von generischen und wiederverwendbaren Funktionen.
Wird angewendet bei:
- Dynamische Funktionsgenerierung: Erstellung spezifischer Funktionen basierend auf Kontext oder Bedingungen.
- Asynchrone Programmierung: Verzögerung der Ausführung von Funktionen bis alle erforderlichen Argumente verfügbar sind.

#### For Comprehension
For Comprehensions in Scala sind eine mächtige und ausdrucksstarke Art, über Collections (wie Listen, Optionen, Futures usw.) zu iterieren, Transformationen durchzuführen und Werte zu filtern. Sie sind "syntactic suger", die das Schreiben von verschachtelten Funktionsaufrufen wie map, flatMap und filter vereinfachen. For Comprehensions verbessern die Lesbarkeit des Codes, indem sie eine deklarative Art der Datenmanipulation ermöglichen.
Bsp:
```
val numbers = List(1, 2, 3, 4, 5)
val doubled = for (n <- numbers) yield n * 2

```
Hier iterieren wir über numbers und verdoppeln jeden Wert. Das yield-Schlüsselwort sammelt die Ergebnisse und gibt eine neue Liste zurück. Das obige Beispiel entspricht numbers.map(n => n * 2)

### [Weitere Datentypen](#weitere-datentypen)
- Liste
    - Speicher alle Values so wie sie hinzugefügt wurden. 
- Set
    -  Während eine Liste alle Elemente in der Reihenfolge speichert, wie sie hinzugefügt wurden, haben Sets nur unique values, d.h. jedes Element kommt nur einmal vor.    
- Map
    - Key - Value 
- Tupel
    - Ein Tupel ist ähnlich wie eine Liste, aber im Gegensatz dazu können Tupel verschiedene Typen von Elementen enthalten, und die Anzahl der Elemente im Tupel ist festgelegt und kann nicht geändert werden.
Wir können unterschiedliche Collections in einem for comprehension ausführen. Die Ausgabe entspricht dem Collection Type, der als erster in der for comprehension bearbeitet wird.
