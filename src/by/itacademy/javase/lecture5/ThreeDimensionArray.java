package by.itacademy.javase.lecture5;

/**
 * @author Valeria Sterzhanova
 */
public class ThreeDimensionArray {

    public static void main(String[] args) {
        // массив двумерных массивов
        int[][][] array = {
            {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
            {{4, 5, 6}, {4, 5, 6}, {4, 5, 6}},
            {{7, 8, 9}, {7, 8, 9}, {7, 8, 9}}
        };

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
