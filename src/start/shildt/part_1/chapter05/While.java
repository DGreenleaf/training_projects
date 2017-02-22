package start.shildt.part_1.chapter05;

/**
 * Created by Sergiy on 2/22/17.
 */
//Продемонстрировать применение оператора цикла while
class While {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.println("такт " + n);
            n--;
        }
    }
}
