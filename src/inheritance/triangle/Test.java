package inheritance.triangle;

public class Test {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setSide1(2.0);
        triangle.setSide2(3.0);
        triangle.setSide3(4.0);
        System.out.println("Perimeter = " + triangle.getPerimeter());
        System.out.println("Area = " + triangle.getArea());
        System.out.println(triangle);

    }
}
