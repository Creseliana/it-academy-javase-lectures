package by.itacademy.javase.lecture5;

/**
 * @author Valeria Sterzhanova
 */
public class ArrayExceptions {

    public static void main(String[] args) {

        try {
            int[] array = null;
            int number = array[0];
        } catch (NullPointerException e) {
            System.out.println("NullPointerException was caught");
            e.printStackTrace();
        }

        try {
            int[][] array = new int[3][];
            int number = array[0][0];
        } catch (NullPointerException e) {
            System.out.println("NullPointerException was caught");
            e.printStackTrace();
        }

        try {
            int[] array = new int[-3];
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException was caught");
            e.printStackTrace();
        }

        try {
            int[] array = new int[3];
            int number = array[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException was caught");
            e.printStackTrace();
        }

        try {
            Object[] array = new String[5];
            array[0] = Integer.valueOf("3");
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException was caught");
            e.printStackTrace();
        }

        try {
            int[] array = new int[0]; // array will be created
            System.out.println(array.length);
            array[0] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException was caught");
            e.printStackTrace();
        }
    }
}
