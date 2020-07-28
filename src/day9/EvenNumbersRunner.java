package day9;

import java.util.Iterator;

public class EvenNumbersRunner {
    public static void main(String[] args) {
        EvenNumbers evenNumbers = new EvenNumbers(5);
        EvenNumbers evenNumbers1 = new EvenNumbers(20);
        EvenNumbers evenNumbers2 = new EvenNumbers(1);
        Iterator<Integer> iterator = evenNumbers.iterator();

        for (int evenNumber : new EvenNumbers(20)) {
            System.out.println(evenNumber);
        }

//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());

//        for (int var : iterable_object) {
//
//        }

//        iterator = iterable_object.iterator();
//        while (iterator.hasNext()) {
//            var = iterator.next();
//        }

    }
}
