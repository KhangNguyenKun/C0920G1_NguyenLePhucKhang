package _4_Class_and_Object_in_java.excercise.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double getRoot1() {
        return  (-b + Math.sqrt(getDiscriminant())) / 2 * a;
    }

    public double getRoot2() {
        return  (-b - Math.sqrt(getDiscriminant())) / 2 * a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a :");
        QuadraticEquation quad = new QuadraticEquation();
        quad= new QuadraticEquation();
        quad.setA(input.nextDouble());
        System.out.println("Enter b : ");
        quad.setB(input.nextDouble());
        System.out.println("Enter c : ");
        quad.setC(input.nextDouble());
        System.out.println("Result :"+ quad.getRoot1() + " and " +  quad.getRoot2());
    }

}
