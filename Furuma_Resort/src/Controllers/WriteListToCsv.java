package Controllers;

import Models.Customers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteListToCsv {
    List<String> list = new ArrayList<>();
    public void writeCsv(List<Customers> list){

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/Data/Customer.csv")));
            String line = "";
            for (Customers customer: list){
                bufferedWriter.write(customer.getIdCustomer()+"," +customer.getNameCustomer()+"," +customer.getBirthDay() +"," +customer.getGender()
                        +"," +customer.getId() +"," +customer.getPhoneNumber() +"," +customer.getMail() +"," +customer.getKindOfCustomer()+"," +customer.getAddress());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
