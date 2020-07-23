package day1;

public class DataTypes {
    /*
        Time Complexity: O(1)
     */
    public static void main(String[] args) {
        /*
    Variable Instantiation
    datatype variable_name = value;
     */

        // primitive data types
        // Integer variable types
        byte b = 10;            // 1 byte
        short smallNumber = 20; // 2 bytes
        int integer = -764;     // 4 bytes
        long veryLargeNumber = Long.MAX_VALUE + 1;      // 8 bytes

        System.out.println(veryLargeNumber);

        // Floating Point Numbers
        float pi = (float) 3.14;        // explicit type casting // 4 bytes
        double e = 2.71828;             // 8 bytes
        double precision = -0.0000004;

        // character values
        char character = 'a';       // 2 bytes
        char character2 = 'b';
        char character3 = '4';
        char character4 = ' ';

        // Boolean variables
        boolean truthy = false;
        truthy = true;

        // Non primitive Data type (ADT) --> abstract data type
        String message = "hello world";
        String emptyString = "";
        String longString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String characterOne = "1";
    }
}
