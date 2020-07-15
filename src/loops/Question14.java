// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question14 {
    // Write a program to print Fibonacci series of n terms where n is input by user :
    //0 1 1 2 3 5 8 13 24 .....

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        for (int index = 0, previous = 0, current = 1; index < number ; index++) {
            System.out.println(current);
            int temp = current;
            current += previous;
            previous = temp;
        }
    }
}
