package day5;

public class ReverseOfArray {
    public static void main(String[] args) {
        print(reverse(new int[] {1, 2, 3, 4, 5}));
        print(reverse(new int[] {-10, 90, 45}));
        print(reverse(new int[] {}));
    }

    /*
        {1, 2, 3} --> {3, 2, 1}
        {} --> {}
        {-100, 90, 65, 45} --> {45, 65, 90, -100}
     */
    private static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0 ; index < array.length ; index++) {
            result[index] = array[array.length - 1 - index];
        }
        return result;
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
