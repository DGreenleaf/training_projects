package start.practice.MyGame;


import java.util.Random;


/**
 * Created by Sergiy on 3/5/17.
 */

// DIMA: rename to more meaningful name.
// DIMA: example: public class Game
// DIMA: example2: public class TicTacToe
public class Realization {

    //создадим двумерный массив поля ячеек размером 3х3 для нашей игры

    // DIMA: make it private because it is used only in this class.

    // DIMA: make name to be in UPPERCASE. It is common rule for constants. Read Java Specification: http://docs.oracle.com/javase/specs/jls/se8/html/jls-6.html#jls-6.1 (search for "Constant Names").
    // DIMA: example: private static final char[][] GRID = new char[3][3];
    static final char[][] grid = new char[3][3];


    //заполним все элементы массива значениями пробелов (' ')

    // DIMA: make the function private and invoke it in the constructor
    // DIMA: example: public Realization() {
    // 						initialization();
    // 					}
    // DIMA: for more information: https://en.wikipedia.org/wiki/Facade_pattern
    public void initialization() {
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                grid[i][p] = ' ';
            }
        }
    }

    //нарисуем игровое поле

    public void displayBoard() {

        System.out.println("  1  " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2]);
        System.out.println("    ---*---*---");
        System.out.println("  2  " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2]);
        System.out.println("    ---*---*---");
        System.out.println("  3  " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2]);
        System.out.println("     1   2   3 ");
    }

    //выполним проверку на заполненность ячеек игрового поля
    //(если хотя бы одна из ячеек содержит значение ' ', то вернется false,
    // в другом случае все поле заполнено значениями)

    // DIMA: methods that return boolean value should start from "is"
    // example: public boolean isBoardFull() {...}

    // DIMA: try not to use "magic numbers".
    // 		From Wikipedia:
    //			magic numbers - unique values with unexplained meaning
    //								 or multiple occurrences
    //								 which could (preferably) be replaced with named constants.
    // In your case "3" is a magic number. You can use grid.length and grid[i].length instead

    // DIMA: algorithm can be improved. For example, if the first cell is empty, algorithm will still continue to check other cells. It is redundant.
    public boolean boardFilling() {
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' ') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    //зададим условие, при котором назначается победа (все три значения в игровом поле равны и не пусты)

    // DIMA: make the function private. It is used only internally
    public boolean checkValues(char v1, char v2, char v3) {
        return ((v1 != ' ') && (v1 == v2) && (v2 == v3));
    }

    //выполним проверку на победу при заполнении рядов (три значения в однмо ряду равны)
    // DIMA: make the function private. It is used only internally
    public boolean checkRowForWin() {
        for (int i = 0; i < 3; i++)

        {
            if (checkValues(grid[i][0], grid[i][1], grid[i][2])) {
                return true;
            }
        }
        return false;
    }

    //выполним проверку на победу при заполнении колонок (три значения в одной колонке равны)
    // DIMA: make the function private. It is used only internally
    public boolean checkColumnForWin() {
        for (int i = 0; i < 3; i++)

        {
            if (checkValues(grid[0][i], grid[1][i], grid[2][i])) {
                return true;
            }
        }
        return false;
    }

    //выполним проверку на победу при заполнении диагоналей (три значения по диагонали равны)
    // DIMA: make the function private. It is used only internally
    public boolean checkDiagonalForWin() {
        return ((checkValues(grid[0][0], grid[1][1], grid[2][2])) || (checkValues(grid[0][2], grid[1][1], grid[2][0])));
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
        } else if (grid[row][column] == 'x' || grid[row][column] == 'o') {
            return true;
        }

        return false;
    }


    //изменяем наше поле в связи с добавлением в заданные пользователем ячейки символов 'x' или 'o'

    public void changeBoard(char player, int row, int column) {
        grid[row][column] = player;

    }

    //задаем правило, по которому ходит компьютер

    public int[] AI() { //начало метода AI

        Random random = new Random();

        int randomValue[] = new int[2];

        do {
            // DIMA: try not to use "magic numbers".
            // 		From Wikipedia:
            //			magic numbers - unique values with unexplained meaning
            //								 or multiple occurrences
            //								 which could (preferably) be replaced with named constants.
            // In your case "3" is a magic number. You can use grid.length and grid[i].length instead

            randomValue[0] = random.nextInt(3);
            randomValue[1] = random.nextInt(3);

        }
        // DIMA: I fixed condition here.
        // was: while (!checkSymbol(randomValue[0], randomValue[1]));
        while (checkSymbol(randomValue[0], randomValue[1]));
        return randomValue;

    } //окончание метода AI


}

