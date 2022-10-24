import java.util.Scanner;

public class TicTacTo {
    public static void main(String[] args) {
        System.out.println("Drücken Sie 1 um das Spiel zu starten");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        if (selection == 1) {
            System.out.println("Das Spiel beginnt");
        } else {
            System.out.println("Error");
        }

        char[][] field = new char[3][3];
        int actualPlayer = 0;

        while (true) {
            boolean isValid = false;
            while (isValid) {
                System.out.println("Triff deine Wahl Spieler " + actualPlayer);
                String input = String.valueOf(scanner.nextInt());
                String[] values = input.split(",");
                int x = Integer.parseInt(values[0]);
                int y = Integer.parseInt(values[1]);
             if (field[x][y] =  '\000000'){

             }

            }
        }

    }


}

