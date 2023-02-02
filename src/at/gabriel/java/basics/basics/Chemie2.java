package at.gabriel.java.basics.basics;

import java.util.Scanner;

public class Chemie2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Anzahl der Oktananzahl ein: ");
        int n = scanner.nextInt();

        String reaktionsgleichung = n + " C8H18 + " + (25 - n) + " O2 → " + (8 * n) + " CO2 + " + (9 * n) + " H2O";
        System.out.println("Reaktionsgleichung: " + reaktionsgleichung);
    }
}
