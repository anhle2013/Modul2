package loop_in_java.print;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice= -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Drawn the rectangle");
            System.out.println("Drawn some triangles");
            System.out.println("2. Right angle at botton-left");
            System.out.println("3. Right angle at top-left");
            System.out.println("4. Right angle at botton-right");
            System.out.println("5. Right angle at top-right");
            System.out.println("6. Drawn isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Drawn the rectangle:");
                    // rectangle
                    for (int i=0; i< 2; i++) {
                        for (int j=0; j<5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Drawn right triangle with right angle at botton-left");
                    for (int i=0; i< 5; i++) {
                        for (int j=0; j<=i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Drawn right triangle with right angle at top-left");
                    for (int i=0; i< 5; i++) {
                        for (int j=5; i<j; j--) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Drawn right triangle with right angle at botton-right");
                    for (int i=0; i< 5; i++) {
                        for (int k=4; k>i; k--) {
                            System.out.print("  ");
                        }
                        for (int j=0; j<=i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.out.println("Drawn right triangle with right angle at top-right");
                    for (int i=0; i< 5; i++) {
                        for (int k=0; k<i; k++) {
                            System.out.print("  ");
                        }
                        for (int j=5; i<j; j--) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 6:
                    System.out.println("Drawn isosceles triangle");
                    for (int i=0; i< 5; i++) {
                        for (int k=4; k>i; k--) {
                            System.out.print("  ");
                        }
                        for (int j=0; j<=2*i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
