package day4;

import java.util.Scanner;

public class ArrayInput {
    /*
        n = array.length
        time complexity: O(n)
        space complexity: O(n)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int index = 0 ; index < array.length ; index++) {
            array[index] = scanner.nextInt();
        }

        print(array);
    }

    /*
        n = array.length
        time complexity: O(n)
        space complexity: O(1)
     */
    private static void print(int[] array) {
        for (int index = 0 ; index < array.length ; index++) {
            System.out.print(array[index] + " ");
        }
    }
}
