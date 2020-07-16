package day1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0 && number != 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
