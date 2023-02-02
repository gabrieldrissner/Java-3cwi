package at.gabriel.java.basics.basics;

import java.util.Scanner;

public class Chemie1 {
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
        System.out.println("CO2 in kg: " + (benzinInL / MolAlkane * Einfachbindungen * MolAnzahl)); //Ausgabe wie viel CO2 ausgesetzt wird
    }
}

