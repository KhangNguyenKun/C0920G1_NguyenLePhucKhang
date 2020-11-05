package _11_DSA_stack_queue_in_java.practice.th2;

public class MyLinkedListQueue {
    public static class Node {
        public int key;
        public Node next;

        public Node(int key, Node next) {
            this.key = key;
            this.next = next;
        }

        public Node(int key) {

        }
    }
    public Node head;
    public Node tail;

    public MyLinkedListQueue(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public MyLinkedListQueue() {
    }

    public void enqueue(int key){
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }

}
