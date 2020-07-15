package arrays;

import java.util.Scanner;

public class Problem4 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getInput();
        int element = SCANNER.nextInt();
        System.out.println(linearSearch(array, element));
    }

    private static int[] getInput() {
        int[] array = new int[SCANNER.nextInt()];
        for (int index = 0 ; index < array.length ; index++) {
            array[index] = SCANNER.nextInt();
        }
        return array;
    }

    private static int linearSearch(int[] array, int element) {
        for (int index = 0 ; index < array.length ; index++) {
            if (element == array[index]) {
                return index;
            }
        }
        return -1;
    }
}
