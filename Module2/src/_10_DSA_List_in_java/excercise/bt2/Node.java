package _10_DSA_List_in_java.excercise.bt2;

public class Node {
    public Node next;
    public Object data;

    public Node(Node next, Object data) {
        this.next = next;
        this.data = data;
    }
    public Object getData() {
        return data;
    }
}
