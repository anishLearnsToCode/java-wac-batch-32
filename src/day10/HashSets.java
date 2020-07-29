package day10;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);
        System.out.println(numbers);
    }
}
