package day10;

import day9.Circle;

import java.util.HashSet;
import java.util.Set;

public class HashCodeMethod {
    public static void main(String[] args) {
        Circle a = new Circle(0);
        Circle b = new Circle(0);
        Circle zero = new Circle(0);
        System.out.println(a.equals(b));
        System.out.println(zero.equals(a));

        Set<Circle> circles = new HashSet<>();
        circles.add(a);
        circles.add(b);
        circles.add(zero);
        circles.add(new Circle(1));
        circles.add(new Circle(2.2));
        circles.add(new Circle(2.7));

        System.out.println(circles);
    }
}
