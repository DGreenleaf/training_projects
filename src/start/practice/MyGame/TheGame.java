package start.practice.MyGame;

import java.util.Random;

/**
 * Created by Sergiy on 3/5/17.
 */

public class TheGame {

    //создадим двумерный массив поля ячеек размером 3х3 для нашей игры

    private static final char[][] GRID = new char[3][3];


    //заполним все элементы массива значениями пробелов (' ')

    public void initialization() {
        for (int i = 0; i < 3; i++)
            for (int p = 0; p < 3; p++)
                GRID[i][p] = ' ';
    }

    //нарисуем игровое поле

    public void displayBoard() {

        System.out.println("  1  " + GRID[0][0] + " | " + GRID[0][1] + " | " + GRID[0][2]);
        System.out.println("    ---*---*---");
        System.out.println("  2  " + GRID[1][0] + " | " + GRID[1][1] + " | " + GRID[1][2]);
        System.out.println("    ---*---*---");
        System.out.println("  3  " + GRID[2][0] + " | " + GRID[2][1] + " | " + GRID[2][2]);
        System.out.println("     1   2   3 ");
    }

    //выполним проверку на заполненность ячеек игрового поля
    //(если хотя бы одна из ячеек содержит значение ' ', то вернется false,
    // в другом случае все поле заполнено значениями)

    public boolean isBoardFilling() {
        boolean isFull = true;
        for (int i = 0; i < GRID.length; i++) {
            for (int j = 0; j < GRID.length; j++) {
                if (GRID[i][j] == ' ') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    //зададим условие, при котором назначается победа (все три значения в игровом поле равны и не пусты)

    private boolean checkValues(char v1, char v2, char v3) {
        return ((v1 != ' ') && (v1 == v2) && (v2 == v3));
    }

    //выполним проверку на победу при заполнении рядов (три значения в однмо ряду равны)

    private boolean checkRowForWin() {
        for (int i = 0; i < 3; i++)

        {
            if (checkValues(GRID[i][0], GRID[i][1], GRID[i][2])) {
                return true;
            }
        }
        return false;
    }

    //выполним проверку на победу при заполнении колонок (три значения в одной колонке равны)

    private boolean checkColumnForWin() {
        for (int i = 0; i < 3; i++)

        {
            if (checkValues(GRID[0][i], GRID[1][i], GRID[2][i])) {
                return true;
            }
        }
        return false;
    }

    //выполним проверку на победу при заполнении диагоналей (три значения по диагонали равны)

    private boolean checkDiagonalForWin() {
        return ((checkValues(GRID[0][0], GRID[1][1], GRID[2][2])) || (checkValues(GRID[0][2], GRID[1][1], GRID[2][0])));
    }

    // Проверка на общий результат игры. Возвращает true если победа, иначе возвращает false.

    public boolean checkForWin() {
        return (checkRowForWin() || checkColumnForWin() || checkDiagonalForWin());
    }


    //Зададим порядок изменения игроков в игре.

    public char changePlayer(char player) {
        if (player == 'x') {
            player = 'o';
        } else {
            player = 'x';
        }
        return player;
    }

    // поставим значение 'x' или 'o', которое задает игрок.

    public boolean checkSymbol(int row, int column) {

        // проверяем, попадает ли координата положения значения в наше игровое поле
        if ((row > 2 || column > 2) || (row < 0 || column < 0)) {

            return true;

            //проверяем наличие в указанной точке символа 'x' или 'o'
        } else if (GRID[row][column] == 'x' || GRID[row][column] == 'o') {
            return true;
        }
        return false;
    }


    //изменяем наше поле в связи с добавлением в заданные пользователем ячейки символов 'x' или 'o'

    public void changeBoard(char player, int row, int column) {
        GRID[row][column] = player;

    }

    // ход допустим, если выполняется условие

//    public boolean correctAction (int row, int column) {
//        return row >= 0 && row < 3 && column >= 0 && column < 3
//                &&
//                grid[row][column] == 0;
//    }


    //задаем правило, по которому ходит компьютер

    public int[] AI() { //начало метода AI

        Random random = new Random();

        int randomValue[] = new int[2];

        do {
            randomValue[0] = random.nextInt(GRID.length);
            randomValue[1] = random.nextInt(GRID.length);

        } while (checkSymbol(randomValue[0], randomValue[1]));
        return randomValue;

    } //окончание метода AI


}

