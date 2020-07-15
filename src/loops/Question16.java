// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question16 {
    // Compute the natural logarithm of 2, by adding up to n terms in the series
    // 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
    // where n is a positive integer and input by user.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();;

        System.out.println(ln2(number));
    }

    private static double ln2(int number) {
        double sum = 0;
        for (int index = 1, product = 1 ; index <= number ; index++, product *= -1) {
            sum += (double) product / index;
        }
        return sum;
    }
}
