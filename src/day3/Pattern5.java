package day3;

import java.util.Scanner;

public class Pattern5 {
    /*
         *
         **
         ***
         ****
         ***
         **
         *

        increasing: n - (n/2)
        stars: i + 1

        decreasing: n/2
        stars: (n/2 - i, 1)

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        // increasing
        for (int i = 0 ; i < rows - rows /2 ; i++) {
            for (int j = 0 ; j < i + 1 ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // decreasing pattern
        for (int i = 0 ; i < rows / 2 ; i++) {
            for (int j = 0 ; j < rows / 2 - i ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
