package _7_Abstract_class_and_Interface_in_java.excercise.bt1;

import _6_Inheritance_in_java.practice.th1.Circle;
import _6_Inheritance_in_java.practice.th1.Rectangle;
import _6_Inheritance_in_java.practice.th1.Shape;
import _6_Inheritance_in_java.practice.th1.Square;

import java.util.Arrays;
//kiem tra thu
public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(2,3);
        shapes[2] = new Square(3);
        for (Shape shape : shapes){
            shape.resize(100);
        }
        System.out.println(Arrays.toString(shapes));
    }
}
