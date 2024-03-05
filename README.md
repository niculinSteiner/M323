### Imperative vs. Deklarative
Imperative Programmierung:

    Die imperative Programmierung konzentriert sich darauf, wie ein Programm schrittweise funktioniert.
    Sie betont den Einsatz von Anweisungen, die den Zustand eines Programms ändern. Diese Anweisungen werden sequentiell ausgeführt, und der Programmierer muss die genauen Schritte angeben, die erforderlich sind, um das gewünschte Ergebnis zu erzielen.
    Beispiele für imperative Programmiersprachen sind C, C++, Java und Python.

Deklarative Programmierung:

    Die deklarative Programmierung hingegen konzentriert sich darauf, was das Programm erreichen soll, anstatt wie es erreicht werden soll.
    Anstatt explizite Anweisungen oder Befehle zu geben, verwendet die deklarative Programmierung eine höhere Abstraktionsebene, um das gewünschte Ergebnis zu beschreiben.
    Deklarative Programmiersprachen sind oft prägnanter und ausdrucksstärker, da sie viele Implementierungsdetails abstrahieren.
    Beispiele für deklarative Programmierparadigmen sind die funktionale Programmierung (z. B. Haskell) und die logische Programmierung (z. B. Prolog)

### Pure Funcionts
Pure Functions haben 3 Regeln:
- Nur ein Rückgabewert
- Rückgabewert nur abhängig von den Aufrufparametern
- Verändert keine existierenden Werte ausserhalb der Methode

| Aufgabe | Nur ein Rückgabewert | Resultat nur abhängig von übergebenen Parametern | Verändert keine existierenden Werte | pure oder impure |
|---------|-----------------------|-------------------------------------------------|---------------------------------------|-------------------|
| 1.1     | Ja                    | Ja                                              | Nein                                  | impure            |
| 1.2     | Ja                    | Ja                                              | Ja                                    | pure              |
| 1.3     | Ja                    | Ja                                              | Ja                                    | pure              |
| 1.4     | Ja                    | Nein                                            | Nein                                  | impure            |
| 1.5     | Ja                    | Ja                                              | Ja                                    | pure              |
| 1.6     | Ja                    | Nein                                            | Nein                                  | impure            |

### Immutable Values
Die Unveränderlichkeit kann dabei - wie Sie bereits gelernt haben - auf zwei Arten umgesetzt werden:
 - Kopie der Daten: Die ursprünglichen Daten (Original) wird unverändert gelassen. Es wird eine Kopie der Daten erstellt, die dann verändert wird.
 - Rekursion: Die Methode wird rekursiv aufgerufen und mit jedem neuen Aufruf werden neue "Kopien" der lokalen Variablen angelegt.
Wichtig ist, dass die Funktionen stets via call by value aufgerufen werden (und nicht call by reference), damit eine Kopie der Daten übergeben wird und nicht nur eine Referenz auf das Original. Funktionale Programmiersprachen können den call by reference auch ganz verhindern, um die Entwickler beim richtigen Anwenden des funktionalen Paradigmas zu unterstützen.

### Call by Value
Call by Value heisst das der Methode die Parameter immer als Kopie der Originaldaten übergeben werden. Das hat zur folge das wenn diese Daten in der Funktion angepasst werden, es keine Seiteneffekte auf die Aussenstehende Variabeln hat.
### Call by Reffernece
Hier ist das Gegenteil der Fall, hier wird der Mehtode eine Refferenz auf eine Varibale übergeben, wird nun dieser Parameter verändert wird nicht nur in dem spezifischen Methodenkontext der Wert verändert, sonder auch ausserhalb.
### Lazy vs Eager Evaluation
Der Unterschied ist, dass bei der Lazyevaluation Ausdrücke erst dann evaluiert werden wenn sie gebraucht werden. Bei der Eagerevaluation werden sie sofort Ausgewertet.
Codebeispiel(Lazy):
```
function lazyAdd(a, b) {
    console.log("Adding"); // Diese Zeile wird nur ausgeführt, wenn das Ergebnis tatsächlich benötigt wird
    return () => a + b;
}

console.log("Start");
let resultFunc = lazyAdd(3, 4); // "Adding" wird noch nicht ausgegeben
console.log("Middle");
let result = resultFunc(); // "Adding" wird jetzt ausgegeben
console.log(result); // 7
```
Codebeispiel(Eager)
```
function eagerAdd(a, b) {
    console.log("Adding"); // Diese Zeile wird jedes Mal ausgeführt, wenn die Funktion aufgerufen wird
    return a + b;
}

console.log("Start");
let result = eagerAdd(3, 4); // "Adding" wird sofort ausgegeben
console.log(result); // 7
```
