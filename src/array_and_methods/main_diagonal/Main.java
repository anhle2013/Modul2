package array_and_methods.main_diagonal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];
        System.out.println("Enter value of element in matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("matrix[%d][%d] = ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int sumMainDiagonal = 0;
        for (int i = 0; i < size; i++) {
            sumMainDiagonal += matrix[i][i];
        }
        System.out.println("Sum of Main Diagonal is: " + sumMainDiagonal);
    }
}
