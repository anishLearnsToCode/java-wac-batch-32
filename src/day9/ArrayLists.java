package day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(10_000);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        numbers.add(0, 100);
        System.out.println(numbers);

        Integer i = new Integer(34);
        System.out.println(i.floatValue());

        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>());
        matrix.add(new ArrayList<>());
        matrix.get(0).add(1);
        matrix.get(0).add(10);

        System.out.println(matrix);
    }

    private static int sum(List<Integer> numbers) {
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        return sum;
    }
}
