package by.itacademy.javase.lecture4;

public class InnerLoops {

    public static void main(String[] args) {
        printMultiplicationTable();

        checkForWithReturn();

        checkMarkWithBreak();

        checkMarkWithContinue();
    }

    // вложенный цикл на примере таблицы умножения
    static void printMultiplicationTable() {
        int result;

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {

                result = i * j;
                System.out.print(result);

                if (result / 10 == 0) {
                    System.out.print(" ");
                }

                System.out.print("  ");
            }

            System.out.println();
        }
    }

    // цикл for с оператором return
    static void checkForWithReturn() {
        for (int i = 0; i < 5; i++) {

            System.out.print(i);

            if (i == 3) {

                System.out.println();
                return;
            }

            System.out.println(" - Hello");
        }

        System.out.println("Code after for loop"); // won't be printed
    }

    // вложенный цикл for с меткой и оператором break
    static void checkMarkWithBreak() {
        out:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.println(i + " " + j);

                if (i == 2) {
                    System.out.println("loop break\n");
                    break out;
                }
            }

            System.out.println();
        }
    }

    // вложенный цикл for с меткой и оператором continue
    static void checkMarkWithContinue() {
        out:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.println(i + " " + j);

                if (i == 2) {
                    System.out.println("loop continue\n");
                    continue out;
                }
            }

            System.out.println();
        }
    }
}
