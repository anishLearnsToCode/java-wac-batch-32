//  http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question11 {
    // Write a program to enter the numbers till the user wants and at
    // the end it should display the count of positive, negative and zeros entered.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zeroes = 0, positives = 0, negatives = 0;
        char input = 'y';

        do {
            int number = scanner.nextInt();
            if (number == 0) {
                zeroes++;
            } else if(number > 0) {
                positives++;
            } else {
                negatives++;
            }

            System.out.print("wish to proceed (y/n) \t");
            scanner.nextLine();
            input = scanner.nextLine().charAt(0);
        } while (input == 'y');

        System.out.println("0: " + zeroes);
        System.out.println("+: " + positives);
        System.out.println("-: " + negatives);
    }
}
