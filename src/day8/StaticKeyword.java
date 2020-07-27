package day8;

public class StaticKeyword {
    public static void main() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        System.out.println(MyStudent.minAttendance);
        MyStudent.increaseAttendnce();
        System.out.println(MyStudent.minAttendance);
    }
}

class MyStudent {
    String firstName;
    static double minAttendance = 0.7;
    String lastName;
    int age;

    static void increaseAttendnce() {
        minAttendance += 0.04;
    }
}

class Person {
    public static final int DRIVING_AGE = 18;
    String firstName;
    String lastName;
    int age;

    boolean personCanDrive() {
        return this.age >= Person.DRIVING_AGE;
    }
}

