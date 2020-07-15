// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question17 {
    // Write a program that generates a random number and asks the user to guess what the number is.
    // If the user's guess is higher than the random number, the program should display "Too high, try again."
    // If the user's guess is lower than the random number, the program should display "Too low, try again."
    // The program should use a loop that repeats until the user correctly guesses the random number.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);

        do {
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("bingo, you guessed it");
                break;
            } else if (guess < randomNumber) {
                System.out.println("too low, try again");
            } else {
                System.out.println("too high, try again");
            }
        } while (true);
        scanner.close();
    }
}
