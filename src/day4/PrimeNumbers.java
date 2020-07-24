package day4;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
        printPrimes(1, 100);
    }

    // 2: true
    // 3: true
    // 1: false
    // 4: false
    /*
        time complexity: O(number ^ (1/2))
        space complexity: O(1)
     */
    private static boolean isPrime(int number) {
        for (int divisor = 2 ; divisor * divisor <= number ; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return number != 1;
    }

    /*
        time complexity: O(number)
        space complexity: O(1)
     */
    private static int factors(int number) {
        int factors = 0;
        for (int i = 1 ; i <= number ; i++) {
            if (number % i == 0) {
                factors++;
            }
        }
        return factors;
    }

    /*
        sqrt(a) + sqrt(a + 1) + sqrt(a + 2) + sqrt(a + 3) + .... + sqrt(b)
        <= sqrt(b) + sqrt(b) + sqrt(b) + ..... + sqrt(b)
        = (b - a) sqrt(b)
        O((b - a) * sqrt(b))

        time complexity: O((b - a) * sqrt(b))
        space complexity: O(1)
     */
    private static void printPrimes(int a, int b) {
        for (int i = a ; i <= b ; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
