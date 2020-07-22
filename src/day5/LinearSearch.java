package day5;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[] {1, 2, 3, 4, 5}, 4));
        System.out.println(linearSearch(new int[] {1, 2, 3, 4, 5}, 100));
        System.out.println(linearSearch(new int[] {1, 2, 3, 4, 2, 2, 5, 2}, 2));
    }

    /*
        Linear Search
        {1, 2, 3, 4} elem=3 index=2
        {2, 3, 5, 7,11} elem=2 index=0
        {-10, 0, 9, 3, 45} elem=90 index=-1
     */
    private static int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
