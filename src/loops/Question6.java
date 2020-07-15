// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question6 {
    // Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
    // For example, if the input is 12345, the output should be 54321.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(reverse(number));
    }

    private static String reverse(int number) {
        return new StringBuilder(number + "").reverse().toString();
    }
}
