package at.gabriel.java.basics.basics;

import java.util.Random;

public class Switch1 {
    public static void main(String[] args) {
        System.out.println("hello");

        Random random = new Random();
        int randomnumber = random.nextInt(5,11);

        System.out.println(randomnumber);


        switch (randomnumber){
            case 10:
                System.out.println("ten");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 6:
                System.out.println("six");
                break;
            case 5:
                System.out.println("five");
                break;
        }
    }
}