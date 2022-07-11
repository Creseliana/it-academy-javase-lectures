package by.itacademy.javase.lecture14.lambda;

import java.util.function.Supplier;

public class VariableWithLambda {

    static int i = 10;
    static int j = 20;

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> {
            i = 30;
            return i + j;
        };

        System.out.println(supplier.get());
        System.out.println(i);
    }

    private static void test() {
        int n = 5;
        int m = 6;
        Supplier<Integer> supplier = () -> {
//            n = 7;
            return n + m;
        };
    }
}
