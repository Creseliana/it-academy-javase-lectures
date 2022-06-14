package by.itacademy.javase.lecture9.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericInterfaceDemo {

    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 7, 88, 15, 77, -1, 7};
        String[] strings = {"ba", "abc", "ab"};
        MinMaxInterface<Integer> integerInterface = new MinMaxInterfaceImpl<>(numbers);
        System.out.println(integerInterface.min());
        System.out.println(integerInterface.max());
        MinMaxInterface<String> stringInterface = new MinMaxInterfaceImpl<>(strings);
        System.out.println(stringInterface.min());
        System.out.println(stringInterface.max());

        List list = new ArrayList();
//        list = ;
    }
}
