package day5;

public class SumArray {
    public static void main(String[] args) {

    }

    /*
        time complexity: O(n)
        space complexity: O(1)
     */
    private static int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
