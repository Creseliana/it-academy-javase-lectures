package by.itacademy.javase.lecture5;

import java.util.Arrays;

/**
 * @author Valeria Sterzhanova
 */
public class ArrayAsReferenceType {

    public static void main(String[] args) {
        int[] testArray = {1, 1, 3, 3};

        changeElementsInMethod(testArray);
        System.out.println(Arrays.toString(testArray));

        int i = 2, j = 3;
        changeSingleElementValue(i, j);
        System.out.println("i = " + i + ", j = " + j);

        changeReferenceToNewArray();

        variablesPointToTheSameReference();
    }

    static void changeElementsInMethod(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ++array[i];
        }
    }

    static void changeSingleElementValue(int oldNumber, int newNumber) {
        oldNumber = newNumber;
    }

    static void changeReferenceToNewArray() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println("Variable with old array reference:");
        System.out.println(Arrays.toString(array));

        int[] newArray = new int[4];
        newArray[0] = 10;
        newArray[1] = 11;
        newArray[2] = 12;
        newArray[3] = 13;

        array = newArray;
        System.out.println("Variable with new array reference:");
        System.out.println(Arrays.toString(array));
    }

    static void variablesPointToTheSameReference() {
        int[] array1 = new int[3];
        int[] array2 = array1;

        array1[1] = 3;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("Are arrays the same: " + (array1 == array2));
        System.out.println("Are arrays equal: " + Arrays.equals(array1, array2));
    }
}
