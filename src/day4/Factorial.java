package day4;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(4));
        System.out.println(factorial(8));

        // by default return at last line
        // return;
    }

    // n = 1 * 2 * 3 * ... * n
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
