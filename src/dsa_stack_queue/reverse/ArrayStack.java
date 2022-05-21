package dsa_stack_queue.reverse;

import java.util.EmptyStackException;

public class ArrayStack<T> {
    int size;
    int top = -1;
    T [] stack;

    public ArrayStack(int arrayLength) {
        size = arrayLength;
        stack = (T[]) new Object[size];
    }
    public boolean isEmpty () {
        return top < 0;
    }

    public void push(T element) {
        if (top >= size)
            throw new EmptyStackException();

        top++;
        stack[top] = element;
    }

    public T pop() {
        if (isEmpty())
            throw new EmptyStackException();
        return stack[top--];
    }
}
