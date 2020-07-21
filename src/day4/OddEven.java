package day4;

public class OddEven {
    public static void main(String[] args) {
//        int[] numbers= {1, 5, -45, 0, 100};
//        System.out.println(product(numbers));
//        System.out.println(product(1, 3));

        System.out.println(mod(-10));
        System.out.println(mod(10));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    private static int product(int a, int b) {
        return a * b;
    }

    // {1, 5, -45}
    // 1 * 5 * -45
    // -225
    private static int product(int[] array) {
        int result = 1;
        for (int element : array) {
            result *= element;
        }
        return result;
    }

    // negative --> positive
    // positive --> positive
    // mod(-10) = 10 mod(10) = 10
    private static int mod(int number) {
        return number < 0 ? -number : number;
    }
}
