package day5;

public class NumberOfOddEvenZeroes {
    public static void main(String[] args) {
        System.out.println(numberZeros(new int[] {1, 2, 0, -90, -56, 0, 0}));
    }

    /*
        return number of zeroes
        print number of even elements
        print number of odd elements
     */
    private static int numberZeros(int[] array) {
        int even = numberOfEven(array);
        System.out.println(even);
        System.out.println(array.length - even);
        return numberOfZero(array);
    }

    private static int numberOfEven(int[] array) {
        int even = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    private static int numberOfZero(int[] array) {
        int zeros = 0;
        for (int element : array) {
            if (element == 0) {
                zeros++;
            }
        }
        return zeros;
    }
}
