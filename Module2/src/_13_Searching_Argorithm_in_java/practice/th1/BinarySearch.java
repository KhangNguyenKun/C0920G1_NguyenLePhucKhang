package _13_Searching_Argorithm_in_java.practice.th1;

public class BinarySearch {
    static int[] list ={2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int BinarySearch(int[] list, int key){
        int high = list.length -1;
        int low = 0;
        while (high >= low){
            int mid = (high + low)/2;
            if (key < list[mid]){
                high = mid -1;
            }
            else if (key == list[mid]){
                return mid;
            }
            else
                low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(BinarySearch(list,2));
        System.out.println(BinarySearch(list,4));
        System.out.println(BinarySearch(list,10));
        System.out.println(BinarySearch(list,100));
        System.out.println(BinarySearch(list,31));
    }
}
