package day4;

public class Cubes {
    public static void main(String[] args) {
//        printCubes(1, 10);
        printCubes(new int[] {1, 2, -10, -5});
    }

    // n
    // n^3
    private static int cube(int number) {
        number = number * number;
        return (int) Math.pow(number, 3);
    }

    private static void printCubes(int a, int b) {
        for (int i = a ; i <= b ; i++) {
            System.out.print(cube(i) + " ");
        }
    }

    // {1, -5, 20}
    // 1 -125 8000
    private static void printCubes(int[] array) {
        for (int element : array) {
            System.out.print(cube(element) + " ");
        }
    }

}
