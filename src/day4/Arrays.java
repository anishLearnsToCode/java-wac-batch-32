package day4;

public class Arrays {
    /*
        type[] variable_name = new type[length];
     */

    public static void main(String[] args) {
        int[] numbers = new int[10];
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[4]);
//        System.out.println(numbers[9]);

        System.out.println(java.util.Arrays.toString(numbers));

        numbers[0] = 100;
        System.out.println(java.util.Arrays.toString(numbers));

        numbers[3] = -78;
        System.out.println(java.util.Arrays.toString(numbers));

        System.out.println(numbers.length);
    }
}
