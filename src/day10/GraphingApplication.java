package day10;

import day9.Circle;

import java.util.Iterator;

public class GraphingApplication implements Iterable<Circle> {
    @Override
    public Iterator<Circle> iterator() {
        return new GraphingApplicationIterator();
    }

    private class GraphingApplicationIterator implements Iterator<Circle> {

        private int i = 0;

        @Override
        public boolean hasNext() {
            return i++ < 5;
        }

        @Override
        public Circle next() {
            return new Circle(i);
        }
    }
}
