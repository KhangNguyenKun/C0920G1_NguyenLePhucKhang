package _14_Sort_Argorithm_in_java.excercise.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] list){
        for (int i =1; i<list.length; i++){
            for (int j = i-1; j>=0; j-- ){
                if (list[j]> list[j+1]){
                    int temp = list[j];
                    list[j]= list[j+1];
                    list[j+1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size :");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i =0 ; i<size; i++){
            System.out.println("Enter each element :");
            list[i] = scanner.nextInt();
        }
        insertionSort(list);
    }
}
