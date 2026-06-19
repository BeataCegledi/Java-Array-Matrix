#  Java Array Matrix

> bungsaufgaben zu mehrdimensionalen Arrays und Matrizen  entwickelt im Rahmen der Umschulung zur Fachinformatikerin Anwendungsentwicklung (FIAE).

##  Projektbeschreibung

Dieses Projekt enthlt 5 aufeinander aufbauende Aufgaben rund um zweidimensionale Arrays (Matrizen) in Java.
Die Aufgaben decken die Erstellung, Befllung, Auswertung und visuelle Ausgabe von Matrizen ab  von einer einfachen 33-Matrix bis hin zu einer zufllig generierten 55-Matrix mit statistischer Auswertung.

##  Aufgaben bersicht

| Aufgabe | Thema | Beschreibung |
|---------|-------|-------------|
| 6 | 33 Matrix | Matrix mit Werten 19 erstellen und in Tabellenform ausgeben |
| 7 | Zeilensummen | Summe jeder Zeile berechnen und ausgeben |
| 8 | Benutzereingabe | 22-Matrix einlesen, Original und Transponierte ausgeben |
| 9 | Hauptdiagonale | 44-Zufallsmatrix, nur Diagonale `[0][0]``[3][3]` ausgeben |
| 10 | Zufallsmatrix | 55-Matrix mit Zufallswerten: Gesamtsumme und grten Wert ermitteln |

##  Verwendete Java-Konzepte

| Konzept | Anwendung im Projekt |
|---------|---------------------|
| `int[][]` | Zweidimensionale Arrays (Matrizen) deklarieren und befllen |
| Verschachtelte `for`-Schleifen | Zeilen und Spalten durchlaufen |
| `Scanner` | Benutzereingabe fr 22-Matrix (Aufgabe 8) |
| `Math.random()` | Zufallszahlen generieren (Aufgaben 9, 10) |
| Transponierte Matrix | Zeilen und Spalten tauschen mit `matrix[y][x]` |
| Bedingung `x == y` | Hauptdiagonale identifizieren und ausgeben |
| Max-Wert Algorithmus | Grten Wert durch Vergleich in Schleife ermitteln |

##  Ausfhren

```bash
javac AMatrixArray.java
java AMatrixArray
```

> **Voraussetzungen:** Java JDK 8+  Keine externen Bibliotheken ntig
>  Aufgabe 8 erwartet Benutzereingabe: 4 ganze Zahlen fr die 22-Matrix

##  Dateistruktur

```
Java-Array-Matrix/
 AMatrixArray.java   # Alle Aufgaben (610) in einer Datei
```

##  ber die Entwicklerin

Dieses Projekt entstand als bungsaufgabe in der Berufsschule im Bereich mehrdimensionale Arrays.
Es zeigt meine Fhigkeit, verschachtelte Schleifen, Benutzereingaben und mathematische Auswertungen in Java umzusetzen.

 [GitHub Profil  BeataCegledi](https://github.com/BeataCegledi)
