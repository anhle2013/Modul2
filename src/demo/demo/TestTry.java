package demo.demo;

import java.util.Scanner;

public class TestTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key;
        System.out.print("Enter number: ");
        key = Integer.parseInt(scanner.next());
        System.out.println("number = " + key);
//        try {
//            System.out.print("Enter number: ");
//            key = Integer.parseInt(scanner.next());
//            System.out.println("number = " + key);
//        }
//        catch (Exception e) {
//            System.out.println("INPUT NUMBER ONLY");
//        }
        System.out.println("end!");
    }
}
