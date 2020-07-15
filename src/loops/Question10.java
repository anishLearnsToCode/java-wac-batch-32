// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question10 {
    // Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed.
    // The loop should ask the user whether she wishes to perform the operation again.
    // If so, the loop should repeat; otherwise it should terminate.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        char input = 'y';

        do {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            sum += a + b;

            System.out.println("Do you wish to continue (y/n)");
            scanner.nextLine();
            input = scanner.nextLine().charAt(0);
        } while (input == 'y');

        System.out.println(sum);
        scanner.close();
    }
}
