// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question8 {
    // Write a program that prompts the user to input a positive integer.
    // It should then output a message indicating whether the number is a prime number.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(isPrime(number) ? "is prime" : "not prime");
    }

    private static boolean isPrime(int number) {
        for (int index = 2 ; index * index <= number ; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return number != 1;
    }
}
