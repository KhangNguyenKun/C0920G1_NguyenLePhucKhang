package _11_DSA_stack_queue_in_java.excercise.bt1;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0 ; i< array.length; i++){
            stack.push(array[i]);
        }
        for (int i = 0 ; i< array.length; i++){
             array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
