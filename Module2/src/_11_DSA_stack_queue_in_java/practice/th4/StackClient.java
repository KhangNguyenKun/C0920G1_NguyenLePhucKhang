package _11_DSA_stack_queue_in_java.practice.th4;

import _10_DSA_List_in_java.practise.th2.MyLinkedList;

public class StackClient {
    public static void main(String[] as) throws Exception {
        MyStack stack = new MyStack(4);
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        System.out.println("Size is : " +stack.size);
        System.out.println("2. Pop elements from stack : ");
        System.out.println( stack.pop());
        System.out.println( stack.pop());
    }
}
