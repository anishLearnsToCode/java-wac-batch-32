package day10;

import day9.Circle;

public class GraphingApplicationRunner {
    public static void main(String[] args) {
        for (Circle circle : new GraphingApplication()) {
            System.out.println(circle);
            System.out.println(circle.area());
            System.out.println();
        }
    }
}
