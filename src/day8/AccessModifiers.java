package day8;

public class AccessModifiers {
    /*
        * public
        default
        protected
        * private
     */

    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1.area);

//        Square square2 = new Square(10);
//        System.out.println(square2.area);
    }
}

// immutable
// final
class Square {
    public final int side;
    public final int area;

    // default Constructor
    Square() {
        this(0);
        System.out.println("default constructor");
    }

    Square(int side) {
        System.out.println("parameterized constructor");
        this.side = side;
        this.area = area();
    }

    private int area() {
        return side * side;
    }
}
