package dsa_list.linked_list;
//import java.util.LinkedList;

public class MyLinkedList<E> {
    class Node {
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes;
    public MyLinkedList() {}
    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index -1 && temp.next != null; i++)
            temp = temp.next;
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }
    public void addLast(E e) {
        Node temp = head;
        for (int i = 0; temp.next != null; i++)
            temp = temp.next;
        temp.next = new Node(e);
        numNodes++;
    }
    public E remove(int index) {
        if (index < 0 || index >= numNodes || head == null)
            throw new ArrayIndexOutOfBoundsException(
                    "index: " + index +
                    ", but numNodes: " + numNodes);

        Node temp = head;
        Node remove;
        if (index == 0) {
            remove = head;
            head = head.next;
            numNodes--;
            return (E) remove.data;
        }

        for (int i = 0; i < index - 1; i++)
            temp = temp.next;
        remove = temp.next;
        if (index == numNodes - 1)
            temp.next = null;

        temp.next = temp.next.next;
        numNodes--;
        return (E) remove;
    }

    public boolean remove(Object e) {
        Node temp = head;
        while (temp != null) {
            if (e.equals(temp.data)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int size() {
        return numNodes;
    }

    public MyLinkedList clone() {
        MyLinkedList newList = new MyLinkedList<>();
        Node temp = head;
        while (temp != null) {
            newList.addLast(temp.data);
            temp = temp.next;
        }
        return newList;
    }
    public boolean contains(E e) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(e))
                return true;
            temp = temp.next;
        }
        return false;
    }
    public int indexOf(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(e))
                return i;
            temp = temp.next;
        }
        return -1;
    }
    public boolean add(E e) {
        if (head == null)
            addFirst(e);
        else addLast(e);
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes || head == null)
            throw new ArrayIndexOutOfBoundsException(
                    "index: " + index +
                            ", but numNodes: " + numNodes);

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;

    }
    public E getFirst() {
        return (E) head.getData();
    }

    public E getLast() {
        if (head == null) {
            return null;
        } else {
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
            }
            return (E) temp.data;
        }
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }
    public String toString() {
        String str = "Linked list: \n";
        Node temp = head;
        while (temp != null) {
            str += temp.data + "\t";
            temp = temp.next;
        }
        return str;
    }
}
