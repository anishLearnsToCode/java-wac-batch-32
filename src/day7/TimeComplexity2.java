package day7;

import java.util.Scanner;

public class TimeComplexity2 {
    /*
        time complexity: O()
        space complexity: O()

        0
        0 + 1
        0 + 1 + 2
        0 + 1 + 2 + 3
        0 + 1 + 2 + 3 + 4
        s = 0 + 1 + 2 + 3 + 4 + ... + k = k(k + 1) / 2

        s == n
        k(k + 1) / 2 = n
        k = O(n ^ 1/2)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0, s = 0;

        while (s < n) {
            i++;
            s += i;
            System.out.println(s);
        }
    }
}
