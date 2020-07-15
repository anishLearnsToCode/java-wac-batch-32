package arrays;

import java.util.Scanner;

public class Problem7 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getInput();
        System.out.println(isAnagram(array) ? "is anagram" : "not anagram");
    }

    private static boolean isAnagram(int[] array) {
        for (int index = 0 ; index < array.length ; index++) {
            if (array[index] != array[array.length - 1 - index]) {
                return false;
            }
        }
        return true;
    }

    private static int[] getInput() {
        int[] array = new int[SCANNER.nextInt()];
        for (int index = 0 ; index < array.length ; index++) {
            array[index] = SCANNER.nextInt();
        }
        return array;
    }
}
