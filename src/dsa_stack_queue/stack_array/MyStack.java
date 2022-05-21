package dsa_stack_queue.stack_array;

public class MyStack<E> {
    public E[] arr;
    public int size;
    public int index = -1;
    public MyStack(int size) {
        this.size = size;
        arr = (E[]) new Object[size];
    }
    public void push(E element) {
        if (isFull())
            throw new StackOverflowError("Stack is full");
        //System.out.println("Element: " + element + " is pushed to Stack");
        arr[++index] = element;
    }
    public E pop() throws Exception {
        if (isEmpty())
            throw new Exception ("Underflow! Unable to remove element");
        //System.out.println("Pop operation done! removed: " + arr[index]);
        return arr[index--];
    }
    public int size() {
        return index;
    }
    public boolean isEmpty() {
        return index == -1;
    }
    public boolean isFull() {
        return index == size - 1;
    }
}
