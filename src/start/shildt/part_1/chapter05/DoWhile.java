package start.shildt.part_1.chapter05;

/**
 * Created by Sergiy on 2/22/17.
 */
//Продемонстрировать применение оператора цикла do-while

class DoWhile {
    public static void main(String[] args) {
        int n = 10;
//        do {
//            System.out.println("такт " + n);
//            n--;
//        } while (n > 0);
        do {
            System.out.println("такт " + n);
        } while (--n > 0);
    }
}
