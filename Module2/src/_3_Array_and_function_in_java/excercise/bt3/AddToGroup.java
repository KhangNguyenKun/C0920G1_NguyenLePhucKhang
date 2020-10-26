package _3_Array_and_function_in_java.excercise.bt3;

import java.util.Arrays;
import java.util.Scanner;

//
//Bước 1: Tạo 2 mảng số với kích thước cho trước
//
//        Bước 2: Sử dụng vòng lặp nhập giá trị cho các phần tử trong mảng
//
//        Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
//
//        Bước 4: Sử dụng vòng lặp để duyệt các phần tử trong mảng 1. Lấy từng phần tử trong mảng 1 gán vào
//        từng phần tử trong mảng thứ 3, tính từ phần tử đầu tiên.
//
//        Bước 5: Sử dụng vòng lặp để duyệt các phần tử trong mảng 2. Lấy từng phần tử trong mảng 2 gán vào
//        phần tử tiếp theo của mảng 3, tính từ phần tử array3[array2.length]
public class AddToGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = 0;
        int size2 = 0;

        System.out.println("Enter size of array 1 :");
        size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter elements of array 1 :");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter size of array 2 : ");
        size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter elements of array 2 :");
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[size1 + size2];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
                arr3[arr1.length+i] = arr2[i];
//            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
