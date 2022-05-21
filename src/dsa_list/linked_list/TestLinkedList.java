package dsa_list.linked_list;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list1 = new MyLinkedList<>();
        list1.addFirst("a");
        list1.addFirst("b");
        list1.addLast("c");
        list1.add(2,"x");
        System.out.println(list1);

        MyLinkedList<Double> list2 = new MyLinkedList<>();
        //System.out.println(list2.getFirst());
        list2.add(10.0);
        list2.addFirst(1.1);
        list2.addLast(2.2);
        list2.add(1,3.3);
        list2.remove(1);
        //System.out.println(list2.getFirst());
        System.out.println(list2.remove(1));
        System.out.println(list2);
        System.out.println(list2.size());

    }
}
