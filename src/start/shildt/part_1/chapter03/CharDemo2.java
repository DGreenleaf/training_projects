package start.shildt.part_1.chapter03;



// Символьные переменные ведут себя как целочисленные значения

class CharDemo2 {
    public static void main(String[] args) {

        char ch1;
        ch1 = 'X';

        System.out.println("ch1 содержит " + ch1);

        ++ch1; // увеличить на единицу значение переменной ch1


        System.out.println("ch1 теперь содержит " + ch1++);

    }
}
