package day5;

public class Swap {
    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // java doesnt support default parameters
    private static void func() {
        func(10);
    }

    private static void func(int x) {
    }
}
