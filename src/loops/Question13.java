// http://www.beginwithjava.com/java/loops/questions.html

package loops;

public class Question13 {
    // Write a program to print out all Armstrong numbers between 1 and 500.
    // If sum of cubes of each digit of the number is equal to the number itself,
    // then the number is called an Armstrong number.
    // For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

    public static void main(String[] args) {
        for (int i = 1 ; i <= 500 ; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isArmstrong(int number) {
        int mostSignificantDigit /* (xdd) */ = number / 100;
        int leastSignificantDigit /* (ddx) */ = number % 10;
        int middleDigit /* dxd */ = (number / 10) % 10;

        return number == cube(mostSignificantDigit) + cube(middleDigit) + cube(leastSignificantDigit);
    }

    private static long cube(int number) {
        return (long) Math.pow(number, 3);
    }
}
