package patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < i ; System.out.print(" "), j++);
            for (int j = 0 ; j < rows - i ; System.out.print("* "), j++);
            System.out.println();
        }
    }
}
