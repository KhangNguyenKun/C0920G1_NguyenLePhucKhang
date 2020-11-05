package _7_Abstract_class_and_Interface_in_java.practise.th2;

import _6_Inheritance_in_java.practice.th1.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public  ComparableCircle(){
    }
    public ComparableCircle(double radius){
        super(radius);
    }
    public  ComparableCircle (double radius  , boolean filled, String color){
        super(radius, filled , color);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
