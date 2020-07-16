package day1;

import java.util.Scanner;

public class FactorialNumber {
    /*
        N
        1 * 2 * 3 * 4 * ... * N
        0! = 1
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int product = 1, i = 1;

        while (i <= number) {
            product *= i;
            i++;
        }

        System.out.println(product);
    }
}
