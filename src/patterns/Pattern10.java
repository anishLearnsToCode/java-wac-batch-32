package patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < i + 1 ; System.out.print((char) (j + 'A')), j++);
            for (int j = i ; j > 0 ; System.out.print((char) (j + 'A' - 1)), j--);
            System.out.println();
        }
    }
}
