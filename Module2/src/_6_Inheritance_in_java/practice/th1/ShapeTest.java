package _6_Inheritance_in_java.practice.th1;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape =new Shape();
        System.out.println(shape);
        shape = new Shape("red",true);
        System.out.println(shape);
    }
}
