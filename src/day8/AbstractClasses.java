package day8;

public class AbstractClasses {
    public static void main(String[] args) {
        // not possible
//        GenericShape shape = new GenericShape();
        GenericShape shape = new MyCircle(5);
        GenericShape shape1 = new MyCircle(10);
        doStuff(shape);
        doStuff(shape1);
    }

    private static void doStuff(GenericShape shape) {
        shape.draw();
        shape.move(10, 10);
    }
}

abstract class BasicBank {
     abstract public double rateOfInterest();
}

class HDFC extends BasicBank {
    @Override
    public double rateOfInterest() {
        return 6.5;
    }
}

abstract class GenericShape {
    int me = 10;
    String property = "hello";

    abstract void draw();
    abstract void move(int x, int y);

    public void hello() {
        System.out.println("hello world");
    }
}

class MyCircle extends GenericShape {

    int radius;

    MyCircle(int radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("i am drawing circle : " + radius);
    }

    @Override
    void move(int x, int y) {
        System.out.println("moving to : " + x + " ; " + y);
    }
}