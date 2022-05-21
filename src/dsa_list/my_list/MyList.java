package dsa_list.my_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add (E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }
    public E get(int index) {
        if (index >= size || index <0)
            throw new IndexOutOfBoundsException(
                    "Index " + index +
                    ", size " + size);
        return elements[index];
    }
}
