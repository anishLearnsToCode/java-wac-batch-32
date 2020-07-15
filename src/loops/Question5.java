// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question5 {
    // Two numbers are entered through the keyboard. Write a program to find the value of one number raised
    // to the power of another. (Do not use Java built-in method)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int power = scanner.nextInt();
        scanner.close();

        int result = 1;
        for (int index = 0 ; index < power ; result *= base, index++);
        System.out.println(result);
    }
}
