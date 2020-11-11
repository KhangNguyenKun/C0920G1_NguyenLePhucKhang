package _14_Sort_Argorithm_in_java.excercise.bt1;

import java.util.Arrays;

public class InsertSearching {
    public static void main(String[] args) {
        int[] array = {4,3,2,8,5,6,1};
        for (int i =1; i<array.length; i++){
            for (int j = i-1; j>=0; j-- ){
                if (array[j]> array[j+1]){
                     int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }

}
