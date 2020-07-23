package day1;

public class ArithmeticExpressions {
    /*
        Time Complexity: O(1)
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Basic arithmetic operations
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a / b); // --> 1.66 --> 1
//        System.out.println(a * b);

//        System.out.println(a + a / b);
        // 5 + 5 / 3
        // 5 + 1
        // 6

        // explicit type casting
//        System.out.println(a + ((double) a) / b);
        // 5 + 5.0 / 3
        // 5 + 5.0 / 3.0
        // 5 + 1.667
        // 5.0 + 1.667
        // 6.667

        // modulus operator
//        System.out.println(0 % 2);
//
//        System.out.println((char) ('a' + 1));
        // char (2 bytes) + int (4 bytes)
        // char -> int 'a' --> 97 + 1
        // 97 + 1
        // char(98) --> 'b'

        // Increment Operator
        int i = 10;
        i++; // --> i = i + 1; post increment operator
        System.out.println(i);
        ++i; // prefix increment operator
        System.out.println(i);

        System.out.println(i++);
        System.out.println(++i);

        a = 0;
//        System.out.println(a + a++ + ++a + a++ + a);
//        System.out.println(a);
        // option 1 : 3
        // option 2 : 7 🎉
        // option 3 : 5
        // option 4 : 6

        // a = 0 0 +
        // a = 1 0 + 0
        // a = 2 0 + 0 + 2
        // a = 3 0 + 0 + 2 + 2
        // a = 3 0 + 0 + 2 + 2 + 3
        // a = 3 ans = 7

        // Decrement operator
        a--; // --> a = a - 1; postfix decrement operator
        --a; // prefix decrement operator

        a = 5;
        System.out.println(a + a-- + a++ + --a + -a + a++ - a + -2 * a);
        System.out.println(a);
        // option 1 : 3 🎉💃
        // option 2 : 2

        // a = 5 | 5 +
        // a = 4 | 5 + 5 +
        // a = 5 | 5 + 5 + 4 +
        // a = 4 | 5 + 5 + 4 + 4 +
        // a = 4 | 5 + 5 + 4 + 4 + (-4) +
        // a = 5 | 5 + 5 + 4 + 4 + (-4) + 4 +
        // a = 5 | 5 + 5 + 4 + 4 + (-4) + 4 - 5 +
        // a = 5 | 5 + 5 + 4 + 4 + (-4) + 4 - 5 + (-2 * 5)
        // a = 5 | 5 + 5 + 4 + 4 + (-4) + 4 - 5 + -10
        // a = 5 | ans = 3
    }
}
