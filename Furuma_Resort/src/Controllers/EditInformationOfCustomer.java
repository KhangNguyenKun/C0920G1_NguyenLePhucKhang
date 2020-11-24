package Controllers;

import Models.Customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//String idCustomer, String nameCustomer, String birthDay, String gender, String id, String phoneNumber,
//        String mail, String kindOfCustomer, String address
public class EditInformationOfCustomer {
    public List<Customers> edit() {
        List<Customers> listAfterEdit = new ArrayList<>();
        ReaderAndWriterCustomers readerAndWriterCustomers = new ReaderAndWriterCustomers();
        listAfterEdit= readerAndWriterCustomers.readerCustomer();
        boolean checkName= false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your ID ");
            String id = scanner.nextLine();
            for (Customers c: listAfterEdit){
                if (c.getIdCustomer().equalsIgnoreCase(id)){
                    System.out.println("We find you");
                    System.out.println("what information do you want to edit???\n"+
                            "1. Id\n" +
                            "2. Name\n" +
                            "3. Date of birth\n" +
                            "4. Gender\n" +
                            "5. Id\n" +
                            "6. Phone number\n" +
                            "7. Mail\n" +
                            "8.Kind of customer\n" +
                            "9. Address");
                    int number =Integer.parseInt(scanner.nextLine());
                    switch (number){
                        case 1:
                            System.out.println("Your new ID:");
                            String newID =scanner.nextLine();
                            c.setIdCustomer(newID);
                            break;
                        case 2:
                            System.out.println("Your new name :");
                            String newName = scanner.nextLine();
                            c.setNameCustomer(newName);
                            break;
                        case 3:
                            System.out.println("Your new Date of birth :");
                            String newDate = scanner.nextLine();
                            c.setBirthDay(newDate);
                            break;
                        case 4:
                            System.out.println("Your new gender :");
                            String newGender = scanner.nextLine();
                            c.setGender(newGender);
                            break;
                        case 5:
                            System.out.println("Your new id :");
                            String newIDelse = scanner.nextLine();
                            c.setId(newIDelse);
                            break;
                        case 6:
                            System.out.println("Your new phone number :");
                            String newPhone = scanner.nextLine();
                            c.setPhoneNumber(newPhone);
                            break;
                        case 7:
                            System.out.println("Your new mail :");
                            String newMail = scanner.nextLine();
                            c.setMail(newMail);
                            break;
                        case 8:
                            System.out.println("Your new kind of customer :");
                            String newKind = scanner.nextLine();
                            c.setKindOfCustomer(newKind);
                            break;
                        case 9:
                            System.out.println("Your new address :");
                            String newAdd = scanner.nextLine();
                            c.setAddress(newAdd);
                            break;
                    }
                    break;
                }
                else {
//                    System.out.println("We don't see you in here");
                    checkName = false;
                }
            }
        }while (checkName);
        return listAfterEdit;
    }
}
