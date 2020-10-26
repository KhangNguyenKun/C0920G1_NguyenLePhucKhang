package _3_Array_and_function_in_java.excercise.bt5;

import java.util.Scanner;

//Bước 1: Khai báo mảng số nguyên với SIZE phần tử
//
//        Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
//
//        Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
//
//        Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mang
//
//        So sánh lần lượt các phần tử tiếp theo với giá trị nhỏ nhất.
//
//        Nếu phần tử tiếp theo nhỏ hơn giá trị nhỏ nhất thì gán giá trị nhỏ nhất là phần tử tiếp theo.
//
//        Bước 5: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất.
public class FindMinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size = input.nextInt();
        int[] array = new int[size];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter each element in array :");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
           if (array[i]<min){
               min = array[i];
           }
        }
        System.out.println(min);
    }
}
