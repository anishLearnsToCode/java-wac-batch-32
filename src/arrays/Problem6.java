package arrays;

import java.util.Scanner;

public class Problem6 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getInput();
        System.out.println(product(array));
    }

    private static long product(int[] array) {
        long result = 1;
        for (int element : array) {
            result *= element;
        }
        return result;
    }

    private static int[] getInput() {
        int[] array = new int[SCANNER.nextInt()];
        for (int index = 0 ; index < array.length ; index++) {
            array[index] = SCANNER.nextInt();
        }
        return array;
    }
}
