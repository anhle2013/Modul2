package dsa_stack_queue.queue_array;

public class QueueClient {
    public static void main(String[] args) throws Exception {
        MyQueue<Integer> myQueue = new MyQueue(3);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.dequeue();
        myQueue.enqueue(4);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
    }
}
