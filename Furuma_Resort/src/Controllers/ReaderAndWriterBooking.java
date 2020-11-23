package Controllers;

import Models.Customers;
import Models.Services;
import Models.Villa.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//
//private String idCustomer;
//private String nameCustomer;
//private String birthDay;
//private String gender;
//private String id;
//private String phoneNumber;
//private String mail;
//private String kindOfCustomer;
//private String address;

//String servicesName, String areaUsers, String priceRent, String amount, String brand,
//        String roomStandard, String convenientDescribe, String pool, int floor
public class ReaderAndWriterBooking {
    String line = null;


    public List<Customers> readerCustomer(Customers customer) {
        List<Customers> listCustomer = new ArrayList<>();
        try {
            BufferedReader bufferedReaderCustomer = new BufferedReader(new FileReader(new File("src/Data/Customer.csv")));
            bufferedReaderCustomer.readLine();
            while ((line = bufferedReaderCustomer.readLine()) != null) {
                String[] str = line.split(",");
                customer = new Customers(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7], str[8]);
                listCustomer.add(customer);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listCustomer;
    }

    public List<Villa> readerVilla(Villa villa) {
        List<Villa> listVilla = new ArrayList<>();
        try {
            BufferedReader bufferedReaderVilla = new BufferedReader(new FileReader(new File("src/Data/Villa.csv")));
            bufferedReaderVilla.readLine();
            while ((line = bufferedReaderVilla.readLine()) != null) {
                String[] str = line.split(",");
                villa = new Villa(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7], Integer.parseInt(str[8]));
                listVilla.add(villa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listVilla;
    }

}

