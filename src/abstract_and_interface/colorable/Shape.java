package abstract_and_interface.colorable;

public class Shape {
    private String color = "green";
    private Boolean filled = true;
    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Boolean getFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "A Shape with color of " + color + " and "
                + (filled? "filled" : "not filled");
    }

}
