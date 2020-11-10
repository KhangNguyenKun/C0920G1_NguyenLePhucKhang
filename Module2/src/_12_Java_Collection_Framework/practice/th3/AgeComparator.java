package _12_Java_Collection_Framework.practice.th3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2){
        if (o1.getAge() > o2.getAge()){
            return 1;
        }
        else if (o1.getAge() == o2.getAge()){
            return 2;
        }
        else {
            return 0;
        }
    }
}
