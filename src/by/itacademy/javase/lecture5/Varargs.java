package by.itacademy.javase.lecture5;

/**
 * @author Valeria Sterzhanova
 */
public class Varargs {

    public static void main(String[] args) {
        printVarargs(1, 2, 11, 12, 22);
        printVarargs();
    }

    public static void printVarargs(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("Empty varargs");
            return;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
