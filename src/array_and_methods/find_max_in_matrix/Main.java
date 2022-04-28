package array_and_methods.find_max_in_matrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns of matrix: ");
        int columns = sc.nextInt();

        double[][] matrix = new double[rows][columns];
        System.out.println("Enter value of element in matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("matrix[%d][%d] = ", i, j);
                matrix[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }

        double max = matrix[0][0];
        int row = 0, column = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max ) {
                    max = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.printf("Max value in matrix is: %f, at row %d and colum %d", max, row, column);
    }
}
