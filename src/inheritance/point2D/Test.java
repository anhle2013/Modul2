package inheritance.point2D;

public class Test {

    public static void main(String[] args) {
        System.out.println("Test Point2D Class");
        Point2D point2D = new Point2D();
        point2D.setX(2.9f);
        point2D.setY(3.0f);
        System.out.println(point2D);

        System.out.println("Test Point3D Class");
        Point3D point3D = new Point3D();
        point3D.setXYZ(1.0f,2.0f,3.0f);
        System.out.println(point3D);
    }
}
