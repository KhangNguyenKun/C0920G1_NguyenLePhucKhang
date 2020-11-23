package Controllers;

import Models.Customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteCustomer {
    List<Customers> listAfter = new ArrayList<>();
    public List<Customers> listAfterDelete(){
        ReaderAndWriterCustomers readerAndWriterCustomers = new ReaderAndWriterCustomers();

        listAfter= readerAndWriterCustomers.readerCustomer();
        Scanner scanner = new Scanner(System.in);
//        boolean checkName = false;
        System.out.println("Enter your id and we don't want to delete it but we will :((");
//        do {
            String idDelete = scanner.nextLine();
            for (Customers c: listAfter){

                if (c.getIdCustomer().equalsIgnoreCase(idDelete)){
                    System.out.println(c.getIdCustomer());
                    listAfter.remove(c);
                    break;
                }
//                else {
//                    System.out.println("We don't see you in here");
////                    checkName = true;
//                }
            }
//        }while (checkName);
        return listAfter;
    }
    public void newCsv(List<Customers> list){
        ReaderAndWriterCustomers readerAndWriterCustomers = new ReaderAndWriterCustomers();
        for (Customers c : listAfter)
        {
            readerAndWriterCustomers.writeCustomer(c);
        }

    }
}
