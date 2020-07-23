package day3;

import java.util.Scanner;

public class MultiplicationTable {
    /*
        number
        1 * number
        2 * number
        3 * number
        4 * number
        ..
        ..
        ..
        10
     */

    // time complexity: O(1)
    // space complexity: O(1)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
