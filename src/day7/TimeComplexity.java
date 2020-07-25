package day7;

import java.util.Scanner;

public class TimeComplexity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /*
            n n/2 n/4 n/8 n/16 n/32...... n/2^k = 1
            n/2^k = 1
            2^k/n = 1
            2^k = n
            k log(2) = log(n)
            k = log(n) / log(2)
            k = O(log(n))

            time complexity: O(log(n))
            space complexity: O(1)
         */
        while (n > 1) {
            System.out.println(n);
            n /= 2;
        }
    }
}
