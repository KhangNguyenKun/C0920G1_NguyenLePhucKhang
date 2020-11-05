package _6_Inheritance_in_java.practice.th1;

public class Rectangle extends Shape {
    private double width = 4.0;
    private double length = 6.0;
    public Rectangle(){

    }
    public Rectangle (double width, double length , String color , boolean filled ){
        super(color = "blue", filled = false);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double side, double side1) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }
    @Override
    public String toString(){
        return "A Circle with width  "+width +" length" +length +super.toString();
    }
}
