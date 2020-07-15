// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question12 {
    // Write a program to enter the numbers till the user wants and at the end the
    // program should display the largest and smallest numbers entered.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        char input = 'y';

        do {
            int number = scanner.nextInt();
            max = Math.max(number, max);
            min = Math.min(number, min);

            System.out.print("wish to proceed (y/n) \t");
            scanner.nextLine();
            input = scanner.nextLine().charAt(0);
        } while (input == 'y');

        scanner.close();
        System.out.println(max);
        System.out.println(min);
    }
}
