package _1_introducion_to_java.practise.th6;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();
        if (number<2) {
            System.out.println("This is not a prime");
        }
        else {
            int i =2;
            boolean check = true;
            while (i<number/2){
                if (number%i == 0){
                    check =false;
                    break;
                }

                i++;
                }
            if (check){
                System.out.println("This is a prime");
            }
            else System.out.println("This is not a prime");
        }
    }
}
