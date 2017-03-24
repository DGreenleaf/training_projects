package start.shildt.part_1.chapter06;

/**
 * Created by Sergiy on 3/22/17.
 */
class Box {
    double width;
    double height;
    double depth;

    //Это конструктор класса Box
//    Box() {
//        System.out.println("Конструирование объекта Box");
//        width = 10;
//        height = 10;
//        depth = 10;
//    }

    Box(double w, double h, double d) {
        //System.out.println("Конструирование объекта Box");
        width = w;
        height = h;
        depth = d;
    }

    // вывести объем параллелепипеда

//    void volume() {
//        System.out.print("Объем равен ");
//        System.out.println(width * height * depth);
//    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

    //установить размеры параллелепипеда
//    void setDim(double w, double h, double d) {
//        width = w;
//        height = h;
//        depth = d;
//    }
}
