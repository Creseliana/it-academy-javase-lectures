package by.itacademy.javase.lecture5;

import java.util.Arrays;

/**
 * @author Valeria Sterzhanova
 */
public class ArrayMethods {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        int[] array5 = {1, 2, 2, 4};
        int[] array6 = {7, 2, 6, 4};
        int[] array7 = new int[5];
        int[][] array3 = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}};
        int[][] array4 = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}};

        int length = array1.length;
        System.out.println("Array length is: " + length);

        System.out.println("Hexadecimal representation of the hash code of the array object:");
        System.out.println(array1); // имя класса и хэш-код объекта в шестнадцатеричном виде
        System.out.println(array1.toString()); // равнозначно строке выше

        System.out.print("Content of the array:");
        System.out.println(Arrays.toString(array1));
        System.out.print("Content of the multi dimension array:");
        System.out.println(Arrays.deepToString(array3));

        System.out.println("Are arrays the same: " + (array1 == array2));
        System.out.println("Are arrays equal objects: " + array1.equals(array2)); // not recommended
        System.out.println("Are arrays equal: " + Arrays.equals(array1, array2));
        System.out.println(
            "Are multi dimension arrays equal: " + Arrays.deepEquals(array3, array4));
        System.out.println("Index of the element 3 is: " + Arrays.binarySearch(array1, 3));

        System.out.print("Fills array with given number: ");
        Arrays.fill(array7, 5);
        System.out.println(Arrays.toString(array2));

        System.out.println(
            "Arrays have the same numbers up to the index: " + Arrays.mismatch(array2, array5));

        System.out.println("Array before sorting: " + Arrays.toString(array6));
        Arrays.sort(array6);
        System.out.println("Array after sorting: " + Arrays.toString(array6));

        System.out.println("Cloning the array...");
        int[] clonedArray = array1.clone();
        System.out.println("Are arrays the same: " + (array1 == clonedArray));
        System.out.println("Are arrays equal: " + Arrays.equals(array1, clonedArray));
    }
}
