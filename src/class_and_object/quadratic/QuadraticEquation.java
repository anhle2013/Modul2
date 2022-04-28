package class_and_object.quadratic;

public class QuadraticEquation {
    int a, b, c;

    public QuadraticEquation() {
    }
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        return b * b - 4 * a * c;
    }
    public double getRoot1() {
        return (-b + Math.sqrt(this.getDelta())) / (2 * a);
    }
    public double getRoot2() {
        return (-b - Math.sqrt(this.getDelta())) / (2 * a);
    }

    public String solveQuadratic() {
        if (this.a == 0) {
            if (this.b == 0) {
                if (this.c == 0)
                    return "The equation has many roots";
                else return "The equation has no roots";
            } else return "The equation has 1 root: " + (- c/b);
        } else if (this.getDelta() < 0)
            return "The equation has no roots";
        else if (this.getDelta() == 0)
            return "The equation has 1 root: " + this.getRoot1();
        else return "The equation has 2 roots: " + this.getRoot1() + " and " + this.getRoot2();
    }
}
