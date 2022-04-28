package abstract_and_interface.resizeable;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius +
                ", which is a sub class of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent/100);
    }
}
