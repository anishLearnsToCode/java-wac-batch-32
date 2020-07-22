package day5;

import java.util.Scanner;

public class CircularRightShift {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int length = scanner.nextInt();
        int[] array = getArray(length);
//        print(shift(array, 2));
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
//    private static int[] shift(int[] array, int rotations) {
//
//    }
}
