//package com.company;
//
//public class Main {
//
//    public static void main(String args[]) {
//        int[] arr = {40, 11, 10, 2, 11, 90, 15 };
//        System.out.println("Original array is:");
//        printArray(arr);
//
//        mergeSort(arr, true);
//        System.out.println("Sorted array in ascending order with Merge Sort:");
//        printArray(arr);
//
//        mergeSort(arr, false);
//        System.out.println("Sorted array in descending order with Merge Sort:");
//        printArray(arr);
//    }
//
//    public static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(arr[i] + "\t");
//        System.out.println();
//    }
//
//    public static void mergeSort(int[] arr, boolean increase) {
//        if (arr.length < 2)
//            return;
//        else {
//            int mid = arr.length/2;
//            int[] L = new int[mid];
//            int[] R = new int[arr.length - mid];
//
//            for (int i = 0; i < mid; i++)
//                L[i] = arr[i];
//            for (int j = 0; j < arr.length - mid; j++)
//                R[j] = arr[mid + j];
//
//            mergeSort(L, increase);
//            mergeSort(R, increase);
//            merge(arr, L, R, increase);
//        }
//    }
//
//    public static void merge(int[] arr, int[] L, int[] R, boolean increase) {
//        int i = 0, j = 0, k = 0;
//        while (i < L.length && j < R.length) {
//            if (increase) {
//                if (L[i] <= R[j])
//                    arr[k++] = L[i++];
//                else
//                    arr[k++] = R[j++];
//            }
//            else {
//                if (L[i] <= R[j])
//                    arr[k++] = R[j++];
//                else arr[k++] = L[i++];
//            }
//        }
//        while (i < L.length) {
//            arr[k++] = L[i++];
//        }
//        while (j < R.length) {
//            arr[k++] = R[j++];
//        }
//    }
//}

package array_and_methods.merge_sort;

public class Main {

    public static void main(String args[]) {
        int[] arr = {40, 11, 10, 2, 11, 90, 15 };
        System.out.println("Original array is:");
        printArray(arr);

        mergeSort(arr);
        System.out.println("Sorted array in ascending order with Merge Sort:");
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }

    public static void mergeSort(int[] arr) {
        if (arr.length == 1)
            return;
        else {
            int mid = arr.length/2;
            int[] L = new int[mid];
            int[] R = new int[arr.length - mid];

            for (int i = 0; i < mid; i++)
                L[i] = arr[i];
            for (int j = 0; j < arr.length - mid; j++)
                R[j] = arr[mid + j];

            mergeSort(L);
            mergeSort(R);
            merge(arr, L, R);
        }
    }

    public static void merge(int[] arr, int[] L, int[] R) {
        int i = 0, j = 0, k = 0;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }
        while (i < L.length) {
            arr[k++] = L[i++];
        }
        while (j < R.length) {
            arr[k++] = R[j++];
        }
    }

}