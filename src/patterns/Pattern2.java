package patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        scanner.close();

        if (rows < 2) {
            System.out.println("invalid");
            return;
        }

        printRow(columns);
        for (int i = 0 ; i < rows - 2 ; i++) {
            System.out.print("*");
            for (int j = 0 ; j < columns - 2 ; System.out.print(" "), j++);
            System.out.println("*");
        }
        printRow(columns);
    }

    private static void  printRow(int columns) {
        for (int i = 0 ; i < columns ; System.out.print("*"), i++);
        System.out.println();
    }
}
