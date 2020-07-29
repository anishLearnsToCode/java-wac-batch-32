package day10;

import java.util.Iterator;

public class NaturalNumbers implements Iterable<Integer> {
    private final int range;

    NaturalNumbers(int range) {
        this.range = range;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NaturalNumbersIterator();
    }

    private class NaturalNumbersIterator implements Iterator<Integer> {
        private int number = 1;

        @Override
        public boolean hasNext() {
            return number <= range;
        }

        @Override
        public Integer next() {
            return number++;
        }
    }
}
