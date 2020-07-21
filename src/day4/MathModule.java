package day4;

public class MathModule {
    public static void main(String[] args) {
//        System.out.println(Math.max(34, -90));
//        System.out.println(Math.min(90, -78));
//        System.out.println(Math.min(100, Math.min(10, 78)));

//        System.out.println(Math.PI);
//        System.out.println(Math.random());
        System.out.println(randomInteger(-100, 100));
    }

    private static int randomInteger(int a, int b) {
        return (int) (Math.random() * (b - a) + a);
    }
}
