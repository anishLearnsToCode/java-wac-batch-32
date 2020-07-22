package day5;

public class NumberEvenNumbersInArray {
    public static void main(String[] args) {
        System.out.println(numberEvenNumbers(new int[] {1, 2, 3, 4}));
        System.out.println(numberEvenNumbers(new int[] {1, 3, 5, -91}));
    }

    private static int numberEvenNumbers(int[] array) {
        int count = 0;
//        for (int i = 0 ; i < array.length ; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            }
//        }

        for (int element : array) {
            if (element % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
