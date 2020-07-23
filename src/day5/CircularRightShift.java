package day5;

import java.util.Scanner;

public class CircularRightShift {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int length = scanner.nextInt();
        int[] array = {1, 2, 3, 4, 5} ;
        shift(array, 500_000_003);
        print(array);
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] getArray(int length) {
        int[] array = new int[length];
        for (int index = 0 ; index < array.length ; index++) {
            array[index] = scanner.nextInt();
        }
        return array;
    }

    /*
        {1, 2, 3, 4, 5} r=1 {5, 1, 2, 3, 4}
        {1 2 3 4 5} r = 2 {4 5 1 2 3}
        {1 2 3 4 5} r = 3 {3 4 5 1 2}
        {1 2 3 4 5} r = 4 {2 3 4 5 1}
        {1 2 3 4 5} r = 5 {1 2 3 4 5}
     */
    private static void shift(int[] array, int rotations) {
        rotations %= array.length;
        while (rotations-- > 0) {
            rightShift(array);
        }
    }

    // pass by reference
    // len: 5 n (0 , n-1)
    // {-100 9 8 4 5} r r % n
    // r: 0 1 2 3 4 5 6 7 8 9 10 11 12 ...
    // r: 0 1 2 3 4 0 1 2 3 4 0  1  2  ...
    private static void rightShift(int[] array) {
        int lastIndex = array[array.length - 1];
        for (int index = array.length - 1 ; index > 0 ; index--) {
            array[index] = array[index - 1];
        }
        array[0] = lastIndex;
    }
}
