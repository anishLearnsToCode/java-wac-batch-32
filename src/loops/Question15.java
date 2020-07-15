// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question15 {
    // Write a program to calculate the sum of following series where n is input by user.
    // 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(series(number));
    }

    private static double series(int number) {
        double sum = 0;
        for (int index = 0 ; index < number ; index++) {
            sum += 1.0 / (index + 1);
        }
        return sum;
    }
}
