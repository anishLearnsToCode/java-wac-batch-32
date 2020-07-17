package day2;

import java.util.Scanner;

public class Pattern2 {
    /*
        n = 4
        ___*
        __**
        _***
        ****

       n = 2
       _*
       **

       spaces: n - i - 1

       f : 1 2 3 4 5 ....
       i : 0 1 2 3 4
       stars: i + 1

       newline: 1
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0 ; i < n ; i++) {
            // print spaces
            for (int j = 0 ; j < n - i - 1 ; j++) {
                System.out.print(' ');
            }

            // print star
            for (int j = 0 ; j < i + 1 ; j++) {
                System.out.print('*');
            }

            // new line
            System.out.println();
        }
    }
}
