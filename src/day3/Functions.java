package day3;

public class Functions {
    /*
        [accessModifier] [static]? [returnType] functionName(arg1, arg2, arg3 ....) {
            code
            return value; (not compulsory)
        }
     */

    // time complexity: O(1)
    // space complexity: O(1)
    public static void main(String[] args) {
//        helloWorld();
//        System.out.println("function has ended");
//        helloWorld();

        // parameters
//        String name = fullName("john", "doe");
//        System.out.println(fullName("anish", "sachdeva"));
//        System.out.println(name);
        int value = numberIncrement(20);
        System.out.println(value);
    }

    private static void helloWorld() {
        System.out.println("Hello world");
        System.out.println("hi i am inside function");
    }

    private static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private static int numberIncrement(int number) {
        return number + 1;
    }
}
