package day8;

import java.util.Arrays;

public class InheritanceContinued {
    public static void main(String[] args) {
        C c = new C(10);
//        System.out.println(Arrays.toString(args));
    }
}

class A {
    A() {
        System.out.println("i am in a");
    }
}

class B extends A {
    B(String string) {
        System.out.println("i am in b: " + string);
    }
}

class C extends B {
    C() {
        super("hello world");
        System.out.println("i am in c");
    }

    C(int a) {
        this();
        System.out.println("i am in c : " + a);
    }

    C(String string, int a) {
        super(string);
        System.out.println("i am in c : " + a);
    }
}
