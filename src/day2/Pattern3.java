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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0 ; i < n ; i++) {
            // printing numbers
            for (int j = 0 ; j < i + 1 ; j++) {
                System.out.print(j + 1);
            }

            // new line
            System.out.println();
        }
    }
}
