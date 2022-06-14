package by.itacademy.javase.lecture9.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodDemo {

    public static void main(String[] args) {

        Integer[] number = {1, 4, 7, 15, 77};
        String[] strings = {"df", "dftrt"};

        int i = 7;

        System.out.println(contains(7, number));
        System.out.println(contains(71, number));

        System.out.println(contains("df", strings));

        List<Integer> integerList = new ArrayList<>();
        List<String> list = new ArrayList<>();

    }

    static <T extends Comparable<T>, V extends T>
    boolean contains(T t, V[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(t)) {
                return true;
            }
        }
        return false;
    }
}
