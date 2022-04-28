package abstract_and_interface.resizeable;

import inheritance.shape.Rectangle;

public class Square extends Rectangle implements Resizeable{
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
    public void resize(double percent) {
        setSide(getSide() * (1 + percent/100));
    }
}
