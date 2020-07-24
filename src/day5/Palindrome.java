package day5;

import java.util.Scanner;

public class Palindrome {
    private static final Scanner scanner = new Scanner(System.in);

    /*
        time complexity: O(n)
        space complexity: O(n)
     */
    public static void main(String[] args) {
        int length = scanner.nextInt();
        int[] array = getArray(length);
        System.out.println(isPalindrome(array) ? "palindrome" : "not palindrome");
    }

    /*
        mom
        hah
        a
        aaa
        bat

        {1, 2, 2, 1} true
        {1} true
        {} true
        {1, 2, 3, 2, 1} true
        {-100, -100} true
        {1, 2, 3} false
        {1, 2} false
        {1, -100, 4} false
        {1, x, 1} true
        {1, 10, 10, 1}
        {1, 2, 3, 1} -->
     */
    /*
        time complexity: O(n)
        space complexity: O(1)
     */
    private static boolean isPalindrome(int[] array) {
        for (int i = 0 ; i < array.length / 2 ; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /*
        time complexity: O(n)
        space complexity: O(n)
     */
    private static int[] getArray(int length) {
        int[] array = new int[length];
        for (int index = 0 ; index < array.length ; index++) {
            array[index] = scanner.nextInt();
        }
        return array;
    }
}
