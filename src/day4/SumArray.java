package day4;

import java.util.Scanner;

public class SumArray {
    /*
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

        System.out.println(sumElements(array));
    }

    // return sum of all elements
    /*
        time complexity: O(n)
        space complexity: O(1)
     */
    private static int sumElements(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}
