package day10;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    /*
        inserting: O(log(n))
        retrieving: O(log(n))
     */
    public static void main(String[] args) {
        Queue<Rectangle> queue = new PriorityQueue<>(Comparator
                .comparing(Rectangle::getLength)
                .thenComparing(Rectangle::getBreadth)
        );

        queue.add(new Rectangle(10, 4));
        queue.add(new Rectangle(10, 90));
        queue.add(new Rectangle(20, 4));
        queue.add(new Rectangle(10, 34));
        queue.add(new Rectangle(1, 0));
        queue.add(new Rectangle(4, 34));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    static class Rectangle implements Comparable<Rectangle> {
        int breadth;
        int length;

        Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }

        @Override
        public int compareTo(Rectangle other) {
            return Integer.compare(
                    this.length * this.breadth,
                    other.length * other.breadth
            );
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "breadth=" + breadth +
                    ", length=" + length +
                    '}';
        }
    }
}
