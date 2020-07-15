// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question9 {
    // Write a program to calculate HCF of Two given number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(hcf(a, b));
    }

    private static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }

        return hcf(b, a % b);
    }
}
