package day4;

import java.util.Scanner;

public class Binomial {
    /*
        time complexity: O(n^3)
        space complexity: O(n)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printPascalsTriangle(number);
    }

    /*
        time complexity: 0^2 + 1^2 + 2^2 + 3^2 + ... + rows^2 = O(rows^3)
        space complexity: max(i) = max(0, 1, 2, 3, 4, 5, 6 ... rows) = O(rows)

        0^2 + 0
        1^2 + 1
        2^2 + 2
        ..
        ..
        rows^2 + rows

        (o^2 + 1^2 + 2^2 + ... rows^2) + (0 + 1 + 2 + 3 + ... + rows)
        O(rows^3) + O(rows^2) = O(rows^3)
     */
    private static void printPascalsTriangle(int rows) {
        for (int i = 0 ; i < rows ; i++) {
            // i^2 = (rows/2)^2
            print(binomial(i));
        }
    }

    /*
        n = array.length
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
    private static int factorial(int number) {
        if (number == 0) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    // nPr = n! / (n - r)!
    /*
        time complexity: O(n)
        space complexity: max(n, n-r) = O(n)
     */
    private static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    // nCr = nPr / r!
    /*
        time complexity: O(n)
        space complexity: max(n, r) = O(n)
     */
    private static int combination(int n, int r) {
        return permutation(n, r) / factorial(r);
    }

    /*
        time complexity: O(n^2)
        space complexity: O(n)
     */
    private static int[] binomial(int n) {
        int[] result = new int[n + 1];
        for (int index = 0 ; index < result.length ; index++) {
            result[index] = combination(n, index);
        }
        return result;
    }
}
