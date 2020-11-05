package _11_DSA_stack_queue_in_java.excercise.bt2;

import _11_DSA_stack_queue_in_java.practice.th2.MyLinkedListQueue;

public class Solution {
    public int capacity;
    public int[] queueArr;
    public int head;
    public int tail;
    public int currentSize;

    public Solution(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize== 0){
            status = true;
        }
        return status;
    }
    public void enqueue(int item) {
        if (isQueueFull()){
            System.out.println("Overflow!! : " + item);
        }
        else {
            tail++;
            if (tail == capacity -1){
                tail =0 ;
            }
            queueArr[tail] = item ;
            currentSize++;
            System.out.println("element " + item +" is pushed");
        }
    }
    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Underflow :");
        }
        else {
            head ++;
            if (head == capacity -1){
                System.out.println("Pop operation done : " + queueArr[head-1]);
                head =0;
            }
            else {
                System.out.println("Pop operation done : " + queueArr[head-1]);
            }
            currentSize--;
        }

    }
    public static void main(String[] args) {
        _11_DSA_stack_queue_in_java.practice.th3.MyQueue queue = new _11_DSA_stack_queue_in_java.practice.th3.MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}

