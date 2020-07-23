package day1;

import java.util.Scanner;

public class TernaryOperator {
    /*
    `   Time Complexity: O(1)
     */
    public static void main(String[] args) {
        /*
        condition ? value1 : value2

        if (condition) {
            return value1;
        } else {
            return value2;
        }
         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number % 2 == 0 ? "even" : "odd");
    }
}
