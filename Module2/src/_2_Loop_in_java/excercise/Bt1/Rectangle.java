package _2_Loop_in_java.excercise.Bt1;

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
        switch (number) {
            case 1:
                System.out.println("Print rectangle");
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Print square triangle");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Print Print isosceles triangle");
                for (int i = 0; i < 6; i++) {
                    for (int j = 6; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
        }
    }
}
