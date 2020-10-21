package _1_introducion_to_java.exercise.th4;
import java.util.Scanner;

public class phuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);
        double a,b,c ;
        System.out.println("a : ");
        a = pt.nextDouble();
        System.out.println("b :");
        b = pt.nextDouble();
        System.out.println("c :");
        c = pt.nextDouble();
        if (a != 0) {
            double kq = (c-b)/a;
            System.out.println(kq);
        }
        else if ( b== 0){
            System.out.println("result :" +c/a);
        }
        else if ( c== 0){
            System.out.println("result :" + (-b/a));
        }
        else System.out.println("Phuong trinh sai so a");
    }
}
