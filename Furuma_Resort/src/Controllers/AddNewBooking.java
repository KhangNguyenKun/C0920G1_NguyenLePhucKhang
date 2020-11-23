package Controllers;

import Models.Customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNewBooking {
    public void showCustomerOut() {
        List<Customers> list = new ArrayList<>();
        ReaderAndWriterCustomers readerAndWriterCustomers = new ReaderAndWriterCustomers();
        list =readerAndWriterCustomers.readerCustomer();
        System.out.println(list);
    }
    public void selectService(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID :");
        String id= scanner.nextLine();

    }
}
