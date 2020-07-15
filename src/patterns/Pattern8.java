package patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < rows - i ; System.out.print(j + 1 + " "), j++);
            System.out.println();
        }
    }
}
