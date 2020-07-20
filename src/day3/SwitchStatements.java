package day3;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 0 :
                System.out.println("this is not valid");
                break;
            case -1:
                System.out.println("not allowed");
                break;
            case 100:
                System.out.println("okay will do");
//            default:
//                System.out.println("not my cup of tea");
        }
    }
}
