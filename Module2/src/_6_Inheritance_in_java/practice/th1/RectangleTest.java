package _6_Inheritance_in_java.practice.th1;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
//        rectangle = new Rectangle(6.0, 7.0);
//        System.out.println(rectangle);
        rectangle = new Rectangle(5.0, 8.0, "blue" , false);
        System.out.println(rectangle);
    }
}
