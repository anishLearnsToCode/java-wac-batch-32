package day5;

public class MaxElement {
    public static void main(String[] args) {
        // representing infinity in java ♾
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

    /*
        {1, 2, 4, 5, 100, 4} --> 100
        {-100, -90, 4, 3} --> 4
        {} --> -Infinity
        {-1, -2, -3} -->
     */
    private static int maximum(int[] array) {
        int max = 0;
        for (int index = 0 ; index < array.length ; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }
        return max;
    }
}
