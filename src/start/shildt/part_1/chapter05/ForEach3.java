package start.shildt.part_1.chapter05;

/**
 * Created by Sergiy on 2/25/17.
 */

// Применение цикла for в стиле for each для
// обращения к двухмерному массиву
class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // присвоить значение элементам массива nums

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
//                System.out.print(nums[i][j] + " ");
            }


        // использовать цикл for в стиле for each для
        // вывода и суммирования значений

        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("Значение равно: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: " + sum);

    }
}
