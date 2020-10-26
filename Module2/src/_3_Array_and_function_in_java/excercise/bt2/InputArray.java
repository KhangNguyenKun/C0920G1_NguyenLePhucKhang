package _3_Array_and_function_in_java.excercise.bt2;

import java.util.Arrays;
import java.util.Scanner;

//Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
//
//        Bước 2: Nhập X là số cần chèn
//
//        Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
//
//        Bước 4: Nếu index <= 1 và index >= array.length – 1 thì hiển thị không chèn được phần tử vào mảng.
//
//        Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
//
//        Bước 6: In ra mảng
public class InputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your size :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i =0; i< arr.length ; i++){
            System.out.println("Enter elements :");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Input x :");
        int x = scanner.nextInt();
        System.out.println("Where do you want to input ??");
        int index = scanner.nextInt();
        if (index<=1 || index >= arr.length-1){
            System.out.println("Wrong index");
        }

        for (int j =1 ; j <arr.length -1 ; j++){
            if (index == j){
                arr[j]=x;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
