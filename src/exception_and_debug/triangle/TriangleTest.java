package exception_and_debug.triangle;

import java.util.Scanner;

public class TriangleTest {
//    public static void main(String[] args) throws IllegalTriangleException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter 3 numbers: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        if (a <= 0 || b <= 0 || c <= 0 ||
//                a + b <= c || a + c <= b || b + c <= a)
//            throw new IllegalTriangleException("Cann't creat triangle from 3 sides: " +
//                    a + ", " + b + " and " + c);
//        else System.out.println(a + ", " + b + " and " + c + " cant creat a triangle");
//
//    }
public static void main(String [] args) {
    try         {
        badMethod();
        System.out.print("A");
    }  catch (Exception ex)  {
        System.out.print("B");
    } finally {
        System.out.print("C");
    }
    System.out.print("D");
}
    public static void badMethod(){
        throw new Error();
    }

}
