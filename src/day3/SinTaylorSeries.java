package day3;

import java.util.Scanner;

public class SinTaylorSeries {
    /*
        sin(x) = x - x^3/3! + x^5/5! - x^7/7! + ....

        a(i) = (-1)^î x^(2i + 1) / (2i + 1)!
        a(i) = oscillation * factor(x) / factorial

        oscillation *= -1
        factor *= x^2
        factorial *= (2i + 1) * 2i

        instantiation --> (condition --> code --> updation)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double theta = scanner.nextDouble();
        double result = 0;

        for (double precision = 0, oscillation = 1, factor = theta, factorial = 1 ; precision < 30 ; precision++) {
            result += oscillation * factor / factorial;
            oscillation *= -1;
            factor *= theta * theta;
            factorial *= (2 * precision + 1) * 2 * precision;
        }

        System.out.println(result);
    }
}
