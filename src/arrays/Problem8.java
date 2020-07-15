package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] first = getInput();
        int[] second = getInput();
        System.out.println(Arrays.toString(merge(first, second)));
    }

    private static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        for (int i = 0, j = 0, index = 0 ; ; ) {
            if (i == first.length) {
                for ( ; index < result.length ; result[index++] = second[j++]);
                break;
            }

            if (j == second.length) {
                for ( ; index < result.length ; result[index++] = first[i++]);
                break;
            }

            result[index++] = first[i] < second[j] ? first[i++] : second[j++];
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
