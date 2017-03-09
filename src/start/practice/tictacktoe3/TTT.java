package start.practice.tictacktoe3;

import java.util.Scanner;

/**
 * Created by Sergiy on 3/3/17.
 */
public class TTT {

    private TTT() {
        System.out.println("---------------------");
        System.out.println("    Tic Tac Toe     ");
        System.out.println("---------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        TTT t = new TTT();

        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = 2;
                System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
        int count = 0;

        do

        {
            int[][] turn1 = t.player1(a);
            t.display(turn1);
            int[][] turn2 = t.player2(turn1);
            t.display(turn2);
            int[][] turn3 = t.player1(turn2);
            t.display(turn3);
            int[][] turn4 = t.player2(turn3);
            t.display(turn4);
            int[][] turn5 = t.player1(turn4);
            t.display(turn5);
            if (t.checkwin(turn5))
                break;
            int[][] turn6 = t.player2(turn5);
            t.display(turn6);
            if (t.checkwin(turn6))
                break;
            int[][] turn7 = t.player1(turn6);
            t.display(turn7);
            if (t.checkwin(turn5))
                break;
            int[][] turn8 = t.player2(turn7);
            t.display(turn8);
            if (t.checkwin(turn5))
                break;
            int[][] turn9 = t.player1(turn8);
            t.display(turn9);
            if (t.checkwin(turn5))
                break;
            System.out.println("Game Draw");
            count++;
        } while (count == 1);

    }

    public boolean checkwin(int m[][]) {
        for (int i = 0; i < 3; i++) {
            if (m[i][0] == m[i][1] && m[i][1] == m[i][2]) {
                if (m[i][0] == 1) {
                    player1wins();
                    return true;
                } else if (m[i][0] == 0) {
                    player2wins();
                    return true;
                }
            }


            if (m[0][i] == m[1][i] && m[1][i] == m[2][i]) {
                if (m[0][i] == 1) {
                    player1wins();
                    return true;
                } else if (m[0][i] == 0) {
                    player2wins();
                    return true;
                }
            }
        }
            if (m[0][0] == m[1][1] && m[1][1] == m[2][2]) {
                if (m[0][0] == 1) {
                    player1wins();
                    return true;
                } else if (m[0][0] == 0) {
                    player2wins();
                    return true;
                }
            }
            return false;
        }

    public static void player1wins() {
        System.out.println("1st player wins");
    }

    public static void player2wins() {
        System.out.println("2nd player wins");
    }

    public void display(int matrix[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] player1(int matrix[][]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1st player's turn...");
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        matrix[x][y] = 1;
        return matrix;
    }

    public int[][] player2(int matrix[][]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("2nd player's turn...");
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        matrix[x][y] = 0;
        return matrix;
    }
}

