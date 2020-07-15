// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question4 {
    // Write a program to find the factorial value of any number entered through the keyboard.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int product = 1;
        for (int i = 1 ; i <= number ; product *= i++);
        System.out.println(product);
    }
}
