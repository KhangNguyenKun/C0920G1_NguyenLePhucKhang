package Controllers;

import Models.Villa.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriterVilla {
    String line = null;
    public List<Villa> readerVilla() {
        List<Villa> villas = new ArrayList<>();
        try {
            BufferedReader bufferedReaderVilla = new BufferedReader(new FileReader(new File("src/Data/Villa.csv")));
            while ((line = bufferedReaderVilla.readLine()) != null) {
                String[] str = line.split(",");
                Villa villa = new Villa(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7], str[8] ,str[9]);
                villas.add(villa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villas;
    }
    public void writerVilla(Villa villa) {
        try {
            BufferedWriter bufferedWriterVilla = new BufferedWriter(new FileWriter(new File("src/Data/Villa.csv"),true));
            bufferedWriterVilla.write(villa.getId()+ ","+ villa.getServicesName() + "," + villa.getAreaUsers() + "," + villa.getPriceRent() + "," +
                    villa.getAmount() + "," + villa.getBrand() + "," +villa.getRoomStandard()+"," + villa.getConvenientDescribe() +"," +villa.getPool()+ "," +
                    villa.getFloor()+ "\n");

            bufferedWriterVilla.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


