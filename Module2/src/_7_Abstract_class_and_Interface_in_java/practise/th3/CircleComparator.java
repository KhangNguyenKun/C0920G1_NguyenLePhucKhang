package _7_Abstract_class_and_Interface_in_java.practise.th3;

import _6_Inheritance_in_java.practice.th1.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2){
        if (c1.getRadius() > c2.getRadius()) return -1;
        else if (c1.getRadius() < c2.getRadius()) return 1;
        else return 0;
    }
}
