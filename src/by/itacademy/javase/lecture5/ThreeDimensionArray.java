package by.itacademy.javase.lecture5;

/**
 * @author Valeria Sterzhanova
 */
public class ThreeDimensionArray {

    public static void main(String[] args) {
        int[][][] threeDimArray1 = new int[4][3][3];

        int[][][] threeDimArray2 = new int[4][][];

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
        int[][][] array = {
            {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
            {{4, 5, 6}, {4, 5, 6}, {4, 5, 6}},
            {{7, 8, 9}, {7, 8, 9}, {7, 8, 9}}
        };

        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[0][0].length);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println("--");
            }
            System.out.println("---");
        }
    }
}
