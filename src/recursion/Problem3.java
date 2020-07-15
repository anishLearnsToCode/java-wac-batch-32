package recursion;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(seriesSum(number));
    }

    private static long seriesSum(int number) {
        return number == 0 ? 0 : number * number + seriesSum(number - 1);
    }
}
