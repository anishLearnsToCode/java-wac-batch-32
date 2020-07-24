package day4;

public class Factorial {
    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(4));
        System.out.println(factorial(8));

        // by default return at last line
        // return;
    }

    // n = 1 * 2 * 3 * ... * n
    /*
        time complexity: O(number)
        space complexity: O(1)
     */
    private static long factorial(int number) {
        long result = 1;
        for (int i = 1 ; i <= number ; i++) {
            result *= i;
        }
        return result;

        // unreachable code
        // System.out.println("hello world");
    }
}
