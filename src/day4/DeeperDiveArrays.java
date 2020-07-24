package day4;

public class DeeperDiveArrays {
    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        double[] a = new double[45];
        char[] characters = new char[7];
        float[] precisonNumbers = new float[100];
        String[] messages = {"hello", "world", "yeahhh"};
        int[] numbers = {2, 3, 5, 7, 11, 13};

//        array[5];
//        starting address + index * 4 bytes

        System.out.println(array[3]);

        print(numbers);
        print(messages);
    }

    /*
        time complexity: O(n)
        space complexity: O(1)
     */
    private static void print(int[] array) {
        for (int index = 0 ; index < array.length ; index++) {
            System.out.print(array[index] + " ");
        }
    }

    /*
        time complexity: O(n)
        space complexity: O(1)
     */
    private static void print(String[] array) {
        for (int index = 0 ; index < array.length ; index++) {
            System.out.print(array[index] + " ");
        }
    }
}
