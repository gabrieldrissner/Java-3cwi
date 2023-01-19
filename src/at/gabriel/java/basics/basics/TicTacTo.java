package at.gabriel.java.basics.basics;

import java.util.Scanner;

public class TicTacTo {


    public static void main(String[] args) {
        int[][] field = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        boolean gameIsRunning = true;
        printField(field);
        boolean player = true;

        while (true) {
            System.out.println("Geben sie ihr Feld ein:");
            String inputOfUser = scanner.next();
            String[] arr = inputOfUser.split(",");
            System.out.println(arr);
            int x = Integer.valueOf(arr[0]);
            int y = Integer.valueOf(arr[1]);
            field[x][y] = 1;

            if (player == true){
                player = false;
            }else {
                player = true;
            }

            printField(field);
            if (gameIsRunning) {
                gameIsRunning = false;
            } else {
                gameIsRunning = true;
            }
            System.out.println(gameIsRunning);
        }
    }

    public static void printField(int[][] playGround) {
        for (int row = 0; row < playGround.length; row++) {
            for (int col = 0; col < playGround.length; col++) {
                System.out.print(playGround[row][col] + " ");
            }
            System.out.println();
        }
    }
}


