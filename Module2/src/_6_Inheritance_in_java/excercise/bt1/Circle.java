package _6_Inheritance_in_java.excercise.bt1;

public class Circle {
    private double radius = 6.0;
    private String color = "red";
    public Circle(){

    }
    public  Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "radius  :" + radius + "Area :" +getArea();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(6.0, "blue");
    }
}
