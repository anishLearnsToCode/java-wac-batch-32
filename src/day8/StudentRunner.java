package day8;

public class StudentRunner {
    public static void main(String[] args) {
        Student anish = new Student();
//        System.out.println(anish.firstName);
//        System.out.println(anish.lastName);
//        System.out.println(anish.age);

        anish.firstName = "anish";
        anish.lastName = "sachdeva";
        anish.age = 22;

//        System.out.println(anish.firstName);
//        System.out.println(anish.lastName);
//        System.out.println(anish.age);

        Student raj = new Student();
        raj.firstName = "raj";
        raj.age = 25;
//        System.out.println(raj.firstName);
//        System.out.println(raj.lastName);
//        System.out.println(raj.age);

        System.out.println(raj);

        Circle circle1 = new Circle();
        circle1.radius = 10;

        Circle circle2 = new Circle();
        circle2.radius = 0;

        Circle circle3 = new Circle();
        circle3.radius = 4;

        System.out.println(circle1.area());
        System.out.println(circle2.area());
        System.out.println(circle3.area());
        System.out.println(circle3.perimeter());

        System.out.println(area(circle1.radius));
    }

    private static double area(double radius) {
        return Math.PI * radius * radius;
    }
}

/*
    ADT: Abstract Data Type Look like
 */
class Student {
    String firstName;
    String lastName;
    int age;
}

class Circle {
    double radius;

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
