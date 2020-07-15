package patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows - 1 ; i++) {
            for (int j = 0 ; j < rows - i - 1 ; System.out.print(" "), j++);
            System.out.print("*");
            for (int j = 0 ; j < 2 * i - 1 ; System.out.print(" "), j++);
            System.out.print(i == 0 ? "" : "*");
            System.out.println();
        }

        for (int i = 0 ; i < rows ; System.out.print("* "), i++);
    }
}
