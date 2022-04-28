package array_and_methods.find_max;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size to large, not exceed 20!");
        } while (size > 20);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element at position %d: ", i);
            array[i] = sc.nextInt();
        }

        System.out.println("Property list:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.printf("\nThe largest property value in the array is: %s, at position %d", max, index);
    }
}
