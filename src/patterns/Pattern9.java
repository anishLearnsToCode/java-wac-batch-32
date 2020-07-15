package patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows - 1; i++) {
            System.out.print("1 ");
            for (int j = 0 ; j < i - 1 ; System.out.print("x "), j++);
            System.out.println(i == 0 ? "" : i + 1);
        }

        for (int i = 0 ; i < rows ; System.out.print(i + 1 + " "), i++);
    }
}
