package day9;

import java.util.Objects;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Circle) {
            Circle other = (Circle) object;
            return this.radius == other.radius;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }


//    @Override
//    public String toString() {
//        return "hello world";
//    }

    @Override
    public void draw() {
        System.out.println("drawing circle : " + radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void grow(double factor) {
        this.radius *= factor;
    }

    @Override
    public void shrink(int factor) {
        this.radius /= factor;
    }

    @Override
    public void rotateClockWise(double angle) {
        System.out.println("nothing");
    }

    @Override
    public void rotateCounterClockWise(double angle) {
        System.out.println("nothing");
    }
}
