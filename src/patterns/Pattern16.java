package patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0, number = 1 ; i < rows ; i++) {
            for (int j = 0 ; j < i + 1 ; System.out.print(number++ + " "), j++);
            System.out.println();
        }
    }
}
