package array_and_methods.sum_column;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();
        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("matrix[%d][%d] = ", i, j);
                matrix[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }

        int column;
        do {
            System.out.print("Enter a column: ");
            column = sc.nextInt();
            if (column < 1 || column > columns)
                System.out.println("Invalid column!");
        } while (column < 1 || column > columns);
        double total_column = 0;
        for (int i = 0; i < rows; i++) {
            total_column += matrix [i][column -1];
        }
        System.out.printf("Total of column %d is: %f", column, total_column);
    }
}
