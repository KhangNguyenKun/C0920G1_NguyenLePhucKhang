package _15_Debug_in_java.excercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void checkTriangle(float a, float b , float c){
        if (a  <=0 || b<= 0 || c <= 0){
            System.out.println("Wrong format ");
        }
        else if (a+b <c || a+c<b || b+c<a){
            System.out.println("Wrong perimeter ");
        }
    }


    public static void main(String[] args) throws  IllegalTriangleException {
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
            } catch (InputMismatchException e) {
                System.out.println("Wrong format ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            check = true;
        }
        while (check);
    }

}
