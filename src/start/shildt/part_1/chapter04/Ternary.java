package start.shildt.part_1.chapter04;

// Продемонстрировать применение тернарной операции ?
class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;

        k = i < 0 ? -i : i; // nолучить абсолютное значения переменной i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i; // nолучить абсолютное значения переменной i

        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);

    }
}
