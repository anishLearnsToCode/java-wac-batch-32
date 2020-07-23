package day2;

import java.util.Scanner;

public class Pattern6 {
    /*
    n = 6 ( >= 2), m
     ********
     *      *
     *      *
     *      *
     *      *
     ********

     n = 2, m = 3
     ***
     ***

     line of stars
     stars: m

     main pattern
     star: 1
     spaces: m - 2
     star: 1

     line of stars
     stars: m
     */

    /*
        Time complexity: m + nm + m
                            2m + nm
                            m (2 + n)
                            m * n
                            O(nm)
     */
    public static void main(String[] args) {
        // user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // first row
        // time Complexity: O(m)
        for (int i = 0 ; i < m ; System.out.print('*'), i++);
        System.out.println();

        // main pattern
        // Time complexity: O(n * m)
        for (int i = 0 ; i < n - 2 ; i++) {
            // Time Complexity: O(m)
            // print star
            System.out.print('*');

            // spaces
            for (int j = 0 ; j < m - 2 ; System.out.print('_'), j++);

            // star
            System.out.println('*');
        }

        // last row
        // time complexity: O(m)
        for (int i = 0 ; i < m ; System.out.print('*'), i++);
    }
}
