package inheritance.circle;

public class Circle {
    private double radius;
    private String color;
    public Circle() {
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
