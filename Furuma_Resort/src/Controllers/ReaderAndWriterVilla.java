package Controllers;

import Models.Villa.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriterVilla {

    List<Villa> villas = new ArrayList<>();
    String line = null;

    public List<Villa> readerVilla(Villa villa) {
        try {
            BufferedReader bufferedReaderVilla = new BufferedReader(new FileReader(new File("src/Data/Villa.csv")));
            bufferedReaderVilla.readLine();
            while ((line = bufferedReaderVilla.readLine()) != null) {
                String[] str = line.split(",");
                villa = new Villa(str[0], str[1], str[2], str[3], str[4], str[5], str[6], Float.parseFloat(str[7]), Integer.parseInt(str[8]));
                villas.add(villa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villas;
    }

    public void writerVilla(Villa villa) {
//        String servicesName, String areaUsers, String priceRent, String amount, String brand,
//                String roomStandard, String convenientDescribe, float pool, int floor
        try {
            BufferedWriter bufferedWriterVilla = new BufferedWriter(new FileWriter(new File("src/Data/Villa.csv")));
            bufferedWriterVilla.write(villa.getServicesName() + "," + villa.getAreaUsers() + "," + villa.getPriceRent() + "," +
                    villa.getAmount() + "," + villa.getBrand() + "," +villa.getRoomStandard()+"," + villa.getConvenientDescribe() +"," +villa.getPool()+ "," +
                    villa.getFloor()+ "\n");

            bufferedWriterVilla.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


