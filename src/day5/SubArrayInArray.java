package day5;

import java.util.Scanner;

public class SubArrayInArray {
    private static final Scanner scanner = new Scanner(System.in);

    /*
        time complexity: O(n)
        space complexity: O(n)
     */
    public static void main(String[] args) {
        int length = scanner.nextInt();
        int[] array = getArray(length);
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        print(subArray(array, startIndex, endIndex));
    }

    /*
        time complexity: O(n)
        space complexity: O(1)
     */
    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /*
        time complexity: O(n)
        space complexity: O(n)
     */
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

        time complexity: O(endIndex - startIndex)
        space complexity: O(endIndex - startIndex)
     */
    private static int[] subArray(int[] array, int startIndex, int endIndex) {
        int[] result = new int[endIndex - startIndex];
        for (int i = startIndex ; i < endIndex ; i++) {
            result[i - startIndex] = array[i];
        }
        return result;
    }
}
