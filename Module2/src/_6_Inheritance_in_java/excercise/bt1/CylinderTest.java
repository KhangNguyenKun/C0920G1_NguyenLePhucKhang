package _6_Inheritance_in_java.excercise.bt1;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
       cylinder = new Cylinder(10.0,"green", 20.0);
        System.out.println(cylinder);
    }
}
