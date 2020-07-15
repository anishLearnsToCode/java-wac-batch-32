package patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0, number = 1; i < rows ; i++) {
            for (int j = 0 ; j < i + 1 ; j++) {
                System.out.print(number++);
                System.out.print(j == i ? "" : "*");
            }
            System.out.println();
        }

        for(int i = 0, number = rows * (rows + 1) / 2 - rows + 1; i < rows ; number -= (rows - i - 1), i++) {
            for (int j = 0; j < rows - i ; j++) {
                System.out.print(number + j);
                System.out.print(j == rows - i - 1 ? "" : "*");
            }
            System.out.println();
        }
    }
}
