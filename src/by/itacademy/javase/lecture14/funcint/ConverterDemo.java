package by.itacademy.javase.lecture14.funcint;

import java.util.function.Function;

public class ConverterDemo {

    public static void main(String[] args) {

        Function<String, Integer> convert = Integer::valueOf;
        Integer result = convert.apply("1233");
    }
}
