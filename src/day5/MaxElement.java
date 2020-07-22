package day5;

public class MaxElement {
    public static void main(String[] args) {
        // representing infinity in java ♾
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

        System.out.println(maximum(new int[] {1, 2, 3, 4}));
        System.out.println(maximum(new int[] {1, 2, 3, 4, 5}));
        System.out.println(maximum(new int[] {}));
        System.out.println(maximum(new int[] {-100, -3, -2, -56, -45, 10, 1}));

        // to update array we can't use foreach loop
//        for (int element : array) {
//            element = 10;
//        }
    }

    /*
        {1, 2, 4, 5, 100, 4} --> 100
        {-100, -90, 4, 3} --> 4
        {} --> -Infinity
        {-1, -2, -3} -->
     */
    private static int maximum(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
}
