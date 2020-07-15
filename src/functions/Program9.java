package functions;

public class Program9 {
    private static boolean isPrime(int number) {
        for (int divisor = 2 ; divisor < number ; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
