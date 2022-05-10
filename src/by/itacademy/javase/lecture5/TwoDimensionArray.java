package by.itacademy.javase.lecture5;

/**
 * @author Valeria Sterzhanova
 */
public class TwoDimensionArray {

    public static void main(String[] args) {
        int[][] twoDimArray1 = new int[4][4];

        int[][] twoDimArray2 = new int[4][];
        // после для всех 4 массивов необходимо инициализировать массивы
        twoDimArray2[0] = new int[1];
        twoDimArray2[1] = new int[2];
        twoDimArray2[2] = new int[3];
        twoDimArray2[3] = new int[4];

        int[][] twoDimArray3 = new int[][]{
            {1, 1, 1},   // [0][3]
            {2, 2},      // [1][2]
            {3, 3, 3, 3} // [2][4]
        };

        int[][] twoDimArray4 = new int[][]{ // [3][3]
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        }; // такая инициализация возможна только при объявлении

        System.out.println("\nMatrix");
        for (int i = 0; i < twoDimArray4.length; i++) {
            for (int j = 0; j < twoDimArray4[i].length; j++) {
                System.out.print(twoDimArray4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nArray with inner arrays of different sizes");
        for (int i = 0; i < twoDimArray3.length; i++) {
            for (int j = 0; j < twoDimArray3[i].length; j++) {
                System.out.print(twoDimArray3[i][j] + " ");
            }
            System.out.println();
        }

        // пример для презентации
        int[][] array = new int[][]{ // [3][3]
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int[] numbers : array) {
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
