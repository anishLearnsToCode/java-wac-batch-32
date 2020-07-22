package day5;

import java.util.Scanner;

public class SubArrayInArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int length = scanner.nextInt();
        int[] array = getArray(length);
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        print(subArray(array, startIndex, endIndex));
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
        {1, 2, 4, 5, 6, 100, 90, -67} (3, 6) --> [3, 4 5] --> [5 6 100]
        {-100, 90, 87, 34, 56, 231} (4, 6) --> [4 5] --> [56 231]
        {1, 2, 3} (1, 1) --> [] --> []
        {1, 2, 3} (1, 2) -> [1] --> [2]
     */
    private static int[] subArray(int[] array, int startIndex, int endIndex) {
        int[] result = new int[endIndex - startIndex];
        for (int i = startIndex ; i < endIndex ; i++) {
            result[i - startIndex] = array[i];
        }
        return result;
    }
}
