package day2;

import java.util.Scanner;

public class SumNNaturalNumbers {
    /*
        N
        1 + 2 + 3 + ... + N
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int answer = (number * (number + 1)) / 2;

        int sum = 0, i = 1;
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println(answer);
        System.out.println(sum);
    }
}
