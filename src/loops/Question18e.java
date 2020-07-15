package loops;

import java.util.Scanner;

public class Question18e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < rows - i - 1 ; System.out.print(" "), j++);
            for (int j = 0 ; j < 2 * i + 1 ; System.out.print(i + 1), j++);
            System.out.println();
        }
    }
}
