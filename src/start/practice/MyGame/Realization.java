package start.practice.MyGame;

/**
 * Created by Sergiy on 3/5/17.
 */

public class Realization {

    //создадим двумерный массив поля ячеек размером 3х3 для нашей игры

    static final char[][] grid = new char[3][3];


    //заполним все элементы массива значениями пробелов (' ')

    public void initialization() {
        for (int i = 0; i < 3; i++)
            for (int p = 0; p < 3; p++)
                grid[i][p] = ' ';
    }

    //нарисуем игровое поле

    public void displayBoard() {

        System.out.println("  0  " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2]);
        System.out.println("    ---*---*---");
        System.out.println("  1  " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2]);
        System.out.println("    ---*---*---");
        System.out.println("  2  " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2]);
        System.out.println("     0   1   2 ");
    }

    //выполним проверку на заполненность ячеек игрового поля
    //(если хотя бы одна из ячеек содержит значение ' ', то вернется false,
    // в другом случае все поле заполнено значениями)

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

    public boolean checkValues(char v1, char v2, char v3) {
        return ((v1 != ' ') && (v1 == v2) && (v2 == v3));
    }

    //выполним проверку на победу при заполнении рядов (три значения в однмо ряду равны)

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

    public boolean checkDiagonalForWin() {
        return ((checkValues(grid[0][0], grid[1][1], grid[2][2]))
                || (checkValues(grid[0][2], grid[1][1], grid[2][0])));
    }

    // Проверка на общий результат игры. Возвращает true если победа, иначе возвращает false.

    public boolean checkForWin() {
        return (checkRowForWin() || checkColumnForWin() || checkDiagonalForWin());
    }


    //Зададим порядок изменения игроков в игре.

    public char changePlayer(char currentPlayer) {
        char newPlayer = ' ';
        if (currentPlayer == 'o')
            newPlayer = 'x';
        if (currentPlayer == 'x')
            newPlayer = 'o';
        return newPlayer;
    }

    // поставим значение 'x' или 'o', которое задает игрок.

    public boolean checkSymbol(int row, int column) {

        // проверяем, попадает ли координата положения значения в наше игровое поле
        if ((row > 2 || column > 2) || (row < 0 || column < 0))

            return true;

        //проверяем наличие в указанной точке символа 'x' или 'o'
        else if (grid[row][column] == 'x' || grid[row][column] == 'o')
            return true;

        return false;
    }


    //изменяем наше поле в связи с добавлением в заданные пользователем ячейки символов 'x' или 'o'

    public void changeBoard(char player, int row, int column) {
        grid[row][column] = player;

    }

}

