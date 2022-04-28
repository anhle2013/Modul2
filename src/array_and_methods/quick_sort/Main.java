package array_and_methods.quick_sort;

public class Main {

    public static void main(String[] args) {
        int[] arr = {40, 21, 20, 22, 11, 10, 15 };
        System.out.println("Original array is:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array sorted with Quick Sort:");
        printArray(arr);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int index = low; //chỉ số để swap giá trị (kể cả pivot)
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[high];
        arr[high] = temp;
        return index;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = partition(arr, low, high);
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }
    }
}
