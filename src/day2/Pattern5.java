package day2;

import java.util.Scanner;

public class Pattern5 {
    /*
        n = 4
        ___*
        __***
        _*****
        *******

        n = 2
        _*
        ***

        n = 3
        __*
        _***
        *****

        n = 4
        f : 3 2 1 0
        i : 0 1 2 3
        spaces : n - i - 1

        f : 1 3 5 7
        i : 0 1 2 3
        stars : 2 * i + 1

        total: n - i - 1 + 2i + 1
        ``n + i = n + n/2 = 3n/2

        time complexity: n * 3n/2 = O(n^2)

        new line : 1
     */

    public static void main(String[] args) {
        // take user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


    }
}
