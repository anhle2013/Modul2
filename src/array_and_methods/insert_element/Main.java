package array_and_methods.insert_element;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new element: ");
        int x = sc.nextInt();
        int index;
        do {
            System.out.print("Enter index to insert element: ");
            index = sc.nextInt();
            if (index >= arr.length -1 || index < 0)
                System.out.println("Can not insert element!");
        } while (index >= arr.length -1 || index < 0);

        for (int i = arr.length-1; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = x;
        System.out.println("New array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
