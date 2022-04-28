package array_and_methods.find_element;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] students = {"Nam", "Phuong", "Oanh", "Trang"};
        System.out.print("Enter a name to find: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                isExist = true;
                System.out.printf("Student name '%s' at position %d", name, i);
                break;
            }
        }
        if (!isExist) {
            System.out.printf("Not found student name %s!", name);
        }
    }
}
