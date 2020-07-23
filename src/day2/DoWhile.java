package day2;

import java.util.Scanner;

public class DoWhile {
    /*
        do {
            code
            code
        } while(condition)

        code --> (condition --> code) --> condition
     */

    /*
        Time Complexity: n
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;
        do {
            message = scanner.nextLine();
            System.out.println(message);
        } while (!message.equals("quit"));

        System.out.println("i am outside loop");
    }
}
