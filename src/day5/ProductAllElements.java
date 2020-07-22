package day5;

public class ProductAllElements {
    /*
        {1, 2, 4, 5} --> 1 . 2. 4. 5 = 40
        {90, 0} --> 0
     */
    private static int product(int[] array) {
        int result = 1;
        for (int element : array) {
            result *= element;
        }
        return result;
    }
}
