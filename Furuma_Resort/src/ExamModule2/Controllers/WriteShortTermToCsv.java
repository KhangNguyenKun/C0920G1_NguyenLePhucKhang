package ExamModule2.Controllers;

import ExamModule2.LongTermSavingMoney.LongSavingMoneyLimited;
import ExamModule2.ShortedSavingMoney.ShortedSavingMoneyLimited;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteShortTermToCsv {
    public void writeCsv(List<ShortedSavingMoneyLimited> list){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/ExamModule2/Data/shortTerm.csv"),false));
            String line = "";
            for (ShortedSavingMoneyLimited l: list){
                bufferedWriter.write(l.getIdBook()+"," +l.getIdCustomer()+"," +l.getDateOpenBook() +"," +l.getDateStart()
                        +"," +l.getTime() +"," +l.getMoney() +"," +l.getDiscount() );
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
