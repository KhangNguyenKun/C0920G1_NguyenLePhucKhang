package ExamModule2.Function;

import ExamModule2.LongTermSavingMoney.LongSavingMoneyLimited;
import ExamModule2.ShortedSavingMoney.ShortedSavingMoneyLimited;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriterShortTerm {
    List<ShortedSavingMoneyLimited> shortedSavingMoneyLimitedList = new ArrayList<ShortedSavingMoneyLimited>();
    String line = null;

    public List<ShortedSavingMoneyLimited> readerList() {
        try {
            ShortedSavingMoneyLimited shortedSavingMoneyLimited;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/ExamModule2/Data/shortTerm.csv")));
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                shortedSavingMoneyLimited = new ShortedSavingMoneyLimited(str[0], str[1], str[2], str[3], str[4], str[5], str[6]);
                shortedSavingMoneyLimitedList.add(shortedSavingMoneyLimited);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return shortedSavingMoneyLimitedList;
    }
    public void writerShortTerm(LongSavingMoneyLimited shortedSavingMoneyLimited) {
//        String idBook, String idCustomer, String dateOpenBook, String dateStart, String time, String money, String discount
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/ExamModule2/Data/longTerm.csv"),true));
            bufferedWriter.write(shortedSavingMoneyLimited.getIdBook()+ ","+ shortedSavingMoneyLimited.getIdCustomer() + "," + shortedSavingMoneyLimited.getDateOpenBook()  + "," +
                    shortedSavingMoneyLimited.getDateStart() + "," + shortedSavingMoneyLimited.getTime() + "," +shortedSavingMoneyLimited.getMoney()+"," +
                    shortedSavingMoneyLimited.getDiscount() +","+ "\n");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
