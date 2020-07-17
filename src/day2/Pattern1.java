package day2;

import java.util.Scanner;

public class Pattern1 {
    /*
        rows = 4
        #
        ##
        ###
        ####

        rows = 2
       0: #
       1: ##

       rows : n
       ith row: i + 1 characters
     */

    public static void main(String[] args) {
        /*
            For All pattern printing questions
            for (int row = 0 ; row < rows ; row++) {
                code for ith row
                System.out.println();
            }
         */

        /*
            n times
            for (int var = 0 ; var < n ; var++) {}
         */

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        // rows = 3
        for (int row = 0 ; row < rows ; row++) {
            // 1. print hashtags
            for (int i = 0 ; i < row + 1 ; i++) {
                System.out.print('#');
            }

            // 2. print new line
            System.out.println();
        }
    }
}
