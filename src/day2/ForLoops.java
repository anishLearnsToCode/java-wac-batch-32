package day2;

public class ForLoops {
    /*
        for (instantiation ; condition ; statement / increment-decrement statement) {
            code
            code
        }

        instantiation --> condition --> code --> increment --> condition --> code --> increment --> condition --> code
        instantiation --> (condition --> code --> increment) --> condition false --> loop end
     */

    public static void main(String[] args) {
        int j = 10;

//        for (int i = 0 ; i < 10 ; i++) {
//            System.out.println(i);
//            i = 5;
//        }

        for  (int sum = 0, i = 1 ; i <= 10 ; i++) {
            sum += i;
        }

//        for (int sum = 0, i = 1 ; i <= 10 ; sum += i, i++);

//        for (int i = 0 ; i < 5 ; System.out.println("hello world : " + i), i++);

//        for (int i = 0 ; i < 5 ; System.out.println("hello world : " + ++i));

        // infinite loop
//        for ( ; ; ) {
//            System.out.println("hello world");
//        }

//        for (int i = 0 ; i < 67 && j > 90 ; i++, j -= 2) {
//
//        }

        // option 1 : 0
        // option 2 : 0 - 10
        // option 3 : 0 - 9

//        i = 10;

        // exactly the same
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }

//        System.out.println("i am out of loop");
    }
}
