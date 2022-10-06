import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {
    public static void main(String[] args) {
        System.out.println("Drücken sie 1, um das Spiel zu starten");
        Random random = new Random();
        int amountOfPlayersWin = 0;
        int amountOfComputerWin = 0;
        int amountOfDraws = 0;

        boolean isFinished = false;
        int countOfGames = 0;
        while (isFinished == false) {
            Scanner scanner = new Scanner(System.in);
            int startGame = scanner.nextInt();
            if (startGame == 1) {
                System.out.println("Das Spiel startet");
            }
            for (int i = 0; i < 6; i++) {
                int randomComputer = random.nextInt(1, 7);
                int randomPlayer = random.nextInt(1, 7);

                if (randomPlayer>randomComputer){
                    amountOfPlayersWin=+1;
                    System.out.println("Sieg für den Spieler " + randomPlayer);

                } else if (randomComputer>randomPlayer) {
                    amountOfComputerWin=+1;
                    System.out.println("Sieg für den Computer " + randomComputer);

                }
                else {
                    amountOfDraws=+1;
                    System.out.println("Untentschieden");
                }

            if (i==5){
                isFinished=true;
            }
                }
            }
        if(amountOfPlayersWin>amountOfComputerWin){
            System.out.println("Mit " + amountOfPlayersWin + " Siegen gewinnt der Player gegen den Computer " + amountOfComputerWin);
        } else if (amountOfComputerWin>amountOfPlayersWin) {
            System.out.println("Mit " + amountOfComputerWin + " Siegen gewinnt der Computer gegen den Player " + amountOfPlayersWin);
        }
        else {
            System.out.println("Das Spiel endet Unentschieden " + amountOfDraws);
        }
    }
}