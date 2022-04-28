package class_and_object.quadratic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.printf("Quadratic Equation:\n %d x2 + %d x + %d = 0\n",a,b,c);
        System.out.println(quadraticEquation.solveQuadratic());
    }
}
