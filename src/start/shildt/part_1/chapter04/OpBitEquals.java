package start.shildt.part_1.chapter04;


class OpBitEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a |= 4; //поразрядная логическая операция ИЛИ с присваиванием
        b >>= 1; //Сдвиг вправо с присваиванием
        c <<= 1; //Сдвиг влево с присваиванием
        a ^= c; //поразрядная логическая операция, исключающая ИЛИ с присваиванием

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
