package start.practice.try6;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 * Created by Sergiy on 3/8/17.
 */
public class TicTacToeGame {


    public static void main(String[] args) throws IOException {

        TicTac game = new TicTac();

        while (game.getTicOrTac() == ' ') {
            BufferedReader listener = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Выбери крестики (x) или нолики (o)");
            String chosen = listener.readLine();
            game.setTicOrTac(chosen.trim().charAt(0));
        }

        while (!game.gameEnded()) {
            game.showBoard();
            String nextMove = promptNextMove();
            if (game.validMove(nextMove)) {
                game.updateBoard();
                if (!game.gameEnded()) {
                    game.makeMyMove();
                }
            } else {
                System.out.println("Неверный ход");
                continue;
            }
        }

        game.showBoard();
        System.out.println(game.getResult());
    }

    private static String promptNextMove() throws IOException {

        BufferedReader listener = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ходи, чувак! (2 цифры - номер горизонтали сверху и номер вертикали слева)");
        String move = listener.readLine();

        return move;

    }

}

