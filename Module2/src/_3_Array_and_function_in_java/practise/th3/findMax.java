package _3_Array_and_function_in_java.practise.th3;

import java.util.Scanner;

//Bước 1: Khai báo các biến, nhập và kiểm tra kích thước mảng
public class findMax {
    public static void main(String[] args) {
        int size ;
        int[] array ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size :");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size>20);
//        Bước 2: Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter element next :");
            array[i] =scanner.nextInt();
            i++;
        }
//        Bước 3: In ra danh sách tài sản đã nhập
        System.out.println("List:");
        for (int j = 0 ; j <array.length; j++){
            System.out.println(array[j]);
        }
//        Bước 4: Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int index=1;
        for (int j =0 ; j < array.length; j++){
            if (array[j]>max){
                max = array[j];
                index =j +1;
            }
        }
        System.out.println(max + index);
    }
}
