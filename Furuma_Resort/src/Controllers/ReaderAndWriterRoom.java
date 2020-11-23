package Controllers;

import Models.Room.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//String servicesName, String areaUsers, String priceRent, String amount, String brand,
//        String freeServices)
public class ReaderAndWriterRoom {
    List<Room> rooms = new ArrayList<>();
    String line = null;
    public List<Room> readerRoom(){
        try {
            Room room;
            BufferedReader bufferedReaderRoom = new BufferedReader(new FileReader( new File("src/Data/Room.csv")));
            bufferedReaderRoom.readLine();
            while ((line= bufferedReaderRoom.readLine()) != null){
                String[] str = line.split(",");
                room = new Room (str[0] ,  str[1], str[2], str[3], str[4], str[5]);
                rooms.add(room);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rooms;

    }
    public void writerRoom(Room room)  {
        BufferedWriter bufferedWriterRoom = null;
        try {
            bufferedWriterRoom = new BufferedWriter(new FileWriter(new File("src/Data/Room.csv"),true));
            bufferedWriterRoom.write(room.getServicesName() + "," + room.getAreaUsers() + "," + room.getPriceRent()  + "," +room.getAmount()  + "," +room.getBrand()
                    + "," +room.getFreeServices() +"\n");
            bufferedWriterRoom.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
