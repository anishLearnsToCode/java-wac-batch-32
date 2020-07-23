package day3;

import java.util.Scanner;

public class PascalTriangle {
    /*
        0C0
        1C0 1C1
        2C0 2C1 2C2
        3C0 3C1 3C2 3C3
        ..
        ..

        factorial(n) = n! = 1 * 2 * 3 * 4 * .... * n
        1! = 1
        2! = 1 * 2 = 2
        4! = 1 * 2 * 3 * 4 = 24
        5! = 1 * 2 * 3 * 4 * 5 = 120
        n! =  n * (n - 1)!
        5! = 5 * 4!

        nPr = n! / (n - r)!
        nCr = n! / ((n - r)! * r!)
     */

    // time complexity: O(n^3)
    // space complexity: O(1)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        // Time complexity: O(rows * i^2) = O(rows^3)
        for (int i = 0 ; i < rows ; i++) {
            // time complexity: O(i^2)
            for (int j = 0 ; j < i + 1 ; j++) {
                // print iCj
                // time complexity: O(i)
                System.out.print(combination(i, j) + " ");
            }
            System.out.println();
        }
    }

    // time complexity: O(n + n - r + r) = O(n)
    // space complexity: O(1)
    private static int combination(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    // time complexity: O(n)
    // space complexity: O(1)
    private static int factorial(int number) {
        int result = 1;
        for (int i = 1 ; i <= number ; i++) {
            result *= i;
        }
        return result;
    }
}
