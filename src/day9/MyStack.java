package day9;

public class MyStack {
    private final int[] array = new int[20];
    private int position = 0;

    /*
        push(int value)
        place value at top of stack
        @return void
     */
    public void push(int element) {
        if (size() == array.length) {
            System.out.println("stack overflow error");
            return;
        }
        array[position++] = element;
    }

    /*
        peek()
        top element --> value
        @return top element value
     */
    public int peek() {
        if (size() == 0) {
            System.out.println("empty stack error");
            return -1;
        }
        return array[position - 1];
    }

    /*
        pop()
        @return top element value
        remove top element
     */
    public int pop() {
        if (size() == 0) {
            System.out.println("stack underflow error");
            return -1;
        }
        return array[--position];
    }

    /*
        size()
        @return --> number of elements
     */
    public int size() {
        return position;
    }
}
