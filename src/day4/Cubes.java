package day4;

public class Cubes {
    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    public static void main(String[] args) {
//        printCubes(1, 10);
        printCubes(new int[] {1, 2, -10, -5});
    }

    // n
    // n^3
    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    private static int cube(int number) {
        // pow(a b) O(log(b)) log(3)
        return (int) Math.pow(number, 3);
    }

    /*
        time complexity: O(b - a)
        space complexity: O(1)
     */
    private static void printCubes(int a, int b) {
        for (int i = a ; i <= b ; i++) {
            System.out.print(cube(i) + " ");
        }
    }

    // {1, -5, 20}
    // 1 -125 8000
    /*
        time complexity: O(n)
        space complexity: O(1)
     */
    private static void printCubes(int[] array) {
        for (int element : array) {
            System.out.print(cube(element) + " ");
        }
    }

}
