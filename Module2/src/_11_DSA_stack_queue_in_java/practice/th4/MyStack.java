package _11_DSA_stack_queue_in_java.practice.th4;

public class MyStack {
    public int[] arr;
    public int size;
    public int index;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is overflow ");
        }
        arr[index] = element;
        index++;
    }
    public int pop(){
        if (isEmpty()) {
            throw new StackOverflowError("Stack is empty ");
        }
        return arr[--index];
    }
    public boolean isFull(){
        if (index == size){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (index == 0){
            return true;
        }
        return false;
    }
}
