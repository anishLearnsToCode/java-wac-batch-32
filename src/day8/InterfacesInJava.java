package day8;

public class InterfacesInJava {
    public static void main(String[] args) {
        MyCircleAwesome circle = new MyCircleAwesome();
        Image image = new Image();
        complexAlgorithm(image);
        complexAlgorithm(circle);
    }

    private static void complexAlgorithm(Morphable morphable) {
        morphable.shrink(10);
        morphable.grow(2);
    }
}

interface Rotatable {
    void rotateClockWise(double theta);
    void rotateAntiClockWise(double theta);
}

interface Morphable {
    void grow(int factor);
    void shrink(int factor);
}

abstract class Shape {
    abstract void draw();
}

class MyCircleAwesome extends Shape implements Morphable, Rotatable {
    @Override
    public void rotateClockWise(double theta) {

    }

    @Override
    public void rotateAntiClockWise(double theta) {

    }

    @Override
    public void grow(int factor) {

    }

    @Override
    public void shrink(int factor) {

    }

    @Override
    void draw() {

    }
}

class Image implements Morphable {

    @Override
    public void grow(int factor) {

    }

    @Override
    public void shrink(int factor) {

    }
}
