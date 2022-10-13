import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class bankomat {
    public static void main(String[] args) {
        int balance = 0;

        System.out.println("Selektieren Sie die gewünschte Funktion:");
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Ende");

        boolean gameIsRunning = false;
        while (!gameIsRunning) {

            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten:");
                int payin = scanner.nextInt();
                balance = balance + payin;
                System.out.println("Sie haben " + payin + " Euro eingezahlt.");

            } else if (selection == 2) {
                System.out.println("Geben Sie den Betrag ein den Sie abheben möchten:");
                int payoff = scanner.nextInt();
                balance = balance - payoff;
                System.out.println("Sie haben " + payoff + " Euro abgehoben.");
            } else if (selection == 3) {
                System.out.println("Ihr Kontostand beträgt " + balance + " Euro.");

            } else if (selection == 4) {
                System.out.println("Ende");
                gameIsRunning = true;
            }


        }
    }


}


