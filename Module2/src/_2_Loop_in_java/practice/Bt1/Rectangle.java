package _2_Loop_in_java.practice.Bt1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        System.out.println("Print rectangle");
        System.out.println("Print square triangle");
        System.out.println("Print Print isosceles triangle");
        System.out.println("Exit");
        int number = sc.nextInt();
        switch (number){
            case 1:
                System.out.println("Print rectangle");
                System.out.println("*******");
                System.out.println("*******");
                System.out.println("*******");
            case 2:
                System.out.println("Print square triangle");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");
            case 3:
                System.out.println("Print Print isosceles triangle");
                
        }
    }
}
