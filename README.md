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
| Aufgabe | Nur ein Rückgabewert | Resultat nur abhängig von übergebenen Parametern | Verändert keine existierenden Werte | pure oder impure |
|---------|-----------------------|-------------------------------------------------|---------------------------------------|-------------------|
| 1.1     | Ja                    | Ja                                              | Nein                                  | impure            |
| 1.2     | Ja                    | Ja                                              | Ja                                    | pure              |
| 1.3     | Ja                    | Ja                                              | Ja                                    | pure              |
| 1.4     | Ja                    | Nein                                            | Nein                                  | impure            |
| 1.5     | Ja                    | Ja                                              | Ja                                    | pure              |
| 1.6     | Ja                    | Nein                                            | Nein                                  | impure            |

