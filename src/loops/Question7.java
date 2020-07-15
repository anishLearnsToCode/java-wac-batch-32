// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question7 {
    // Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int even = 0, odd = 0;
        char input = 'y';

        do {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }

            System.out.println("Do you wish to continue (y/n)");
            scanner.nextLine();
            input = scanner.nextLine().charAt(0);
        } while (input == 'y');

        System.out.println("odd sum: " + odd);
        System.out.println("even sum: " + even);

        scanner.close();
    }
}
