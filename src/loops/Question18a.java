// http://www.beginwithjava.com/java/loops/questions.html

package loops;

import java.util.Scanner;

public class Question18a {
    // **********
    // **********
    // **********
    // **********

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        scanner.close();

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < columns ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
