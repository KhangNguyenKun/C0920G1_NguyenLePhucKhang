package _3_Array_and_function_in_java.practise.th5;

public class MinValue {
    public  static  int minValue(int[] array){
        int min = array[0];
        for (int i=1 ; i < array.length; i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array ={4,2,3,4,5,6,1};
        System.out.println(minValue(array));
    }
}
