package day2;

import java.util.Scanner;

public class Pattern3 {
    /*
        n = 4
        1
        12
        123
        1234

        n = 2
        1
        12

        numbers: i + 1
        f : 1 2 3 4 ...
        j : 0 1 2 3 ...
        jth number: j + 1
     */

    /*
        Time Complexity: O(n^2)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0 ; i < n ; i++) {
            // printing numbers
            // i + 1 i [0, n]
            // 1 2 3 4 5 ... n
            // 1  + 2+ 3 + 4 + 5 + ... + n = n(n + 1) / 2 O(n^2)
            for (int j = 0 ; j < i + 1 ; j++) {
                System.out.print(j + 1);
            }

            // new line
            System.out.println();
        }
    }
}
