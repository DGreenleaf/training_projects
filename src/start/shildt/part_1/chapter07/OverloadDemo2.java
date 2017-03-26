package start.shildt.part_1.chapter07;

/**
 * Created by Sergiy on 3/26/17.
 */
class OverloadDemo2 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    void test(double a) {
        System.out.println(
                "Внутреннее преобразование при вызове test(double) a: " + a);
    }
}

class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i); //здесь вызывается вариант метода test(double)
        ob.test(123.2); //здесь вызывается вариант метода test(double)
    }
}