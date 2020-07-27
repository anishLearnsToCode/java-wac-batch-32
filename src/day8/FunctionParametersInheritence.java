package day8;

public class FunctionParametersInheritence {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle = new Square();
    }

    private static void draw(Shape shape) {
        shape.draw();
    }

    static class Shape {
        public void draw() {
            System.out.println("i am drawing generic shape");
        }
    }

    static class Circle extends Shape {
        int radius;

        @Override
        public void draw() {
            System.out.println("drawing circle");
        }
    }

    static class Square extends Shape {
        @Override
        public void draw() {
            System.out.println("drawing square");
        }
    }
}
