package day6;

public class TwoDArrayInstantiation {
    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {1, 2},
                {1, 2, 3, 4, 5}
        };

        int[][][] complex = {
                {
                        {1, 2, 3},
                        {3, 4, -100, 90}
                },
                {
                        {5, 6},
                        {},
                        {-56, 345, 23}
                },
                {
                        {},
                        {1},
                        {1, 2},
                        {1, 2, 3, 4, 5}
                }
        };

        print(complex);
    }

    /*
        avg_elems per column
        time complexity: O(rows * avg_elems)
        space complexity: O(1)
     */
    private static void printPrimitive(int[][] matrix) {
        for (int row = 0 ; row < matrix.length ; row++) {
            for (int column = 0 ; column < matrix[row].length ; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    /*
        time complexity: O(rows * columns)
        space complexity: O(1)
     */
    private static void printPrimitive2(int[][] matrix) {
        for (int row = 0 ; row < matrix.length ; row++) {
            for (int element : matrix[row]) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    /*
        time complexity: O(rows * columns)
        space complexity: O(1)
     */
    private static void printPrimitive3(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    /*
        time complexity: O(n)
        space complexity: O(1)
     */
    private static void printAdvanced(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /*
        time complexity: O(rows * columns)
        space complexity: O(1)
     */
    private static void printAdvanced(int[][] matrix) {
        for (int[] row : matrix) {
            printAdvanced(row);
        }
    }

    /*
        time complexity: O(n * rows * columns)
        space complexity: O(1)
     */
    private static void print(int[][][] array) {
        for (int[][] matrix : array) {
            print(matrix);
            System.out.println("---------------");
        }
    }

    /*
        time complexity: O(rows * columns)
        space complexity: O(1)
     */
    private static void print(int[][] matrix) {
        for (int[] element : matrix) {
            print(element);
        }
    }

    /*
        time complexity: O(n)
        space complexity: O(1)
     */
    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // pass by reference
    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    private static void func(int[][] matrix) {
        matrix[1][0] = 100;
    }

    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    private static void func(int a) {
        a = 100;
    }

    /*
        time complexity: O(1)
        space complexity: O(1)
     */
    private static void func(int[] i) {
        i[0] = 100;
    }
}
