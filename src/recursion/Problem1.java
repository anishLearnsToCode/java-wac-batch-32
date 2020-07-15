package recursion;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(seriesSum(number));
    }

    private static long seriesSum(int number) {
        if (number == 0) {
            return 0;
        }

        return (long) Math.pow(number, number) + seriesSum(number - 1);
    }
}
