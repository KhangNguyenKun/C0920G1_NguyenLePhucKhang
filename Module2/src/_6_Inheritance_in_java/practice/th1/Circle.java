package _6_Inheritance_in_java.practice.th1;


//Lớp Circle
//        Có thêm thuộc tính radius (double).
//
//        Có ba phương thức khởi tạo. Phương thức khởi tạo mà không cần đối số đầu vào sẽ đặt giá trị mặc định cho radius là 1.0.
//
//        Có các getter và setter cho cả ba phương thức.
//
//        Có phương thức getArea và getPerimeter trả về diện tích và chu vi của hình.
//
//        Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu "A Circle with radius=xxx, which is a subclass of yyy".
//        Trong đó yyy là kết quả thực thi từ phương thức toString của lớp Shape.
public class Circle extends Shape {
    private double radius = 1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius =radius;
    }
    public Circle(double radius, boolean filled , String color){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius" + radius + super.toString();
    }
}
