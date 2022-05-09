package by.itacademy.javase.lecture5;

import java.util.Arrays;

/**
 * @author Valeria Sterzhanova
 */
public class ArrayAsReferenceType {

    public static void main(String[] args) {
        int[] testArray = {1, 1, 3, 3};

        changeElements(testArray);
        System.out.println(Arrays.toString(testArray));
        testArray.clone();
    }

    static void changeElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ++array[i];
        }
    }
}
