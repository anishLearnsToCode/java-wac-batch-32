// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question3 {
    // Write a program that prompts the user to input a positive integer.
    // It should then print the multiplication table of that number.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        for (int index = 1 ; index <= 10 ; index++) {
            System.out.println(number + " x " + index + " = " + number * index);
        }
    }
}
