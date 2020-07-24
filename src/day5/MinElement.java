package day5;

import java.util.Scanner;

public class MinElement {
    private static final Scanner scanner = new Scanner(System.in);

    /*
        time complexity: O(n)
        space complexity: O(n)
     */
    public static void main(String[] args) {
        int length = scanner.nextInt();
        int[] array = getArray(length);
        System.out.println(minimum(array));
    }

    /*
        {1, 2, 3, 4} --> 1
        {1, -90, -100, 3} --> -100
        {} --> +Infinity

        time complexity: O(n)
        space complexity: O(1)
     */
    private static int minimum(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
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
}
