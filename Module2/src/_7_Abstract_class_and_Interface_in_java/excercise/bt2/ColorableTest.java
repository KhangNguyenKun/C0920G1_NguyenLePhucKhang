package _7_Abstract_class_and_Interface_in_java.excercise.bt2;

import _6_Inheritance_in_java.practice.th1.Circle;
import _6_Inheritance_in_java.practice.th1.Rectangle;
import _6_Inheritance_in_java.practice.th1.Shape;
import _6_Inheritance_in_java.practice.th1.Square;
public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(1, 3);
        shapes[1] = new Square(4);

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.print(shape.toString());
                shape.howToColor();
            } else {
                System.out.println(shape.toString());
            }
        }
    }
}

