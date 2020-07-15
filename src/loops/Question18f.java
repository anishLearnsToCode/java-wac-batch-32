// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question18f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < rows - i - 1 ; System.out.print(" "), j++);
            for (int j = i + 1 ; j >= 1 ; System.out.print(j), j--);
            for (int j = 2 ; j <= i + 1 ; System.out.print(j), j++);
            System.out.println();
        }
    }
}
