package day2;

import java.util.Scanner;

public class SumNNaturalNumbersSquare {
    /*
        N
        1^2 + 2^2 + 3^2 + ... + N^2
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

//        int sum = 0, i = 1;
//        while (i <= number) {
//            sum += i * i;
//            // sum = sum + i * i
//            // sum = sum + value
//            // sum = value2
//            // assignment
//            // sum <-- value2
//            i++;
//        }

        int sum = 0;
        for (int i = 1 ; i <= number ; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
