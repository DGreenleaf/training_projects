package start.practice.ticktacktoe;

import java.util.Scanner;

/**
 * Created by Sergiy on 3/2/17.
 */
public class Main {


    public static void main(String[] args) {
        char player = 'o';
        int row, column;
        Scanner k = new Scanner(System.in);
        Realization realization = new Realization();

        realization.initializeGame();
        System.out.println("Game ready !\n");

        while (true) {
            player = realization.changePlayer(player);
            System.out.print("\n" + player + " ,choose your location (row, column):");
            row = k.nextInt();
            column = k.nextInt();

            while (realization.checkIfLegal(row, column)) {
                System.out.println("That slot is already taken or out of bounds, please try again (row, column).");
                realization.displayBoard();
                row = k.nextInt();
                column = k.nextInt();
            }
            realization.changeBoard(player, row, column);
            realization.displayBoard();

            if (realization.checkIfWinner()) {
                System.out.println("\nThe winner is " + player + " !");
                break;

            }
            if (realization.checkIfTie()) {
                System.out.println("\nThe game is a tie !");
                break;
            }
        }


    }

}

