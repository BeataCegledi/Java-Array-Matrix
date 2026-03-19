/*Fortgeschritten: Aufgaben zu mehrdimensionalen Arrays
Aufgabe 6: 3×3 Matrix
Erstelle eine 3x3-Matrix mit ganzzahligen Werten von 1 bis 9. Gib die Matrix in Tabellenform aus.
int[][] matrix = new int[3][3]; / Werte einfügen / Ausgabe mit verschachtelter Schleife
Aufgabe 7: Matrix – Summe der Zeilen
Berechne für jede Zeile der Matrix aus Aufgabe 6 die Summe der Elemente und gib sie aus.
Aufgabe 8: Benutzerdefinierte Matrix
Lass den Benutzer die Werte einer 2x2-Matrix eingeben. Gib danach die Matrix und ihre Transponierte aus.
Transponierte bedeutet: Zeilen und Spalten tauschen.
Aufgabe 9: Diagonale einer Matrix
Erstelle eine 4×4-Matrix und fülle sie mit beliebigen Werten. Gib nur die Elemente der Hauptdiagonale aus 
(Positionen [0][0], [1][1], [2][2], [3][3]).
Aufgabe 10: Zufällige Matrix mit Auswertung
Erzeuge eine 5×5-Matrix mit Zufallswerten zwischen 0 und 9. Ermittle: Die Summe aller Elemente / Den größten Wert in der gesamten Matrix */
import java.util.Scanner;

public class AMatrixArray {
    public static void main(String[] args) {
        System.out.println("Aufgabe 6: 3x3 MAtrix\n");
        int[][] matrix = new int[3][3];
        for (int x=0; x<3;x++){
            for (int y=0; y<3;y++){
                matrix[x][y]=(x*3)+(y+1);
                System.out.print(matrix[x][y]+", ");
            }    
        System.out.println();
        }

        System.out.println("\n\nAufgabe 7: Matrix - Summe der Zeilen\n");
        int summe;
        for (int x=0; x<3;x++){
            summe = 0;
            for (int y=0; y<3;y++){
                matrix[x][y]=(x*3)+(y+1);
                System.out.print(matrix[x][y]+", ");
                summe = summe +matrix[x][y];
            }    
        System.out.print("Summe der "+(x+1)+". Linie ist: "+summe+"\n");
        }
        
        System.out.println("\n\nAufgabe 8: Benutzerdefinierte Matrix\n");
        int[][] matrix1 = new int[2][2];
        Scanner eingabe = new Scanner(System.in);
        for (int x=0; x<2;x++){
            for (int y=0; y<2;y++){
                System.out.println("Gib den "+(x+1)+"."+(y+1)+" Zahl ein:");
                int zahl = eingabe.nextInt();
                matrix1[x][y]=zahl;                
            }        
        }
        System.out.println("Matrix:");
        for (int x=0; x<2;x++){
            for (int y=0; y<2;y++){
                System.out.print(matrix1[x][y]+", ");
            }    
        System.out.println();
        }
        System.out.println("Transponierte Matrix:");
        for (int x=0; x<2;x++){
            for (int y=0; y<2;y++){
                System.out.print(matrix1[y][x]+", ");
            }    
        System.out.println();
        }        
        
        System.out.println("\n\nAufgabe 9: Diagonale einer Matrix\n");
        int[][] matrix2 = new int[4][4];
        for (int x=0; x<4;x++){
            for (int y=0; y<4;y++){
                int zahl= (int)(Math.random() * 100);
                matrix2[x][y]= zahl;
                if (x==y){
                    System.out.print(matrix2[x][y]+" ");}
                else {
                    System.out.print("   ");}                
            }
            System.out.println();
        }    

        System.out.println("\n\nAufgabe 10: Zufällige Matrix mit Auswertung");
             int[][] matrix5 = new int[5][5];
             int summ = 0;
             int groesste=0;
        for (int x=0; x<5;x++){
            for (int y=0; y<5;y++){
                int zahl= (int)(Math.random() * 10);
                matrix5[x][y]= zahl;
                summ = summ + zahl;
                if (zahl>groesste){
                    groesste=zahl;
                }
            System.out.print(matrix5[x][y]+", ");    
            }
        System.out.println();
        }    
        System.out.println("\nDie summe der Matrix ist: "+summ);
        System.out.println("\nDie grösste Zahl ist: "+groesste); 
    }
}

