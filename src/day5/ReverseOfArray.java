package day5;

public class ReverseOfArray {
    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    public static void main(String[] args) {
        print(reverse(new int[] {1, 2, 3, 4, 5}));
        print(reverse(new int[] {-10, 90, 45}));
        print(reverse(new int[] {}));
    }

    /*
        {1, 2, 3} --> {3, 2, 1}
        {} --> {}
        {-100, 90, 65, 45} --> {45, 65, 90, -100}

        time complexity: O(n)
        space complexity: O(n)
     */
    private static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0 ; index < array.length ; index++) {
            result[index] = array[array.length - 1 - index];
        }
        return result;
    }

    /*
        time complexity: O(n)
        space complexity: O(1)
     */
    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
