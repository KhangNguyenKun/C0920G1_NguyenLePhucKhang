package _1_introducion_to_java.practise.th7;

import java.util.Scanner;

public class Kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year??");
        int year = sc.nextInt();
//       if (year %100 ==0){
//           if (year %400 ==0){
//               System.out.println("so nguyen to");
//           }
//           if (year %4 == 0){
//               System.out.println("so nguyen to");
//           }
//           if (year %400 != 0){
//               System.out.println("day khong phai la so nguyen to");
//           }
//       }
//        if (year%100 ==0 && year%400 ==0){
//            System.out.println("so nguyen to");
//        }
//        if (year%100 ==0 && year%4==0){
//            System.out.println("So nguyen to");
//        }
//        if (year%100 ==0 && year%400 !=0){
//            System.out.println("Khong phai");
//        }
        if (year%4 ==0){
            if (year%100 == 0){
                if (year%400 == 0){
                    System.out.println("leap year");
                }
                else System.out.println("is not a leap year");
            }
            else System.out.println("is not a leap year");
        }
        else System.out.println("is not a leap year");
    }
}
