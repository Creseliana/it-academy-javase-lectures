package by.itacademy.javase.lecture5;

import java.util.Arrays;

/**
 * @author Valeria Sterzhanova
 */
public class AssignValuesToArrayCells {

    public static void main(String[] args) {
        int[] oneDimArray = new int[5];
        int[][] twoDimArray = new int[3][3];

        System.out.println("\nAssign values manually:");
        oneDimArray[0] = 0;
        oneDimArray[1] = 1;
        oneDimArray[2] = 2;
        oneDimArray[3] = 3;
        oneDimArray[4] = 4;

        System.out.println(Arrays.toString(oneDimArray));

        System.out.println("\nAssign values in loop:");
        for (int i = 0, j = 10; i < oneDimArray.length; i++, j++) {
            oneDimArray[i] = j;
        }

        System.out.println(Arrays.toString(oneDimArray));

        System.out.println("\nAssign values manually:");
        twoDimArray[0][0] = 1;
        twoDimArray[0][1] = 2;
        twoDimArray[0][2] = 3;
        twoDimArray[1][0] = 4;
        twoDimArray[1][1] = 5;
        twoDimArray[1][2] = 6;
        twoDimArray[2][0] = 7;
        twoDimArray[2][1] = 8;
        twoDimArray[2][2] = 9;

        System.out.println(Arrays.deepToString(twoDimArray));

        System.out.println("\nAssign values in loop:");
        int k = 99;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = k--;
            }
        }

        System.out.println(Arrays.deepToString(twoDimArray));
    }
}
