package arrays;

import java.util.Scanner;

public class Problem3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getInput();
        printOddEvenZeros(array);
    }

    private static void printOddEvenZeros(int[] array) {
        int even = 0, odd = 0, zeros = 0;
        for (int element : array) {
            if (element == 0) {
                zeros++;
                continue;
            }

            if (element % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
        System.out.println("zeros: " + zeros);
    }

    private static int[] getInput() {
        int[] array = new int[SCANNER.nextInt()];
        for (int index = 0 ; index < array.length ; index++) {
            array[index] = SCANNER.nextInt();
        }
        return array;
    }
}
