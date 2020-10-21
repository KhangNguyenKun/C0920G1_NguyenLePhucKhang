package _1_introducion_to_java.practice.Bt1;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        System.out.println("Enter your name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name + "Hello");
    }
}
