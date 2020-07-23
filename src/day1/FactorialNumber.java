package day1;

import java.util.Scanner;

public class FactorialNumber {
    /*
        N
        1 * 2 * 3 * 4 * ... * N
        0! = 1

        Time Complexity: K + k2 + k3 + n + k4 = O(n)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // 1
        int number = scanner.nextInt();                 // 1
        int product = 1, i = 1;                         // 2

        // time complexity: O(2 * number) O(number)
        while (i <= number) {
            product *= i;
            i++;
        }

        System.out.println(product);                    // O(1)
    }
}
