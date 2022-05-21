package dsa_stack_queue.decimal_to_binary;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class BinaryStack {
    private ArrayList<Integer> stack;
    public BinaryStack() {
        this.stack = new ArrayList<>();
    }
    public void push(int number) {
        stack.add(number);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() -1 );
    }
    public int size() {
        return stack.size();
    }
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void convertDecimalToBinary(int number) {
        while (number > 0) {
            int num = number % 2;
            push(num);
            number /= 2;
        }
        System.out.print(" = (");
        if (isEmpty())
            System.out.print("0");
        while (!isEmpty())
            System.out.print(pop());
        System.out.println(")B");
    }
}
