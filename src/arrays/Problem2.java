package arrays;

import java.util.Scanner;

public class Problem2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int length = scanner.nextInt();
        int[] array = getInput(length);
        System.out.println(sum(array));
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    private static int[] getInput(int length) {
        int[] array = new int[length];
        for (int index = 0 ; index < length ; index++) {
            array[index] = scanner.nextInt();
        }
        return array;
    }
}
