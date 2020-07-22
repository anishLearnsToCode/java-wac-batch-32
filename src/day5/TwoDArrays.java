package day5;

import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        int[] array = new int[10];

        // defining length of array is necessary
        int[][] matrix = new int[5][];
        matrix[0] = new int[10];
        matrix[1] = new int[2];
        matrix[2] = new int[20];
        matrix[3] = new int[5];
        matrix[4] = new int[7];

//        System.out.println(matrix[0].length);
//        System.out.println(matrix[1].length);
//        System.out.println(matrix[2].length);
//        System.out.println(matrix[3].length);
//        System.out.println(matrix[4].length);
//        System.out.println(matrix.length);

        int[][] data = new int[10][3];
//        data[0] = new int[45];
//        data[0] = null;
//        System.out.println(data[0]);
//        System.out.println(data[1]);
//        System.out.println(data[2]);
//        System.out.println(data[3]);

        System.out.println(Arrays.deepToString(data));

//        data[0] = new int[10];
//        data[5] = new int[3];

//        System.out.println(Arrays.deepToString(data));

        data[0][1] = 100;
        System.out.println(data[4][2]);
        System.out.println(Arrays.deepToString(data));
    }
}
