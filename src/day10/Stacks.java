package day10;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(20);
        stack.push(-34);
        stack.push(-4);

        System.out.println(stack.search(100));
        System.out.println(stack.search(-34));
    }
}
