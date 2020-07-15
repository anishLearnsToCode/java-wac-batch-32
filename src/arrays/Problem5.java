package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getInput();
        System.out.println(Arrays.toString(reverse(array)));
    }

    private static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0 ; index < array.length ; index++) {
            result[array.length - 1 - index] = array[index];
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
