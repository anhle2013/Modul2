package array_and_methods.selection_sort;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,4,8,22,66,11};
        System.out.println("Original array is:");
        printArray(arr);

        selectionSort(arr);
        System.out.println("Array sorted with Selection Sort:");
        printArray(arr);
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min_index])
                    min_index = j;

            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "\t");
        System.out.println("");
    }
}
