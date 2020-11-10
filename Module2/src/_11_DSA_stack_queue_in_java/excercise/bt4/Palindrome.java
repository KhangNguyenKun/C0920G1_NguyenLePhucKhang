package _11_DSA_stack_queue_in_java.excercise.bt4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public boolean isString(String str) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            queue.add(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if (stack.pop() == queue.remove()) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isString("1 2 3 4 3 2 1"));

    }
}
