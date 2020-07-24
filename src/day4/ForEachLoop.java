package day4;

public class ForEachLoop {
    /*
        for (instantiation ; condition ; updation) {
            code
        }

        --> only valid for iterable objects
        --> arrays are iterable

        for (data_type variable : iterable_variable) {
            code
        }
     */

    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    public static void main(String[] args) {
        int[] array = {1, -100, 90, 87, 45};

        for (int index = 0 ; index < array.length ; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();

        // for each loop
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
