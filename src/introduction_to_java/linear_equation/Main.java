package introduction_to_java.linear_equation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution");
            }
        } else {
            double x = -b / a;
            System.out.println("Equation pass with x = " + x);
        }
    }
}
