package day4;

public class FunctionSignatures {
    /*
        Function signature
        private static void hello() {
        }

        functionName(arguments types)

        Function overloading
     */

    // area(int)
    private static double area(int radius) {
        return Math.PI * radius * radius;
    }

    private static String fullName(String firstName) {
        return fullName(firstName, "");
    }

    private static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private static String fullName(String firstName, String lastName, String middleName) {
        return firstName + " " + middleName + " " + lastName;
    }

    // area()
//    private static int area() {
//
//    }

    // area(int, int)
//    private static int area(int height, int width) {
//
//    }

    // area(int)
    // this is not allowed
//    private static long area(int r) {
//
//    }
}
