package day3;

import java.util.Scanner;

public class Pattern1 {
    /*
        n = 5

        0: ____1
        1: ___121
        2: __12321
        3: _1234321
        4: 123454321

        spaces: n - i - 1
        increasing: (1, i + 1)
        decreasing: (i, 1)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0 ; i < number ; i++) {
            for (int j = 0 ; j < number - i - 1 ; j++) {
                System.out.print(' ');
            }

            for (int j = 1 ; j <= i + 1 ; j++) {
                System.out.print(j);
            }

            for (int j = i ; j >= 1 ; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
