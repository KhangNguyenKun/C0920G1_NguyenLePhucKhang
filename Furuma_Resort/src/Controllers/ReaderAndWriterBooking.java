package Controllers;

import Models.Customers;
import Models.House.House;
import Models.Room.Room;
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
    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    public void choseVillaForCustomer(Customers customer) {
        List<Villa> villaList = new ReaderAndWriterVilla().readerVilla();

        for (Villa c : villaList) {
            System.out.println(c + "\n");
        }
        System.out.println("Enter the name service : ");
        String nameService = getScanner().nextLine();
        boolean isNameList = false;
        while (true) {
            new ReaderAndWriterVilla().readerVilla();
            for (Villa v : villaList) {
                if (nameService.equals(v.getServicesName())) {
                    customer.setServices(v);
                    isNameList = true;
                    break;
                }
            }
            if (!isNameList) {
                System.out.println(nameService + " Sorry. \nEnter the name service again: ");
                nameService = getScanner().nextLine();
            } else {
                break;
            }
        }
    }

    public void choseHouseForCustomer(Customers customer) {
        List<House> houseList = new ReaderAndWriterHouse().readerHouse();

        for (House h : houseList) {
            System.out.println(h + "\n");
        }
        System.out.println("Enter name service to choose: ");
        String nameService = getScanner().nextLine();
        boolean isNameList = false;
        houseList = new ReaderAndWriterHouse().readerHouse();
        while (true) {
            new ReaderAndWriterHouse().readerHouse();
            for (House h : houseList) {
                if (nameService.equals(h.getServicesName())) {
                    customer.setServices(h);
                    isNameList = true;
                    break;
                }
            }
            if (!isNameList) {
                System.out.println(nameService + " Sorry. \nEnter name service again: ");
                nameService = getScanner().nextLine();
            } else {
                break;
            }
        }
    }

    public void choseRoomForCustomer(Customers customer) {

        System.out.println("Enter name service to choose: ");
        String nameService = getScanner().nextLine();
        boolean isNameList = false;
        List<Room> roomList = new ReaderAndWriterRoom().readerRoom();

        for (Room c : roomList) {
            System.out.println(c + "\n");
        }
        while (true) {

            for (Room r : roomList) {
                if (nameService.equals(r.getServicesName())) {
                    customer.setServices(r);
                    isNameList = true;
                    break;
                }
            }
            if (!isNameList) {
                System.out.println(nameService + " Sorry. \nEnter name service again: ");
                nameService = getScanner().nextLine();
            } else {
                break;
            }
        }
    }

    public void addNewBooking() {
        List<Customers> customerList = new ReaderAndWriterCustomers().readerCustomer();
        for (Customers c : customerList) {
            c.showInfor();
        }
        boolean isIdCustomer = false;

        while (true) {
            System.out.println("Enter Id customer to booking: ");
            String choseCustomer = getScanner().nextLine();
            for (Customers c : customerList) {
                if (choseCustomer.equals(c.getIdCustomer())) {
                    System.out.println("1. Villa\n2. House\n3. Room\nEnter service that you want to chose: ");
                    String choseService = getScanner().nextLine();
                    String elementLine = null;
                    switch (Integer.parseInt(choseService)) {
                        case 1: {
                            choseVillaForCustomer(c);
                            Villa villa = (Villa) c.getServices();
                            elementLine = villa.getId() + "," + villa.getServicesName() + "," + villa.getAreaUsers() + ","
                                    + villa.getPriceRent() + "," + villa.getAmount() + "," + ","
                                    + villa.getRoomStandard() + "," + villa.getConvenientDescribe() + "," + villa.getPool() + ","
                                    + villa.getFloor();
                            break;
                        }
                        case 2: {
                            choseHouseForCustomer(c);
                            House house = (House) c.getServices();
                            elementLine = house.getId() + "," + house.getServicesName() + "," + house.getAreaUsers() + ","
                                    + house.getPriceRent() + "," + house.getAmount() + "," + ","
                                    + house.getRoomStandard() + "," + house.getConvenientDescribe() + "," + house.getPool() + ","
                            ;
                            break;
                        }
                        case 3: {
                            choseRoomForCustomer(c);
                            Room room = (Room) c.getServices();
                            elementLine = room.getId() + "," + room.getServicesName() + "," + room.getAreaUsers() + ","
                                    + room.getPriceRent() + "," + room.getAmount() + ","
                            ;
                            break;
                        }
                    }

                    String line = c.getIdCustomer() + "," + c.getNameCustomer() + "," + c.getBirthDay() + "," + c.getGender()
                            + "," + c.getIdCustomer() + "," + c.getPhoneNumber() + "," + c.getMail()
                            + "," + c.getKindOfCustomer() + "," + c.getAddress() + "," + elementLine;
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/Data/Booking.csv")));
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    isIdCustomer = true;
                    break;
                }
            }
            if (!isIdCustomer) {
                System.out.println("Id customer isn't exist!");
            } else {
                break;
            }
        }
    }
}