package start.shildt.part_1.chapter05;

/**
 * Created by Sergiy on 3/22/17.
 */

// Эта программа содержит ошибку
class BreakErr {

    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
        }

        for (int j = 0; j < 100; j++) {
            //if (j == 10) break one; //ОШИБКА!
            System.out.print(j + " ");
        }
    }
}