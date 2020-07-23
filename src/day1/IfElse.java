package day1;

import java.util.Scanner;

public class IfElse {
    /*
        Time Complexity : O(1)
     */
    public static void main(String[] args) {
        /*
        if (condition) {
            code
        } else if (condition2) {
            code
        } else if (condition3) {
            code
        }
        .
        ..
        ..
        ..
        else {
            code
        }

        else is not compulsory
        else if is not compulsory
         */

        if (false) {
            System.out.println("yeah!! i am in if");
        }

//        if (true) {
//            System.out.println("i am in if block");
//        } else {
//            System.out.println("i am in else block");
//        }

        boolean itRains = false;
        boolean weatherIsNice = false;

        if (itRains) {
            System.out.println("i will carry umbrella");
        } else if (!itRains && weatherIsNice) {
            System.out.println("i will go to picnic");
        } else {
            System.out.println("i will go cycling");
        }

        Scanner instrument = new Scanner(System.in);

//        System.out.println("i am outside if else");
    }
}
