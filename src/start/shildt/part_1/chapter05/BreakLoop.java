package start.shildt.part_1.chapter05;

/**
 * Created by Sergiy on 2/26/17.
 */

// Применение оператора break для выхода из цикла
class BreakLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) break;   // выход из цикла, если значение
                                // переменной i равно 10
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");
    }
}
