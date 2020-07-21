package day4;

public class Recursion {
    // inception

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    // n! = n * (n - 1)!
    // 5! = 5 * 4 * 3 * 2 * 1
    //    = 5 * 4!
    // 4! = 4 * 3 * 2 * 1
    //
    // recursive step
    // n! = n * (n - 1)!

    // base case
    // 0! = 1
    private static long factorial(int number) {
        if (number == 0) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    // 6
    // func number = 3
    // return 3 * 2
    //      factorial(2)
    //      return 2 * 1
    //          factorial(1)
    //          return 1 * 1
    //              factorial(0)
    //              return 1
}
