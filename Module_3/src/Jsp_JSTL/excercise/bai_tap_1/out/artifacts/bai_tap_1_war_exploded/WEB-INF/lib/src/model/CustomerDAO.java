package model;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    private static List<Customer> customerList ;
    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer("Nguyen Van A", "001", 10, "Da nang" , "male"));
        customerList.add(new Customer("Nguyen Van A", "001", 10, "Da nang" , "male"));
        customerList.add(new Customer("Nguyen Van A", "001", 10, "Da nang" , "male"));
        customerList.add(new Customer("Nguyen Van A", "001", 10, "Da nang" , "male"));
        customerList.add(new Customer("Nguyen Van A", "001", 10, "Da nang" , "male"));
    }
    public static List<Customer> getCustomerList() {
        return customerList;
    }

}
