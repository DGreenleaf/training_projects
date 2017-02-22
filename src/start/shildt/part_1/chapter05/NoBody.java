package start.shildt.part_1.chapter05;

/**
 * Created by Sergiy on 2/22/17.
 */
//Целевая часть цикла может быть пустой
class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        // рассчитать среднее значение переменных i и j

        while (++i < --j) ; // у этого цикла отсутствует тело

        System.out.println("Среднее значение равно " + i);


    }
}
