package day3;

import java.util.Scanner;

public class SumNNaturalNumber {
    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // 6
        System.out.println(sumNaturalNumbers(number));
    }

    // 1 + 2 + 3 + 4 + ... + N
    private static int sumNaturalNumbers(int number) {
        return (number * (number + 1)) / 2;
    }
}
