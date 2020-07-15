// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question20 {
    // Write a program to compute the cosine of x. The user should supply x and a positive integer n.
    // We compute the cosine of x using the series and the computation should use all terms in the series
    // up through the term involving xn
    // cos x = 1 - x2/2! + x4/4! - x6/6! .....

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double theta = scanner.nextDouble();
        int precision = scanner.nextInt();
        scanner.close();

        System.out.println(cos(theta, precision));
    }

    private static double cos(double theta, int precision) {
        double sum = 0, product = 1, compiunder = theta * theta;
        long factorial = 1;
        int factor = 1;
        for (int index = 0 ; index < precision ; index++) {
            sum += factor * product / factorial ;
            factor *= -1;
            product *= compiunder;
            factorial *= (2 * index + 1) * (2 * index + 2);
        }
        return sum;
    }
}
