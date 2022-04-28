package array_and_methods.merge_arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array 1: ");
        int size1 = sc.nextInt();
        System.out.print("Enter size of array 2: ");
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        System.out.println("Enter element in array 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("\nEnter element in array 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("arr2[" + i + "] = ");
            arr2[i] = sc.nextInt();
        }
        int size3 = size1 + size2;
        int[] array3 = new int[size3];
        for (int i = 0; i < size1; i++) {
            array3[i] = arr1[i];
        }
        for (int i = size1; i < size3; i++) {
            array3[i] = arr2[i - size1];
        }
        System.out.println("New merged array:");
        for (int i = 0; i < size3; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}
