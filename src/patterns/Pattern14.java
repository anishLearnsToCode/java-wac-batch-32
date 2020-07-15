package patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < i + 1 ; System.out.print("*"), j++);
            System.out.println();
        }

        for (int i = 0 ; i < rows - 1 ; i++) {
            for (int j = 0 ; j < rows - i - 1 ; System.out.print("*"), j++);
            System.out.println();
        }
    }
}
