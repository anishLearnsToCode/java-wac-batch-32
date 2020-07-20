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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < i + 1 ; j++) {
                // print iCj
                System.out.print(combination(i, j) + " ");
            }
            System.out.println();
        }
    }

    private static int combination(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    private static int factorial(int number) {
        int result = 1;
        for (int i = 1 ; i <= number ; i++) {
            result *= i;
        }
        return result;
    }
}
