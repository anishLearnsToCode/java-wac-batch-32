package day3;

import java.util.Scanner;

public class Pattern4 {
    /*
        A
        A B A
        A B C B A
        A B C D C B A

        increasing: (A, A + i)
        decreasing: (A + i - 1, A)
     */

    // time complexity: O(rows^2)
    // space complexity: O(1)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 0 ; i < rows ; i++) {
            for (char character = 'A' ; character <= 'A' + i ; character++) {
                System.out.print(character + " ");
            }

            // explicit typecasting
            for (char character = (char) ('A' + i - 1) ; character >= 'A' ; character--) {
                System.out.print(character + " ");
            }

            System.out.println();
        }
    }
}
