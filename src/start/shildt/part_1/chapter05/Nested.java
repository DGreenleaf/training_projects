package start.shildt.part_1.chapter05;

/**
 * Created by Sergiy on 2/25/17.
 */

// Циклы могут быть вложенными
class Nested {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}
