package patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < i + 1 ; System.out.print(rows + i), j++);
            System.out.println();
        }

        for (int i = 0 ; i < rows + 1 ; System.out.print(2 * rows), i++);
        System.out.println();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < rows - i ; System.out.print(2 * rows - 1 - i), j++);
            System.out.println();
        }
    }
}
