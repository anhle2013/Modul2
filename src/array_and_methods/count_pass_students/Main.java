package array_and_methods.count_pass_students;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter size: ");
            size = sc.nextInt();
            if (size > 30 || size < 1)
                System.out.println("Invalid size!");
        } while (size > 30 || size < 1);
        double[] students = new double[size];
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            students[i] = sc.nextDouble();
        }

        int count_pass = 0;
        System.out.println("List of mark: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + "\t");
            if (students[i] > 5)
                count_pass++;
        }
        System.out.println("\nThe number of students passing the exam is " + count_pass);
    }
}
