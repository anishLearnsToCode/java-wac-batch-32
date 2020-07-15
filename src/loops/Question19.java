// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question19 {
    // Write a program to compute sinx for given x. The user should supply x and a positive integer n.
    // We compute the sine of x using the series and the computation should use all terms in the series up
    // through the term involving x^n
    // sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double x = scanner.nextDouble();
        scanner.close();

        System.out.println(sin(number, x));
    }

    private static double sin(int number, double x) {
        double sum = 0, factor = 1, product = x, compounder = x * x;
        long factorial = 1;
        for (int i = 0 ; i < number ; i++) {
            sum += factor * product / factorial ;
            factor *= -1;
            product *= compounder;
            factorial *= (2 * i + 3) * (2 * i + 2);
        }
        return sum;
    }
}
