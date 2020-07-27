package day8;

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square1 = new Square(10);
        Square square2 = new Square(10);

//        System.out.println(square1.equals(square2));
        System.out.println(square1);
    }


    private static class Shape {
        double area;
        double perimeter;

        // final methods can't be overriden
        final void helloWorld() {
            System.out.println("hello world : shape");
        }
    }

    private static class Circle extends Shape {
        int radius;

        // not possible
//        void helloWorld() {
//            System.out.println("hello world circle");
//        }
    }

    private static class Square extends Shape {
        int side;

        Square(int side) {
            this.side = side;
        }

        @Override
        public int hashCode() {
            return 1000;
        }

        @Override
        public boolean equals(Object object) {
            if (object instanceof Square) {
                Square other = (Square) object;
                return this.side == other.side;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Square{" +
                    "side=" + side +
                    '}';
        }
    }
}

