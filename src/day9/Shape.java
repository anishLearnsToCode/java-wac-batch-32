package day9;

public interface Shape extends Rotatable, Morphable {
    void draw();
    double area();
    double perimeter();
}
