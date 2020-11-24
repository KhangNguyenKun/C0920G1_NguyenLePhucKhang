package Controllers;

import Models.Customers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriterCustomers {
//    private String idCustomer;
//    private String nameCustomer;
//    private String birthDay;
//    private String gender;
//    private String id;
//    private String phoneNumber;
//    private String mail;
//    private String kindOfCustomer;
//    private String address;
    List<Customers> customers = new ArrayList<>();
    String line = null;
    public List<Customers> readerCustomer(){
        try {
            Customers customer;
            BufferedReader bufferedReaderCustomer = new BufferedReader(new FileReader(new File("src/Data/Customer.csv")));
            while ((line = bufferedReaderCustomer.readLine()) != null){
                String[] str = line.split(",");
                customer = new Customers(str[0],str[1], str[2], str[3], str[4], str[5], str[6] , str[7] , str[8]);
                customers.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customers ;
    }
    public void writeCustomer(Customers customer){
        try {
            BufferedWriter bufferedWriterCustomer = new BufferedWriter(new FileWriter(new File("src/Data/Customer.csv"),true));
            bufferedWriterCustomer.write(customer.getIdCustomer()+"," +customer.getNameCustomer()+"," +customer.getBirthDay() +"," +customer.getGender()
                    +"," +customer.getId() +"," +customer.getPhoneNumber() +"," +customer.getMail() +"," +customer.getKindOfCustomer()+"," +customer.getAddress() +"\n");
            bufferedWriterCustomer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
