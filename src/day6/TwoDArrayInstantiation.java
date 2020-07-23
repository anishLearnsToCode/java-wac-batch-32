package day6;

public class TwoDArrayInstantiation {
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

//        print(data);
//        printPrimitive3(data);

//        System.out.println(data[1][0]);
//        func(data);
//        System.out.println(data[1][0]);

//        int a = 10;
//        System.out.println(a);
//        func(a);
//        System.out.println(a);

//        int[] array = {1, 2, 3};
//        System.out.println(array[0]);
//        func(array);
//        System.out.println(array[0]);
    }

    private static void printPrimitive(int[][] matrix) {
        for (int row = 0 ; row < matrix.length ; row++) {
            for (int column = 0 ; column < matrix[row].length ; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static void printPrimitive2(int[][] matrix) {
        for (int row = 0 ; row < matrix.length ; row++) {
            for (int element : matrix[row]) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void printPrimitive3(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void printAdvanced(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void printAdvanced(int[][] matrix) {
        for (int[] row : matrix) {
            printAdvanced(row);
        }
    }

    private static void print(int[][][] array) {
        for (int[][] matrix : array) {
            print(matrix);
            System.out.println("---------------");
        }
    }

    private static void print(int[][] matrix) {
        for (int[] element : matrix) {
            print(element);
        }
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // pass by reference
    private static void func(int[][] matrix) {
        matrix[1][0] = 100;
    }

    private static void func(int a) {
        a = 100;
    }

    private static void func(int[] i) {
        i[0] = 100;
    }
}
