package _6_Inheritance_in_java.excercise.bt2;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float x , float y , float z ){
        super(x,y);
        this.z =z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public  void  setXYZ( float z){
        this.z =z;
    }

    public float[] getXYZ(){
        float[] arr1 ={super.getX(),super.getY(),z};
        return  arr1;
    }
    @Override
    public String toString(){
        return Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Point3D point3D= new Point3D(1,2,3);
        System.out.println(point3D);
    }
}
