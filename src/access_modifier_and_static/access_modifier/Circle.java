package access_modifier_and_static.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){

    }
    Circle(double r) {
        this.radius = r;
    }
    double getRadius() {
        return this.radius;
    }
    double getArera() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
