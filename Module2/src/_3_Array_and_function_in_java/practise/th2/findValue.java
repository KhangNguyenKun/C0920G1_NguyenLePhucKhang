package _3_Array_and_function_in_java.practise.th2;

import java.util.Scanner;

public class findValue {
    public static void main(String[] args) {
        String[] students ={"Bale" ,"Blake" , "Christian" , "Rice" ,"Water"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name'student :");
        String name = scanner.nextLine();
        boolean check = true ;
        for (int i =0 ; i <students.length; i++){
            if (students[i].equals(name)){
                check = true ;
                System.out.println("Position is :" +i);
                break;
            }
//            else
//                System.out.println("wrong name");
        }
        if (!check) {
            System.out.println("wrong ");
        }
    }
}
