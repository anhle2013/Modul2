package class_and_object.rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        Ractangle rectangle = new Ractangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of this rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of this rectangle: " + rectangle.getArea());
    }
}
