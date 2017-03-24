package start.shildt.part_1.chapter06;

/**
 * Created by Sergiy on 3/22/17.
 */
class BoxDemo7 {
    public static void main(String[] args) {
        //Объявить, выделить память и инициализировать объекты типа Box
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        //получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);

    }
}
