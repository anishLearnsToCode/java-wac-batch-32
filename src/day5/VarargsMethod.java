package day5;

public class VarargsMethod {
    /*
        varargs can be only one in one function
        they must be the last parameter
     */
    public static void main(String[] args) {
//        System.out.println(sum(1, 2, 3, 4, 5));
//        System.out.println(sum());
//        System.out.println(sum(-100, 90));

        func('a');
        func('a', 'n', 'i');
        func('i', 'j');
    }

    private static int sum(int... numbers) {
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        return sum;
    }

    private static void func(char normal, char... characters) {
        System.out.println(normal);
        System.out.println(characters);
    }

    // a b c d
    // i a
    // j bcd cd b  phi
    // k phi d  cd bcd
    // phi = nothing
    private static void func2(char i, char j, char... k) {

    }
}
