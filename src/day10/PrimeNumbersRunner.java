package day10;

public class PrimeNumbersRunner {
    public static void main(String[] args) {
        for (int primeNumber : new PrimeNumbers(20)) {
            System.out.println(primeNumber);
        }
    }
}
