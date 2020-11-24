package Controllers;

import Models.House.House;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriterHouse {
//    String servicesName, String areaUsers, String priceRent, String amount, String brand,
//    String roomStandard, String convenientDescribe, float pool

    List<House> houses =new ArrayList<>();
    String line = null;
    public List<House> readerHouse(){
        try {
            House house;
            BufferedReader bufferedReaderHouse = new BufferedReader(new FileReader(new File("src/Data/House.csv")));
            while ((line = bufferedReaderHouse.readLine())!=null){
                String[] str = line.split(",");
                house = new House(str[0],str[1], str[2], str[3], str[4], str[5], str[6], str[7] , str[8]);
                houses.add(house);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houses;
    }
    public void writerHouse(House house){
        try {
            BufferedWriter bufferedWriterHouse = new BufferedWriter(new FileWriter(new File("src/Data/House.csv"),true));
            bufferedWriterHouse.write(house.getServicesName()+"," + house.getAreaUsers()+ house.getPriceRent()+","
            +house.getAmount() +"," + house.getBrand() +"," + house.getRoomStandard() +"," + house.getConvenientDescribe() +","
            + house.getPool());
            bufferedWriterHouse.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
