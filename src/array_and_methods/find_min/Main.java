package array_and_methods.find_min;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

        int index_min = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < array[index_min])
                index_min = i;
        }
        System.out.printf("Min value in array: %d, at position %d", array[index_min], index_min);
    }
}
