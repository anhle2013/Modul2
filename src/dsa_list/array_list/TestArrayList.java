package dsa_list.array_list;

public class TestArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> integers = new MyArrayList<>();
        integers.add(10);
        integers.add(11);
        integers.add(12);
        integers.add(13);
        integers.add(14);
        integers.add(15);
        integers.add(16);
        integers.add(17);
        integers.add(18);
        integers.add(1,0);
        integers.add(19);
        integers.printList();
        integers.remove(1);
        System.out.println();
        System.out.println(integers.contains(0));
        System.out.println(integers.indexOf(11));
        integers.remove(20);

        integers.clear();
        integers.printList();
    }
}
