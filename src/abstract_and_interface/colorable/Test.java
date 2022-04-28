package abstract_and_interface.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(1.6),
                new Rectangle(2,3,"black",true),
                new Rectangle(),
                new Square(3.3),
                new Square(1.5,"pink",false)
        };

        for (Shape shape: shapes) {
            if (shape instanceof Square) {
                System.out.println(shape);
                ((Square) shape).howToColor();
            }
        }
    }
}
