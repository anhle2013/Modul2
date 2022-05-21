package dsa_list.array_list;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyArrayList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int capacity) {
        elements = (E[]) new Object[capacity];
    }
    public boolean add(E element) {
        if (size == elements.length)
            ensureCapacity();
        elements[size++] = element;
        return true;
    }
    public void add (int index, E element) {
        if(size == elements.length)
            ensureCapacity();
        if (size - index >= 0)
            System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public void remove(int index){
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException(
                    "index: " + index +
                            ", but size: " + size);

        System.arraycopy(elements, index + 1, elements, index, size - index);
        elements[--size] = null;
    }

    public int size(){
        return size;
    }

    public E[] clone(){
        E[] newArr = (E[]) new Object[size];
        System.arraycopy(elements, 0, newArr, 0, size);
        return newArr;
    }

    public boolean contains(E e) {
        for (E element : elements)
            if (e.equals(element))
                return true;
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i])) return i;
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public E get(int index){
        if(index > size  || index < 0){
            throw new IndexOutOfBoundsException(
                    "index: " + index +
                            ", but size: " + size);
        }
        return elements[index];
    }

    public void clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void printList() {
        if (size == 0) {
            System.out.println("\nArraylist not availble");
            return;
        }
        System.out.println("\nArray list:");
        for (int i = 0; i < size; i++)
            System.out.print(elements[i] + "\t");
    }
}
