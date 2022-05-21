package dsa_list.my_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList test = new MyLinkedList(0);
        test.addFirst(1);
        test.addFirst(2);
        test.addFirst(3);

        test.add(4,8);
        test.add(4,9);
        test.printList();
    }
}
