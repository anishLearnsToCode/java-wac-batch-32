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
    private static boolean isPrime(int number) {
//        return factors(number) == 2;

        for (int divisor = 2 ; divisor * divisor <= number ; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return number != 1;
    }

    private static int factors(int number) {
        int factors = 0;
        for (int i = 1 ; i <= number ; i++) {
            if (number % i == 0) {
                factors++;
            }
        }
        return factors;
    }

    private static void printPrimes(int a, int b) {
        for (int i = a ; i <= b ; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
