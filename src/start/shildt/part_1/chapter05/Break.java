package start.shildt.part_1.chapter05;

/**
 * Created by Sergiy on 2/26/17.
 */
// Применение оператора break в качестве цивилизованной
// формы оператора qoto
class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second; // выход из блока second
                    System.out.println("Этот оператор не будет выполняться");
                }
                System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блоком second.");
        }
    }
}
