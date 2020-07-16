package day1;

public class WhileLoops {
    public static void main(String[] args) {
        /*
        while (condition) {
            code
            code
        }

        condition --> code --> condition --> code --> condition --> code --> condition --> false --> loop ends
         */

        // infinite loop ♾
//        while (true) {
//            System.out.println("hello world");
//            System.out.println("hello");
//        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("i am outside loop");
    }
}
