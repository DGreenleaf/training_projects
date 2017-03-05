package start.shildt.part_1.chapter05;

/**
 * Created by Sergiy on 2/26/17.
 */
// Применение оператора break во вложенных циклах
class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break;
                // выход из цикла, значение
                // переменной j равно 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
