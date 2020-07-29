package day10;

public class NaturalNumbersRunner {
    public static void main(String[] args) {
        for (int number : new NaturalNumbers(5)) {
            System.out.println(number);
        }

        /*
            Iterator<Integer> iter = object.iterator();
            while (iter.hasNext()) {
                var = iter.next();
            }
         */
    }
}
