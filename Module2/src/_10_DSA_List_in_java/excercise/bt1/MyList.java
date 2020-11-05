package _10_DSA_List_in_java.excercise.bt1;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else
            throw new IllegalArgumentException("Capacity is wrong ");
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(2);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IndexOutOfBoundsException("index" + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i++) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }

    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else
            throw new IndexOutOfBoundsException("Not true Capacity");
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }


//public class MyList {
////    private static final Object E = 0;
//    private int size =0;
//    private static final int DEFAULT_CAPACITY=10;
//    private Object elements[];
//    public MyList(){
//        elements = new Object[DEFAULT_CAPACITY];
//    }
//    public MyList(int capacity){
//
//    }
//    private void ensureCapacity(){
//        int newSize = elements.length*2;
//        elements = Arrays.copyOf(elements,newSize);
//    }
//    public  void  add(E e){
//        if (size == elements.length) {
//            ensureCapacity();
//        }
//        elements[size++] = e;
//    }
//    public void remove(int index){
//        for (int i=0 ;  i<elements.length ; i++){
//            elements[i]= elements[i+1];
//        }
//    }
//    public  int size(){
//        return size;
//    }
//    public Object clone(){
//        return clone();
//    }
//    public boolean contains(E o){
//        return true;
//    }
//    public int indexOf(){
//        return indexOf();
//
//    }
//    public boolean add(){
//        return add();
//    }
//
//    public E get(int i) {
//        if (i>= size || i <0) {
//            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
//        }
//        return (E) elements[i];
//    }

}
