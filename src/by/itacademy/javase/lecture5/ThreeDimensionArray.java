package by.itacademy.javase.lecture5;

/**
 * @author Valeria Sterzhanova
 */
public class ThreeDimensionArray {

    public static void main(String[] args) {
        int[][][] threeDimArray1 = new int[4][3][3];

        int[][][] threeDimArray2 = new int[4][][];
        // необходимо инициализировать все вложенные массивы

        int[][][] threeDimArray3 = new int[][][]{
            {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
            {{4, 5, 6}, {4, 5, 6}, {4, 5, 6}},
            {{7, 8, 9}, {7, 8, 9}, {7, 8, 9}}
        };

        int[][][] threeDimArray4 = {
            {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
            {{4, 5, 6}, {4, 5, 6}, {4, 5, 6}},
            {{7, 8, 9}, {7, 8, 9}, {7, 8, 9}}
        }; // такая инициализация возможна только при объявлении

        // массив двумерных массивов
        int[][][] threeDimArray5 = {
            {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
            {{4, 5, 6}, {4, 5, 6}, {4, 5, 6}},
            {{7, 8, 9}, {7, 8, 9}, {7, 8, 9}}
        };

        int[][][] array = {
            {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
            {{4, 5, 6}, {4, 5, 6}, {4, 5, 6}},
            {{7, 8, 9}, {7, 8, 9}, {7, 8, 9}}
        };

        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[0][0].length);

        System.out.println("\nPrint three dimension array with for");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println("--");
            }
            System.out.println("---");
        }

        System.out.println("\nPrint three dimension array with foreach");
        for (int[][] twoDimArray : array) {
            for (int[] oneDimArray : twoDimArray) {
                for (int number : oneDimArray) {
                    System.out.print(number + " ");
                }
                System.out.println("--");
            }
            System.out.println("---");
        }

        System.out.println("\nDecrement values in three dimension array with foreach and for");
        for (int[][] twoDimArray : array) {
            for (int[] oneDimArray : twoDimArray) {
                for (int k = 0; k < oneDimArray.length; k++) {
                    oneDimArray[k] = --oneDimArray[k];
                    System.out.print(oneDimArray[k] + " ");
                }
                System.out.println("--");
            }
            System.out.println("---");
        }
    }
}
