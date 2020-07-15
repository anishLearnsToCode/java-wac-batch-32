package functions;

public class Program6 {
    private static long factorial(int number) {
        long result = 1;
        for (int i = 1 ; i <= number ; i++) {
            result *= i;
        }
        return result;
    }
}
