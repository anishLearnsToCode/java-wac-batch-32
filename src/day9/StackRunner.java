package day9;

public class StackRunner {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        // empty

        stack.push(9);
        // 9

        stack.push(11);
        // 9 11

        stack.push(-45);
        // 9 11 -45

        System.out.println(stack.size());
        // 3

        System.out.println(stack.peek());
        // -45

        System.out.println(stack.pop());
        // -45

        System.out.println(stack.size());
        // 2

        System.out.println(stack.pop());
        // 11

        System.out.println(stack.size());
        // 1

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        for (int i = 0 ; i < 20 ; i++) {
            stack.push(i);
        }

        stack.push(100);
    }
}
