package day5;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayInput {
    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int rows = scanner.nextInt();
//        int[][] data = new int[rows][];

//        for (int row = 0 ; row < rows ; row++) {
//            int length = scanner.nextInt();
//            data[row] = new int[length];
//            for (int index = 0 ; index < length ; index++) {
//                data[row][index] = scanner.nextInt();
//            }
//        }

//        System.out.println(Arrays.deepToString(data));

        int[][] data = new int[3][4];
        for (int row = 0 ; row < 3 ; row++) {
//            int length = scanner.nextInt();
            for (int index = 0 ; index < 4 ; index++) {
                data[row][index] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(data));
    }
}
