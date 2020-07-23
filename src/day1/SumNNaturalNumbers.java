package day1;

import java.util.Scanner;

public class SumNNaturalNumbers {
    /*
        N
        1 + 2 + 3 + 4 + ... + N
        Time Complexity: O(n)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0, i = 1;

        while (i <= number) {
            sum += i; // --> sum = sum + i;
            i++;
        }

        System.out.println(sum);
    }
}
