package _1_introducion_to_java.excercise.Bt2;

import java.util.Scanner;

//Bước 1: Tạo dự án mới và khai báo hàm main()
//
//        Bước 2: Khai báo biến tỉ giá (rate) để lưu giá trị tỉ giá giữa VND và USD. Hiện nay, tỉ giá có thể là 23000 VND/USD.
//
//        Bước 3: Khai báo biến giá trị USD và cho người dùng nhập vào.
//
//        Bước 4: Tính giá trị VND và hiển thị ra màn hình.
public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Enter your dollar money");
        float money = sc.nextFloat();
        float vnDong = money * rate ;
        System.out.println("Convert your money to VND :" + vnDong);
    }
}
