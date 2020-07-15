// http://www.beginwithjava.com/java/loops/questions.html

package loops;

public class Question2 {
    // Write a program to calculate the sum of first 10 natural number.
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1 ; number <= 10 ; sum += number++);
        System.out.println(sum);
    }
}
