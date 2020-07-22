package day5;

public class SumArray {
    public static void main(String[] args) {

    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
