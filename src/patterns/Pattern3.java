package patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows + 1 ; System.out.print("*"), i++);
        System.out.println();

        for (int i = 0 ; i < rows - 1 ; i++) {
            System.out.print("*");
            for (int j = 0 ; j < rows - i - 2 ; System.out.print(" "), j++);
            System.out.println(i == rows - 2 ? "" : "*");
        }
    }
}
