package _15_Debug_in_java.excercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException1 extends Throwable {
    public static void checkTriangle(float a, float b , float c) throws llegalTriangleException {
        if (a  <=0 || b<= 0 || c <= 0){
            System.out.println("Wrong format ");
        }
        else if (a+b <c || a+c<b || b+c<a){
            throw new llegalTriangleException(" a + b < c");
        }
    }


    public static void main(String[] args) throws IllegalTriangleException1 {
        boolean check = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input a :");
                float a = (float) scanner.nextDouble();
                System.out.println("Input b : ");
                float b = (float) scanner.nextDouble();
                System.out.println("Input c : ");
                float c = (float) scanner.nextDouble();
                checkTriangle(a, b, c);
            } catch (llegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            check = true;
        }
        while (check);
    }

}
