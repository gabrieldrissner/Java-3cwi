package at.gabriel.java.basics.basics;

import java.util.Random;
import java.util.Scanner;

public class ifclauses2 {
    public static void main(String[] args) {
        System.out.println("test");

        Random random = new Random();
        int randomnumber1 = random.nextInt(100);


        int randomnumber2 = random.nextInt(100);

        // Erstelle zwei Zufallszahl zwischen 0 und 100
        System.out.println(randomnumber1);
        System.out.println(randomnumber2);

        if(randomnumber1<randomnumber2 && randomnumber1<50){
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }
        else if(randomnumber1<30 && randomnumber2<30){
            System.out.println("Eine der beiden ist kleiner als 30");
        }
        else if(randomnumber1<50 && randomnumber2!=50) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
        else {
            System.out.println("Keine der Fälle trifft ein");
        }

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        // dann gib aus "Eine der beiden ist kleiner als 30"

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        // dann gib aus "Erste Zahl klein, zweite kein 50iger"


    }

    public static class Chemie2 {
        public static void main(String[] args) {

                    Scanner scanner = new Scanner(System.in);
                    String Alkane = scanner.next(); //Testet,nach Methan, Ethan, Propan, Butan,...
                    System.out.print("Geben Sie die Anzahl an l in Benzin an: "); //Wie viel l Benzin werden verbrennt
                    double benzinInL = scanner.nextInt(); //In Variable speicher


                    double MolAnzahl = 44;
                    double MolAlkane = 0;
                    double Einfachbindungen = 0;
                    if (Alkane.equals("Methan")) { //Abfrage nach den Alkanen
                        MolAlkane = 16.04;
                        Einfachbindungen = 1;
                    } else if (Alkane.equals("Ethan")) {
                        MolAlkane = 30.07;
                        Einfachbindungen = 2;
                    } else if (Alkane.equals("Propan")) {
                        MolAlkane = 44.1;
                        Einfachbindungen = 3;
                    } else if (Alkane.equals("Butan")) {
                        MolAlkane = 58.12;
                        Einfachbindungen = 4;
                    } else if (Alkane.equals("Pentan")) {
                        MolAlkane = 72.15;
                        Einfachbindungen = 5;
                    } else if (Alkane.equals("Hexan")) {
                        MolAlkane = 86.18;
                        Einfachbindungen = 6;
                    } else if (Alkane.equals("Heptan")) {
                        MolAlkane = 100.21;
                        Einfachbindungen = 7;
                    } else if (Alkane.equals("Oktan")) {
                        MolAlkane = 114.28;
                        Einfachbindungen = 8;
                    } else if (Alkane.equals("Nonan")) {
                        MolAlkane = 128.2;
                        Einfachbindungen = 9;
                    } else if (Alkane.equals("Decan")) {
                        MolAlkane = 142.29;
                        Einfachbindungen = 10;
                    }
                    System.out.println("CO2 in kg: "  + (benzinInL / MolAlkane * Einfachbindungen * MolAnzahl)) ; //Ausgabe wie viel CO2 ausgesetzt wird
                }
            }

    public static class Chemie {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Geben Sie die Anzahl der Oktananzahl ein: ");
            int n = scanner.nextInt();

            String reaktionsgleichung = n + " C8H18 + " + (25 - n) + " O2 → " + (8 * n) + " CO2 + " + (9 * n) + " H2O";
            System.out.println("Reaktionsgleichung: " + reaktionsgleichung);
        }
    }
}

