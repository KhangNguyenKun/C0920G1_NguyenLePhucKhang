package _11_DSA_stack_queue_in_java.practice.th1;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    LinkedList<T> stack = new LinkedList<>();

    public MyGenericStack() {

    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    private static void stackOfIString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("A");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        System.out.println(stack.size());
        while (!stack.isEmpty()) {
            System.out.println("elements :" + stack.pop());
        }
    }

    public static class GenericStackClient {
        public static void main(String[] args) {
            System.out.println("Stack of String :");
            stackOfIString();
        }

    }
}
