package functions;

public class Program7 {
    private static long factorial(int n) {
        long result = 1;
        for (int i = 1 ; i <= n ; i++) {
            result *= i;
        }
        return result;
    }

    private static long permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    private static long combination(int n, int r) {
        return permutation(n, r) / factorial(r);
    }
}
