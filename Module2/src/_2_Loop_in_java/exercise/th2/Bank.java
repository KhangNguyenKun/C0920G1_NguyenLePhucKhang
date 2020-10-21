package _2_Loop_in_java.exercise.th2;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner tienGui = new Scanner(System.in);
        System.out.println("Enter your money");
        float TienGui = tienGui.nextFloat();
        Scanner laisuat = new Scanner(System.in);
        System.out.println("Enter your discount");
        float Lai = laisuat.nextFloat();
        Scanner soThang = new Scanner(System.in);
        System.out.println("Enter your month");
        int thang = soThang.nextInt();
        float tienLai =(TienGui*Lai)/12*thang;
        System.out.println(tienLai);
    }
}