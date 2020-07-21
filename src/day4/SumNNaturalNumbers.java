package day4;

import java.util.Scanner;

public class SumNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(sumSquares(number));
    }

    // N
    // s(n) = 1 + 2 + 3 + 4 + ... + N
    // s(n - 1)
    // s(n) = n + s(n - 1)
    // base case
    // number == 1 ? 1
    private static long sumNNaturalNumbers(int number) {
        return number == 1 ? 1 : number + sumNNaturalNumbers(number - 1);
    }

    // N
    // s(n) = 1^2 + 2^2 + 3^2 + .. + N^2
    // s(n - 1) = 1^2 + 2^2 + 3^2 + ... (N - 1)^2
    // s(n) =??? s(n - 1) + N^2
    private static long sumSquares(int number) {
        return number == 1 ? 1 : number * number + sumSquares(number - 1);
    }
}
