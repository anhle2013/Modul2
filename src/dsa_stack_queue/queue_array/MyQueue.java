package dsa_stack_queue.queue_array;

public class MyQueue<E> {
    public int capacity;
    public E[] queueArr;
    public int head = 0;
    public int tail = -1;
    public int currentSize = 0;
    public MyQueue(int queueSize) {
        capacity = queueSize;
        queueArr = (E[]) new Object[capacity];
    }
    public boolean isQueueFull() {
        return currentSize == capacity;
    }
    public boolean isEmpty() {
        return currentSize == 0;
    }
    public void enqueue(E item) {
        if (isQueueFull()) {
            System.out.println("Overflow! Unable to add element: " + item);
            return;
        }
        tail++;
        if (tail == capacity)
            tail = 0;
        queueArr[tail] = item;
        currentSize++;
        //System.out.println("Element " + item + " is pushed to Queue");
    }
    public E dequeue() throws Exception {
        if (isEmpty())
            throw new Exception("Underflow! Unable to remove element from Queue");

        E temp = queueArr[head++];
        //System.out.println("Pop operation done ! removed: " + queueArr[head++]);
        if (head == capacity)
            head = 0;
        currentSize--;
        return temp;
    }
}
