package day3;

import java.util.Scanner;

public class Pattern2 {
    /*
        n = 5 (>= 2)
        ____*
        ___*_*
        __*___*
        _*_____*
        *********

        n = 3
        __*
        _*_*
        *****

        n = 10
        _________*
        ________*_*
        _______*___*

        main pattern
        spaces: n - i - 1
        star: 1

        f : -1 1 3 5 7 9
        i : 0 1 2 3 4 5
        spaces: 2i - 1

        star: i == 0 ? 0 : 1

        last row
        stars: 2n -1
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int row =0 ; row < rows - 1 ; row++) {
            for (int i = 0 ; i < rows - row - 1 ; i++) {
                System.out.print(' ');
            }

            System.out.print('*');

            for (int i = 0 ; i < 2 * row - 1 ; i++) {
                System.out.print(' ');
            }

            System.out.println(row == 0 ? ' ' : '*');
        }

        // last row
        for (int i = 0 ; i < 2 * rows - 1 ; i++) {
            System.out.print('*');
        }
    }
}
