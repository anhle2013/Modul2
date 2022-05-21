package dsa_stack_queue.stack_array;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack<Integer> myStack = new MyStack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.pop();
        myStack.pop();
        myStack.push(10);
        myStack.pop();
    }
}
