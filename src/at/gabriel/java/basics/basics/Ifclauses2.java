package at.gabriel.java.basics.basics;

import java.util.Random;
import java.util.Scanner;

public class Ifclauses2 {
    public static void main(String[] args) {

        System.out.println("test");

        Random random = new Random();
        int randomnumber1 = random.nextInt(100);


        int randomnumber2 = random.nextInt(100);

        // Erstelle zwei Zufallszahl zwischen 0 und 100
        System.out.println(randomnumber1);
        System.out.println(randomnumber2);

        if (randomnumber1 < randomnumber2 && randomnumber1 < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        } else if (randomnumber1 < 30 && randomnumber2 < 30) {
            System.out.println("Eine der beiden ist kleiner als 30");
        } else if (randomnumber1 < 50 && randomnumber2 != 50) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        } else {
            System.out.println("Keine der Fälle trifft ein");
        }

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        // dann gib aus "Eine der beiden ist kleiner als 30"

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        // dann gib aus "Erste Zahl klein, zweite kein 50iger"


    }

}