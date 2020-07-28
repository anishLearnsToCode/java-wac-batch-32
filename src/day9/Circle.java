package day9;

public class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

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
