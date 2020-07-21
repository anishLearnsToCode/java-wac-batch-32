package day4;

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibonacci(0));
//        System.out.println(fibonacci(1));
//        System.out.println(fibonacci(2));
//        System.out.println(fibonacci(3));
//        System.out.println(fibonacci(4));
        System.out.println(fibonacci(20));
    }

    // f : 1 1 2 3 5 8 13 21 ....
    // f(0) = 1
    // f(1) = 1
    // f(n) = f(n - 1) + f(n - 2) (n >= 2)

    private static int fibonacci(int number) {
        System.out.println("fibo: " + number);
        if (number == 0 || number == 1) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
