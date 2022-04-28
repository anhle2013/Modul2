package abstract_and_interface.resizeable;

public class Test {
    public static void main(String[] args) {
        Resizeable[] resizeables = {
                new Circle(2,"blue",false),
                new Rectangle(1,2),
                new Square(2.2,"yellow",false)};

        System.out.println("Pre-resize:");
        for (Resizeable resizeable: resizeables)
            System.out.println(resizeable);

        System.out.println("After-resize:");
        for (Resizeable resizeable: resizeables) {
            double percent = Math.random() * 99 + 1;
            resizeable.resize(percent);
            System.out.println(resizeable);
        }
    }
}
