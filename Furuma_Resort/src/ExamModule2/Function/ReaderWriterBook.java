package ExamModule2.Function;

import ExamModule2.LongTermSavingMoney.LongSavingMoneyLimited;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriterBook {
    //    String idBook, String idCustomer, String dateOpenBook, String dateStart,
//    String time, String money, String discount, String convenient
    List<LongSavingMoneyLimited> longTermSavingMoneyList = new ArrayList<>();
    String line = null;

    public List<LongSavingMoneyLimited> readerList() {
        try {
            LongSavingMoneyLimited longTermSavingMoney;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/ExamModule2/Data/longTerm.csv")));
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                longTermSavingMoney = new LongSavingMoneyLimited(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7]);
                longTermSavingMoneyList.add(longTermSavingMoney);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return longTermSavingMoneyList;
    }
    public void writerLongTerm(LongSavingMoneyLimited longTermSavingMoney) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/ExamModule2/Data/longTerm.csv"),true));
            bufferedWriter.write(longTermSavingMoney.getIdBook()+ ","+ longTermSavingMoney.getIdCustomer() + "," + longTermSavingMoney.getDateOpenBook()  + "," +
                    longTermSavingMoney.getDateStart() + "," + longTermSavingMoney.getTime() + "," +longTermSavingMoney.getMoney()+"," + longTermSavingMoney.getDiscount() +","
                    +longTermSavingMoney.getConvenient()+  "\n");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
