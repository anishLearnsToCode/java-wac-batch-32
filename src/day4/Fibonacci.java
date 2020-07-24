package day4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(fibonacci(number));
    }

    // f : 1 1 2 3 5 8 13 21 ....
    // f(0) = 1
    // f(1) = 1
    // f(n) = f(n - 1) + f(n - 2) (n >= 2)

    /*
        f(n)
        f(n-1)                  f(n-2)
        n-2       n-3           n-3         n-4

        1 + 2 + 4 + 8 + 16 + .... + 2^n = (2^(n+1) - 1) / (2 - 1) = 2^(n+1) - 1 = O(2^n)

        time complexity: O(2^n)
        space complexity: O(n)
     */
    private static long fibonacci(long number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
