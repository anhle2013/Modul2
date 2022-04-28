package array_and_methods.find_min_with_method;

public class Main {

    public static void main(String[] args) {
        int[] array = {4,12,3,5,24,-5,-8,10};
        int index = findMin(array);
        System.out.printf("The smallest element in the array is: %s, at position %d", array[index], index);
    }
    public static int findMin(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index])
                index = i;
        } return index;
    }
}
