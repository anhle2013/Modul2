package dsa_stack_queue.queue;

public class Solution {
    public static void enQueue(Queue queue, int value) {
        Node temp = new Node();
        temp.data = value;
        if (queue.front == null)
            queue.front = temp;
        else
            queue.rear.link = temp;
        queue.rear = temp;
        queue.rear.link = queue.front;

    }
    public static void deQueue(Queue queue) {
        if (queue.front == null) {
            System.out.println("Queue empty!");
        }
        else if (queue.front == queue.rear)
            queue.front = queue.rear = null;
        else {
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
    }
    public static void displayQueue(Queue queue) {
        Node temp = queue.front;
        System.out.println("\nElement in Queue:");
        while (temp.link != queue.front) {
            System.out.print(temp.data + "\t");
            temp = temp.link;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        enQueue(queue,1);
        enQueue(queue,2);
        enQueue(queue,10);
        enQueue(queue,11);
        enQueue(queue,20);
        displayQueue(queue);

        deQueue(queue);
        displayQueue(queue);
    }
}
