package day4;

public class HypotenuseRightTriangle {

    // sqrt(a^2 + b^2)
    /*
        time complexity: O(log(a^2 + b^2))
        space complexity: O(1)
     */
    private static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}
