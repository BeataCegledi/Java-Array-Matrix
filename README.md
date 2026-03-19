# ☕ Java Array Matrix

> Übungsaufgaben zu mehrdimensionalen Arrays und Matrizen – entwickelt im Rahmen der Umschulung zur Fachinformatikerin Anwendungsentwicklung (FANW).

## 📋 Projektbeschreibung

Dieses Projekt enthält 5 aufeinander aufbauende Aufgaben rund um zweidimensionale Arrays (Matrizen) in Java.
Die Aufgaben decken die Erstellung, Befüllung, Auswertung und visuelle Ausgabe von Matrizen ab – von einer einfachen 3×3-Matrix bis hin zu einer zufällig generierten 5×5-Matrix mit statistischer Auswertung.

## 🚀 Aufgaben Übersicht

| Aufgabe | Thema | Beschreibung |
|---------|-------|-------------|
| 6 | 3×3 Matrix | Matrix mit Werten 1–9 erstellen und in Tabellenform ausgeben |
| 7 | Zeilensummen | Summe jeder Zeile berechnen und ausgeben |
| 8 | Benutzereingabe | 2×2-Matrix einlesen, Original und Transponierte ausgeben |
| 9 | Hauptdiagonale | 4×4-Zufallsmatrix, nur Diagonale `[0][0]`–`[3][3]` ausgeben |
| 10 | Zufallsmatrix | 5×5-Matrix mit Zufallswerten: Gesamtsumme und größten Wert ermitteln |

## 🧠 Verwendete Java-Konzepte

| Konzept | Anwendung im Projekt |
|---------|---------------------|
| `int[][]` | Zweidimensionale Arrays (Matrizen) deklarieren und befüllen |
| Verschachtelte `for`-Schleifen | Zeilen und Spalten durchlaufen |
| `Scanner` | Benutzereingabe für 2×2-Matrix (Aufgabe 8) |
| `Math.random()` | Zufallszahlen generieren (Aufgaben 9, 10) |
| Transponierte Matrix | Zeilen und Spalten tauschen mit `matrix[y][x]` |
| Bedingung `x == y` | Hauptdiagonale identifizieren und ausgeben |
| Max-Wert Algorithmus | Größten Wert durch Vergleich in Schleife ermitteln |

## ▶️ Ausführen

```bash
javac AMatrixArray.java
java AMatrixArray
```

> **Voraussetzungen:** Java JDK 8+ · Keine externen Bibliotheken nötig
> ⚠️ Aufgabe 8 erwartet Benutzereingabe: 4 ganze Zahlen für die 2×2-Matrix

## 📁 Dateistruktur

```
Java-Array-Matrix/
└── AMatrixArray.java   # Alle Aufgaben (6–10) in einer Datei
```

## 👩‍💻 Über die Entwicklerin

Dieses Projekt entstand als Übungsaufgabe in der Berufsschule im Bereich mehrdimensionale Arrays.
Es zeigt meine Fähigkeit, verschachtelte Schleifen, Benutzereingaben und mathematische Auswertungen in Java umzusetzen.

🔗 [GitHub Profil – BeataCegledi](https://github.com/BeataCegledi)
