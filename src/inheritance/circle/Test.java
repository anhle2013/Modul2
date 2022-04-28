package inheritance.circle;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test Circle Class");
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());

        circle = new Circle(3.5, "yellow");
        System.out.println(circle.getArea());

        circle.setColor("gray");
        circle.setRadius(2.2);
        System.out.println(circle.getPerimeter());

        System.out.println("Test Cylinder Class");
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(2.2);
        cylinder.setRadius(2.0);
        cylinder.setColor("Red");
        System.out.println(cylinder.getVolume());

        Cylinder cylinder1 = new Cylinder(1,2,"pink");
        System.out.println(cylinder1.getHeight());
    }
}
