package day3;

import java.util.Scanner;

public class Pattern6 {
    /*
        1
        2*3
        4*5*6
        7*8*9*10
        7*8*9*10
        4*5*6
        2*3
        1

        // increasing
        rows: n
        numbers: i + 1

        // decreasing
        rows: n
        numbers: n - i
        number(j): first_number_in_row(i) + j
        first_number_in_row(i):

        7, 7 - 3 = 4, 4 - 2 = 2, 2 - 1 = 1

        0 + 1 + 2 + 3 + (n-1) = n * (n - 1) / 2 + 1
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        // increasing
        for (int i = 0, number = 1 ; i < rows ; i++) {
            for (int j = 0 ; j < i + 1 ; j++) {
                System.out.print(number++ + (j == i ? "" : "*"));
                // number = 7
                // 7 + (3 == 4 ? "" : "*")
                // number++ --> number = 8
                // 7 + ("*")
                // 7 + "*"
                // "7" + "*"
                // "7*"
            }
            System.out.println();
        }

        // decreasing
        for (int i = 0, number = (rows * (rows - 1)) / 2 + 1 ; i < rows ; number -= rows - 1 - i, i++) {
            for (int j = 0 ; j < rows - i ; j++) {
                System.out.print(number + j + (j == rows - i - 1 ? "" : "*"));
            }
            System.out.println();
        }
    }
}
