package ExamModule2.Function;

import ExamModule2.Customers.Customers;
import Models.Villa.Villa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//String idCustomer, String nameOfCustomer, String dateOfBirth, String gender, String phoneNumber, String address
public class ReadCustomer {
    String line = null;
    public List<Customers> readCustomer() {
        List<Customers> customersList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/ExamModule2/Data/Customers")));
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                Customers customer = new Customers(str[0], str[1], str[2], str[3], str[4], str[5]);
                customersList.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customersList;
    }
}
