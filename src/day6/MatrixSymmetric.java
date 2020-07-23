package day6;

import java.util.Scanner;

public class MatrixSymmetric {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int length = scanner.nextInt();
        int[][] matrix = getMatrix(length);
        System.out.println(isSymmetric(matrix) ? "symmetric" : "not symmetric");
    }

    private static int[][] getMatrix(int length) {
        int[][] data = new int[length][length];
        for (int row = 0 ; row < length ; row++) {
            for (int column = 0 ; column < length ; column++) {
                data[row][column] = scanner.nextInt();
            }
        }
        return data;
    }

    /*
        3 x 3
        square matrix rows = columns
        a_ij has to be = a_ji

        1 0 0
        0 1 0
        0 0 1
        true

        1 2
        2 1
        true

     */
    private static boolean isSymmetric(int[][] matrix) {
        for (int row = 0 ; row < matrix.length ; row++) {
            for (int column = 0 ; column < matrix.length ; column++) {
                if (matrix[row][column] != matrix[column][row]) {
                    return false;
                }
            }
        }

        return true;
    }
}
