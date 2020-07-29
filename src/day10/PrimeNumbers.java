package day10;

import java.util.Iterator;

public class PrimeNumbers implements Iterable<Integer> {
    private final int range;

    public PrimeNumbers(int range) {
        this.range = range;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PrimeNumbersIterator();
    }

    /*
        sqrt(1) + sqrt(2) + ... + sqrt(range)
        <= sqrt(range) + sqrt(range) + .... sqrt(range)
        ~O(range * sqrt(range))
     */
    private class PrimeNumbersIterator implements Iterator<Integer> {

        private int primeNumber = 2;

        @Override
        public boolean hasNext() {
            return primeNumber <= range;
        }

        @Override
        public Integer next() {
            int current = primeNumber;
            primeNumber = findNextPrimeNumber();
            return current;
        }

        /*
            finds next prime number and updates primeNumber variable
            time complexity: O((n)^1/2 * distance_between_ciurrent_prime and next prime)
            n * e^(sqrt(n))
            space complexity: O(1)
         */
        private int findNextPrimeNumber() {
            for (int number = primeNumber + 1 ;  ; number++) {
                if (isPrime(number)) {
                    return number;
                }
            }
        }

        /*
            time complexity: O(number ^ (1/2))
            space complexity: O(1)
         */
        private boolean isPrime(int number) {
            for (int i = 2 ; i * i <= number ; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
