package day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenNumbers implements Iterable<Integer> {
    private final int range;
    List<Integer> list = new ArrayList<>();

    EvenNumbers(int range) {
        this.range = range;
        list.add(0);
        list.add(1);
        list.add(-100);
        list.add(2);
        list.add(4);
    }


    @Override
    public Iterator<Integer> iterator() {
        return new EvenNumbersIterator();
    }

    private class EvenNumbersIterator implements Iterator<Integer> {

        private int number = 0;

        @Override
        public boolean hasNext() {
            return number <= range;
        }

        @Override
        public Integer next() {
            number += 2;
            return number - 2;
        }
    }
}
