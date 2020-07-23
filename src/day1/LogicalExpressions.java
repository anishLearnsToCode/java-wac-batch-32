package day1;

import java.util.Scanner;

public class LogicalExpressions {
    /*
        Time Complexity: O(1)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();

        // Equality Operator
//        System.out.println(a == b);

        // greater than operator
//        System.out.println(a > b);

        // greater than equals
//        System.out.println(a >= b);

        // less than operator
//        System.out.println(a < b);

        // less than equals operator
//        System.out.println(a <= b); // a < b or a == b

        // or operator (||)
//        System.out.println(false || false);     // false
//        System.out.println(true || false);      // true
//        System.out.println(false || true);      // true
//        System.out.println(true || true);       // true
//        System.out.println(false || false || false || true);        // true
//        System.out.println(1 < 2 || 1 == 2);    // true

        // And operator (&&)
//        System.out.println(false && false);         // false
//        System.out.println(false && true);          // false
//        System.out.println(true && false);          // false
//        System.out.println(true && true);           // true

        // Not operator (!)
//        System.out.println(!true);
//        System.out.println(!!!!!!!!!!!false);

        System.out.println(!(5 > 4));

        // 3 * 2 > 4
        // 6 > 4
        // true

//        System.out.println(3 * 2 / 100 * 1 / 100 > 90 * (3 + 2) - (3 / 4));
        // 3 * 0 * 1 / 100 > 90 * (3 + 2) - (3 / 4)
        // 3 * 0 * 0 > 90 * (3 + 2) - (3 / 4)
        // 0 * 0 > 90 * (3 + 2) - (3 / 4)
        // 0 > 90 * (3 + 2) - (3 / 4)
        // 0 > 90 * (5) - (3 / 4)
        // 0 > 90 * 5 - (3 / 4)
        // 0 > 90 * 5 - (0)
        // 0 > 90 * 5 - 0
        // 0 > 450 - 0
        // 0 > 450
        // false
    }
}
