package start.practice.MyGame;

import java.util.Scanner;

/**
 * Created by Sergiy on 3/5/17.
 */

public class Main {

    private static boolean firstPlayer = true;

    public static void main(String[] args) {

        Realization realization = new Realization();
        Scanner input = new Scanner(System.in);

        int row, column;

        char player = 'x';


        realization.initialization();
        System.out.println("Начинаем нашу игру!\n");
        realization.displayBoard();

        while (true) {

            if (player == 'x') {

                System.out.println("\n" + "Игрок " + player + " ,укажите номер ряда:");
                row = input.nextInt() - 1;
                System.out.println("\n" + "Игрок " + player + " ,укажите номер колонки:");
                column = input.nextInt() - 1;
                realization.changeBoard(player, row, column);
                realization.displayBoard();
                realization.changePlayer(player);

                while (realization.checkSymbol(row, column)) {
                    System.out.println("Ячейка уже занята или находится вне игрового поля, пожалуйста, повторите корректный ввод.");
                    realization.displayBoard();
                    row = input.nextInt() - 1;
                    column = input.nextInt() - 1;
                }

            } else if (player == 'o') {
                int array[] = realization.AI();
                row = array[0];
                column = array[1];
                realization.changeBoard(player, row, column);
                realization.displayBoard();
                realization.changePlayer(player);
            }


//            player = realization.changePlayer(player);


            if (realization.checkForWin()) {
                System.out.println("С победой! Поздравляем игрока " + player + " !");
                System.exit(0);
            } else if (realization.boardFilling()) {
                System.out.println("Игра закончилась ничьей!");
                System.exit(0);
            }
        }

    }
}



