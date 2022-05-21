package dsa_stack_queue.reverse;

public class ReverseArrayStack<T> {
    public static <T> void reverseArray(T[] array) {
        ArrayStack<T> stack = new ArrayStack(array.length);

        for (T element : array)
            stack.push(element);

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        System.out.println("\nArray reversed:");
        for (T element : array) {
            System.out.print(element + "\t");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {10,20,30,40,50};
        reverseArray(arr);

        String str = "abcdef";
        Character[] characters = new Character[str.length()];
        for (int i = 0; i < characters.length; i++)
            characters[i] = str.charAt(i);
        reverseArray(characters);

        String[] strings = new String[] {"Hello", "Hi", "3"};
        reverseArray(strings);
    }
}
