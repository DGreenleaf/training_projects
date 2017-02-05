package start.shildt.part_1.chapter03;


class Light {

// Вычислить расстояние, проходимое светом,
// 11 используя переменные типа lonq

    public static void main(String[] args) {

        int lightspeed;
        long days;
        long seconds;
        long distance;

        // приблизительная скорость света, миль в секунду

        lightspeed = 186000;

        days = 1000; // указать количества дней

        seconds = days * 24 * 60 * 60;

        // вычислить расстояние

        distance = lightspeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");


    }

}
