package ExamModule2.Controllers;

import ExamModule2.LongTermSavingMoney.LongSavingMoneyLimited;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
//
//String idBook, String idCustomer, String dateOpenBook, String dateStart,
//        String time, String money, String discount, String convenient
public class WriteLongTermToCsv {
    public void writeCsv(List<LongSavingMoneyLimited> list){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/ExamModule2/Data/longTerm.csv"),false));
            String line = "";
            for (LongSavingMoneyLimited l: list){
                bufferedWriter.write(l.getIdBook()+"," +l.getIdCustomer()+"," +l.getDateOpenBook() +"," +l.getDateStart()
                        +"," +l.getTime() +"," +l.getMoney() +"," +l.getDiscount() +"," +l.getConvenient());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
