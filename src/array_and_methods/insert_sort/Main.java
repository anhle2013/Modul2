package array_and_methods.insert_sort;

public class Main {

    public static void main(String[] args) {
        int[] arr = {40, 11, 10, 2, 11, 90, 15 };
        System.out.println("Original array is:");
        printArray(arr);

        insertionSort(arr);
        System.out.println("Array sorted with Insertion Sort:");
        printArray(arr);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            while ((i - 1) >= 0 && array[i] < array[i-1]) {
                array[i] = array[i-1];
                array[i-1] = temp;
                i--;
            }
        }
    }
}
