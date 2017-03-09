package start.practice.try6;

import java.util.Random;

/**
 * Created by Sergiy on 3/8/17.
 */
public class TicTac {


    private char chosenTicOrTac = ' ';
    private int nextMoveX = 0, nextMoveY = 0;
    private char winnerTicTac = ' ';

    private char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},
    };

    public char getTicOrTac() {
        return chosenTicOrTac;
    }

    public void setTicOrTac(char ticOrTac) {
        if (ticOrTac == 'x' || ticOrTac == 'o') {
            this.chosenTicOrTac = ticOrTac;
        }
    }

    public boolean gameEnded() {
        char[] ticTacs = {'x', 'o'};

        for (char ticTac : ticTacs) {
            if (
                    (board[0][0] == ticTac && board[0][1] == ticTac && board[0][2] == ticTac) ||
                            (board[1][0] == ticTac && board[1][1] == ticTac && board[1][2] == ticTac) ||
                            (board[2][0] == ticTac && board[2][1] == ticTac && board[2][2] == ticTac) ||
                            (board[0][0] == ticTac && board[1][0] == ticTac && board[2][0] == ticTac) ||
                            (board[0][1] == ticTac && board[1][1] == ticTac && board[2][1] == ticTac) ||
                            (board[0][2] == ticTac && board[1][2] == ticTac && board[2][2] == ticTac) ||
                            (board[0][0] == ticTac && board[1][1] == ticTac && board[2][2] == ticTac) ||
                            (board[0][2] == ticTac && board[1][1] == ticTac && board[2][0] == ticTac)
                    )
            {
                winnerTicTac = ticTac;
                return true;
            }
        }
        return this.noEmptyCells();
    }

    private boolean noEmptyCells() {
        for (int l = 0; l < board.length; l++) {
            for (int m = 0; m < board[l].length; m++) {
                if (board[l][m] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public void showBoard() {
        for (int i = 0; i < 5; i++) {
            StringBuilder row = new StringBuilder();
            if (i % 2 == 1) {
                System.out.println("---------");
            } else {
                for (int j = 0; j < 5; j++) {
                    if (j % 2 == 1) {
                        row.append(" | ");
                    } else {
                        row.append(board[i / 2][j / 2]);
                    }
                }
                System.out.println(row.toString());
            }
        }
    }

    public boolean validMove(String xy) {
        int move, moveX, moveY;
        try {
            move = Integer.parseInt(xy);
        } catch (Exception e) {
            return false;
        }
        moveX = move / 10;
        moveY = move % 10;
        if (moveX >= 1 && moveX <=3 && moveY >= 1 && moveY <= 3
                && board[moveX-1][moveY-1] == ' ') {
            nextMoveX = moveX;
            nextMoveY = moveY;
            return true;
        }
        return false;
    }

    public void updateBoard() {
        board[nextMoveX-1][nextMoveY-1] = this.getTicOrTac();
    }

    public void makeMyMove() {
        int myX, myY;

        boolean moveMade = false;
        char myTicTac;

        Random rand = new Random();
        myTicTac = this.getTicOrTac() == 'x' ? 'o' : 'x';

        while (!moveMade) {
            myX = rand.nextInt(3);
            myY = rand.nextInt(3);
            if (board[myX][myY] == ' ') {
                board[myX][myY] = myTicTac;
                moveMade = true;
            }
        }
    }

    public String getResult() {
        if (winnerTicTac == ' ') {
            return "Типа ничья :)";
        } else if (winnerTicTac == this.getTicOrTac()) {
            return "Прими поздравления, чувак! Ты выиграл :)";
        } else {
            return "Лузер, лузер! :)";
        }
    }
}