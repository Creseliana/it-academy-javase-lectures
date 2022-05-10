package by.itacademy.javase.lecture4;

public class Loops {

    public static void main(String[] args) {

        // цикл while с переменной
        System.out.println("\nцикл while с переменной");
        int i = 0;
        while (i < 6) {
            System.out.println(i + " - Hello");
            i++;
        }

        // цикл while с boolean флагом
        System.out.println("\nцикл while с boolean флагом");
        boolean flag = true;
        int j = 0;
        while (flag) {
            System.out.println(j++ + " - Hello");
            if (j == 5) {
                flag = false;
            }
        }

        // цикл do-while с переменной
        // несмотря на то, что условие дает false,
        // тело цикла будет выполнено 1 раз
        System.out.println("\nцикл do-while с переменной");
        int k = 9;
        do {
            System.out.println(k + " - Hello");
            k++;
        } while (k < 6);

        // цикл for
        System.out.println("\nцикл for");
        for (int l = 0; l < 6; l++) {
            System.out.println(l);
        }

        // цикл foreach для перебора массива
        System.out.println("\nцикл foreach для перебора массива");
        int[] array = {1, 3, 5, 2, 9};

        for (int number : array) {
            System.out.println(number * number);
        }

        forLoopWithBreak();

        forLoopWithContinue();
    }

    // цикл for с оператором break
    static void forLoopWithBreak() {
        System.out.println("\nцикл for с оператором break");

        for (int i = 0; i < 6; i++) {
            System.out.print(i);

            if (i == 3) {
                System.out.println();
                break;
            }

            System.out.println(" - Hello");
        }

        System.out.println("After loop");
    }

    // цикл for с оператором continue
    static void forLoopWithContinue() {
        System.out.println("\nцикл for с оператором continue");

        for (int i = 0; i < 6; i++) {
            System.out.print(i);

            if (i == 3) {
                System.out.println();
                continue;
            }

            System.out.println(" - Hello");
        }

        System.out.println("After loop");
    }
}
