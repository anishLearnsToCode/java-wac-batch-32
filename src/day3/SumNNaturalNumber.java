package day3;

public class SumNNaturalNumber {
    public static void main(String[] args) {

    }


    // 1 + 2 + 3 + 4 + ... + N
    private static int sumNaturalNumbers(int number) {
        return (number * (number + 1)) / 2;
    }
}
