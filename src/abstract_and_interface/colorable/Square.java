package abstract_and_interface.colorable;

public class Square extends Rectangle implements Colorable {
    public Square() {
    }
    public Square(double side) {
        super(side,side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() +
                ", which is a sub class of " + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides is: " + getColor());
    }
}
