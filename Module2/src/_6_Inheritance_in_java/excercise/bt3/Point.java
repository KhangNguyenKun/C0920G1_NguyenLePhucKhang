package _6_Inheritance_in_java.excercise.bt3;

import java.util.Arrays;

public class Point {
    private float x =1 ;
    private float y= 2 ;
    public Point(){
//this.x = 1;
//this.y= 2;

    }
    public Point(float x , float y){
        this.x =x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x= x;
        this.y =y;
    }

    public float[] getXY(){
        float[] arr = {x,y};
        return arr;
    }
    public String toString(){
        return "Point : " + Arrays.toString(getXY());
    }
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());
    }
}
