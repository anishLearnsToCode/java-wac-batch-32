package day2;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // infinite loop
//        while (true) {
//            System.out.println("this is infinite loop");
//        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while (i < n) {
            System.out.println(i);
            i++; // i = i + 1 --> (i = i + 1)++
        }
        System.out.println("i am outside loop");
    }
}
