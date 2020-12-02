package ExamModule2.Function;

import ExamModule2.LongTermSavingMoney.LongSavingMoneyLimited;
import ExamModule2.ShortedSavingMoney.ShortedSavingMoneyLimited;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteShortTermBook {
    List<ExamModule2.ShortedSavingMoney.ShortedSavingMoneyLimited> shortedSavingMoneyLimited = new ArrayList<>();
    public List<ExamModule2.ShortedSavingMoney.ShortedSavingMoneyLimited> listAfterDelete(){
       ReaderWriterShortTerm  readerWriterShortTerm = new ReaderWriterShortTerm();
        shortedSavingMoneyLimited = readerWriterShortTerm.readerList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your id and we don't want to delete it but we will :((");
        String idDelete = scanner.nextLine();
        for (ShortedSavingMoneyLimited c: shortedSavingMoneyLimited){
            if (c.getIdCustomer().equalsIgnoreCase(idDelete)){
                System.out.println(c.getIdCustomer());
                shortedSavingMoneyLimited.remove(c);
                break;
            }
        }
        return shortedSavingMoneyLimited;
    }
}
