package day9;

public class GraphicsApplication {
    public static void main(String[] args) {
        Circle circle = new Circle(0.5);
        System.out.println(circle.area());
        circle.grow(2);
        System.out.println(circle.getRadius());
        System.out.println(circle.area());
    }

    private static void drawStretched(Shape shape) {
        shape.grow(10);
        shape.rotateClockWise(89);
        shape.shrink(2);
        shape.draw();
    }
}
