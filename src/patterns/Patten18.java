package patterns;

import java.util.Scanner;

public class Patten18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < i + 1 ; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }

    private static int binomialCoefficient(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r)) ;
    }

    private static int factorial(int number) {
        return number == 0 ? 1 : number * factorial(number - 1);
    }
}
