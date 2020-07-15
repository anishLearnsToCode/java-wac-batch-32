package arrays;

import java.util.Scanner;

public class Problem1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int length = scanner.nextInt();
        int[] array = getInput(length);
        print(array);
        scanner.close();
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static int[] getInput(int length) {
        int[] array = new int[length];
        for (int index = 0 ; index < length ; index++) {
            array[index] = scanner.nextInt();
        }
        return array;
    }
}
