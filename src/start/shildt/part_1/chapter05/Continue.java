package start.shildt.part_1.chapter05;

/**
 * Created by Sergiy on 3/22/17.
 */

// Продемонстрировать применение оператора continue
class Continue {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }
}
