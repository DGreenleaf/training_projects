package start.practice.MyGame;

import java.util.Scanner;

/**
 * Created by Sergiy on 3/5/17.
 */

public class Main {

    public static void main(String[] args) {

        Realization realization = new Realization();
        Scanner input = new Scanner(System.in);

        int row, column;
        char player = 'o';

        realization.initialization();
        System.out.println("Начинаем нашу игру!\n");
        realization.displayBoard();

        while (true) {
            player = realization.changePlayer(player);
            System.out.print("\n" + "Игрок " + player + " ,укажите номер ячейки (ряд, затем колонку):");
            row = input.nextInt();
            column = input.nextInt();

            while (realization.checkSymbol(row, column)) {
                System.out.println("Ячейка уже занята или находится вне игрового поля, пожалуйста, повторите корректный ввод.");
                realization.displayBoard();
                row = input.nextInt();
                column = input.nextInt();
            }
            realization.changeBoard(player, row, column);
            realization.displayBoard();

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



