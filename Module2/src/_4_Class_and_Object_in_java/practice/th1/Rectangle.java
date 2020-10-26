package _4_Class_and_Object_in_java.practice.th1;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
//        Bước 1: Tạo lớp Rectangle, khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (contructors).
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    //    Bước 2: Định nghĩa các phương thức getArea(), getPerimeter(), display()
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle : =" + width + height;
    }


    //    Bước 3: Tạo class chứa phương thức main để thực thi chương trình

    public static void main(String[] args) {
//            Bước 4: Khai báo các biến lưu kích thước hình chữ nhật và gán giá trị
        Scanner input = new Scanner(System.in);
        System.out.println("enter width :");
        double width = input.nextDouble();
        double height = input.nextDouble();
//            Bước 5: Khởi tạo một đối tượng thuộc lớp Rectangle với phương thức khởi tạo chứa 2 tham số width, height
        Rectangle rectangle = new Rectangle(width, height);
//            Bước 6: Gọi các phương thức của lớp Rectangle thông qua đối tượng rectangle đã tạo để hiển thị các thông số của hình chữ nhật
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.display());
    }
}
