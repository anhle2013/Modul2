package inheritance.circle;

public class Cylinder extends Circle{
    double height;
    Cylinder() {

    }
    Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    double getVolume() {
        return super.getArea() * this.height;
    }

    public static void main(String[] args) {

    }
}
