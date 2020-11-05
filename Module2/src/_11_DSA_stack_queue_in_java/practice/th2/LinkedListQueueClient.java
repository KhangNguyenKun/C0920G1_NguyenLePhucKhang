package _11_DSA_stack_queue_in_java.practice.th2;

public class LinkedListQueueClient {
    public static void main(String[] args) {
//        new MyLinkedListQueue();
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
