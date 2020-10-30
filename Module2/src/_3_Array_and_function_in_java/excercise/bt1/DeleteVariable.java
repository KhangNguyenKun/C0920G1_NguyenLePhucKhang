package _3_Array_and_function_in_java.excercise.bt1;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
//
//        Bước 2: Nhập X là phần tử cần xoá
//
//        Bước 3: Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X. Giả sử vị trí này là: index_del
//
//        Bước 4: Thực hiện xoá phần tử X khỏi mảng
//
//        Duyệt mảng từ vị trí cần xoá (index_del) đến cuối mảng (array.length-1)
//
//        -       Gán phần tử ở vị trí index cho phần tử ở vị trí index + 1
//
//        Bước 5:  Kết thúc duyệt mảng. In ra mảng.
public class DeleteVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your size of array ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int num;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements :");
            num = input.nextInt();
            arr[i] = num;
        }
        System.out.println("Enter the element you want to delete :");
        int x = input.nextInt();
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("Index of x :" + i);
                index = i;
                break;
            }
        }
        for (int j= index ; j < arr.length-1;j++){
            arr[j] = arr[j+1];
        }
        System.out.println(Arrays.toString(arr));

    }


//    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Enter size of array :");
//        int [] array = new int[scanner.nextInt()];
//        for (int i=0 ; i < array.length ; i++){
//            System.out.println("Enter element :");
//            array[i] = scanner.nextInt();
//        }
//        System.out.println("Enter element which you need to delete : ");
//        int x = scanner.nextInt();
//        int index_del =0;
//        for (int j =0 ; j< array.length ; j++){
//            if (x == array[j]){
//                index_del = j;
//            }
//        }
//        for (int i = index_del; i <array.length -1; i++){
//            array[i] = array[i +1];
//        }
//        array[array.length-1]=0;
//        System.out.println(Arrays.toString(array));
//    }
}
