package _do_an_giai_thuat.primativeNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    List<Integer> list = new ArrayList<>();
    public int enter(){
        Scanner scanner= new Scanner(System.in);
        boolean check = false;
        System.out.println("Enter your range of number:");
        int n = scanner. nextInt();

        int count=0;
        do {
            System.out.println("Enter each number " );
            int number = scanner.nextInt();
            list.add(number);
            count++;
        }
        while (count<n);
        return scanner.nextInt();
    }
    public void calculator(){
        for (int i=0; i<list.size(); i++){
            if (list.get(list.size()-1)==9){
                list[list.size()-1] == 0;
            }
            else if (list.get(list.size()-2)==9){
                list.get(list.size()-1)==0;
            }
        }

    }
}
