package by.itacademy.javase.lecture5;

import java.util.Arrays;

/**
 * @author Valeria Sterzhanova
 */
public class Varargs {

    public static void main(String[] args) {
        printVarargs(1, 2, 11, 12, 22);
        printVarargs();
//        varargsTypeAmbiguity(); // error
//        varargsParamNumberAmbiguity(1, 2, 3, 4); // error
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

    public static void varargsTypeAmbiguity(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static void varargsTypeAmbiguity(boolean... booleans) {
        System.out.println(Arrays.toString(booleans));
    }

    public static void varargsTypeAmbiguity(char... chars) {
        System.out.println(Arrays.toString(chars));
    }

    public static void varargsParamNumberAmbiguity(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static void varargsParamNumberAmbiguity(int number, int... numbers) {
        System.out.println(number);
        System.out.println(Arrays.toString(numbers));
    }
}
