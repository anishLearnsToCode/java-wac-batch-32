package day5;

import java.util.Scanner;

public class PowerSum {
    /*
        N
        1 + 2^2 + 3^3 + 4^4 + ... + n^n
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(sumPowerSeries(number));
    }

    /*
        f(N) = 1 + 2^2 + 3^3 + .... n^n
        f(N - 1) = 1 + 2^2 + 3^3 + .... (n - 1)^(n - 1)
        f(N) = ??? f(N - 1) + n ^ n
        f(1) = 1

        t(n^n) + t(n-1 ^ n-1) + ... + t(1^1)
        logn + log(n-1) + log(n-2) + log(n-3) + ... + log(1)
        log(a) + log(b) = log(a * b)

        log(1 . 2 . 3 . 4 . ..... n)  log(n!) = O(n log(n))

        n! = sterling's approximation of the gamma function
        time complexity: O(n log(n))
        space complexity: O(number)
     */
    private static long sumPowerSeries(long number) {
        if (number == 1) {
            return 1;
        }

        return (long) Math.pow(number, number) + sumPowerSeries(number - 1);
    }
}
