package inheritance.point;

public class Test {

    public static void main(String[] args) {
        System.out.println("Test Point Class");
        Point point = new Point();
        point.setX(2.2f);
        point.setY(3.3f);
        System.out.println(point.getXY()[0]);
        System.out.println(point);

        System.out.println("Test MovablePoint Class");
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setX(4.0f);
        movablePoint.setXSpeed(1.0f);
        movablePoint.setYSpeed(2.0f);
        System.out.println(movablePoint.getSpeed()[1]);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
