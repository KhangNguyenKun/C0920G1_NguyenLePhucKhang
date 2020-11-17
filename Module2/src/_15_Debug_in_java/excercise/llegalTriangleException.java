package _15_Debug_in_java.excercise;

public class llegalTriangleException extends Exception {
    public llegalTriangleException(String message) {
        super(message);
    }
    public llegalTriangleException(String message,String message1) {
        super(message + message1);
    }
}
