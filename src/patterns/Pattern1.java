package patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < rows - i ; System.out.print("*"), j++);
            for (int j = 0 ; j < 2*i ; System.out.print(" "), j++);
            for (int j = 0 ; j < rows - i ; System.out.print("*"), j++);
            System.out.println();
        }

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < i + 1 ; System.out.print("*"), j++);
            for (int j = 0 ; j < 2 * rows - 2 * i - 2 ; System.out.print(" "), j++);
            for (int j = 0 ; j < i + 1 ; System.out.print("*"), j++);
            System.out.println();
        }
    }
}
