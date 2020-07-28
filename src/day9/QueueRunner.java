package day9;

import java.util.*;

public class QueueRunner {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            // -1 0 1
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return 1;
                } else if (o1.equals(o2)) {
                    return 0;
                }
                return -1;
            }
        });

//        queue.add(5);
//        queue.add(2);
//        queue.add(100);
//        queue.add(1);
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(5);
        list.add(2);
        list.add(200);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.pollFirst();
        System.out.println(list.getFirst());

        list.pollLast();
        System.out.println(list.getLast());

        list.add(1, -45);
        System.out.println(list);
    }
}
