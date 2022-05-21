package exception_and_debug.triangle;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(String erroMessage) {
        super(erroMessage);
    }
}
