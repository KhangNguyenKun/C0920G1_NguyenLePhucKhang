package ExamModule2.Function;

import ExamModule2.LongTermSavingMoney.LongSavingMoneyLimited;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteLongTermBook {
    List<LongSavingMoneyLimited> longTermSavingMoneyList = new ArrayList<>();
    public List<LongSavingMoneyLimited> listAfterDelete(){
        ReaderWriterBook readerAndWriterBooking = new ReaderWriterBook();
        longTermSavingMoneyList = readerAndWriterBooking.readerList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your id and we don't want to delete it but we will :((");
        String idDelete = scanner.nextLine();
        for (LongSavingMoneyLimited c: longTermSavingMoneyList){
            if (c.getIdCustomer().equalsIgnoreCase(idDelete)){
                System.out.println(c.getIdCustomer());
                longTermSavingMoneyList.remove(c);
                break;
            }
        }
        return longTermSavingMoneyList;
    }
}
