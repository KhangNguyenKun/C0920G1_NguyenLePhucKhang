package _6_Inheritance_in_java.practice.th1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.println(circle);
        circle = new Circle(4.0);
        System.out.println(circle);
        circle = new Circle(3.0, true, "red") ;
        System.out.println(circle);
    }
}
