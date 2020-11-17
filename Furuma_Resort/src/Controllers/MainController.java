package Controllers;

import Models.CompareName;
import Models.Customers;
import Models.House.House;
import Models.Room.Room;
import Models.Villa.Villa;

import java.io.*;
import java.util.*;

public class MainController {
    List<Villa> listVilla = new ArrayList<>();
    List<House> listHouse = new ArrayList<>();
    List<Room> listRoom = new ArrayList<>();
    List<Customers> listCustomer= new ArrayList<Customers>();
    //    MainController mainController = new MainController();
    Scanner input = new Scanner(System.in);

    public void displayMainMenu() throws IOException {
        int choice;

        System.out.println("1. Add new services : ");
        System.out.println("2. Show services  : ");
        System.out.println("3. Add new customer : ");
        System.out.println("4. Show Information of Customer : ");
        System.out.println("5. Add new booking : ");
        System.out.println("6. Show Information of Employee: ");
        System.out.println("7. Exit ");
        System.out.println("Enter your choice : ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                addNewServices();
                displayMainMenu();
                break;
            case 2:
                showServices();
                displayMainMenu();
                break;
            case 3:
                addNewCustomer();
                displayMainMenu();
                break;
            case 4:
                showInforCustomer();
                displayMainMenu();
                break;


        }
    }

    public void addNewServices() throws IOException {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Add new villa :");
        System.out.println("2. Add new house :");
        System.out.println("3. Add new room :");
        System.out.println("4. Back to menu :");
        System.out.println("5. Exit ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                addVillaInfor();
                break;
            case 2:
                addHouseInfor();
                break;
            case 3:
                addRoomInfor();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                break;
        }
    }

    public void addVillaInfor()  {
        Villa villa = new Villa();
        input.nextLine();
        System.out.println("1. servicesName :");
        villa.setServicesName(input.nextLine());
        System.out.println("2. areaUsers :");
        villa.setAreaUsers(input.nextLine());
        System.out.println("3. priceRent :");
        villa.setPriceRent(input.nextLine());
        System.out.println("4. amount :");
        villa.setAmount(input.nextLine());
        System.out.println("5. brand :");
        villa.setBrand(input.nextLine());
        System.out.println("6. roomStandard :");
        villa.setRoomStandard(input.nextLine());
        System.out.println("7. convenientDescribe :");
        villa.setConvenientDescribe(input.nextLine());
        System.out.println("8. pool :");
        villa.setPool(input.nextFloat());
        System.out.println("9. floor :");
        villa.setFloor(input.nextInt());
        listVilla.add(villa);
        System.out.println("Congratulation !! ");
//        System.out.println(listVilla);

       ReaderAndWriterVilla readerAndWriterVilla = new ReaderAndWriterVilla();
       readerAndWriterVilla.writerVilla(villa);

    }

    public void addHouseInfor() throws IOException {
        House house = new House();
        Scanner input = new Scanner(System.in);
        System.out.println("1. servicesName :");
        house.setServicesName(input.nextLine());
        System.out.println("2. areaUsers :");
        house.setAreaUsers(input.nextLine());
        System.out.println("3. priceRent :");
        house.setPriceRent(input.nextLine());
        System.out.println("4. amount :");
        house.setAmount(input.nextLine());
        System.out.println("5. brand :");
        house.setBrand(input.nextLine());
        System.out.println("6. roomStandard :");
        house.setRoomStandard(input.nextLine());
        System.out.println("7. convenientDescribe :");
        house.setConvenientDescribe(input.nextLine());
        listHouse.add(house);
        System.out.println("Congratulation !! ");

        FileWriter file = new FileWriter(new File("src/Data/Room.csv"), true);
        for (House v : listHouse) {
            file.write(v.getServicesName() + "," + v.getPriceRent() + "," +
                    v.getAmount() + "," + v.getBrand() + "," + v.getAreaUsers() + "," + "\n");

        }
        file.close();
        addNewServices();
    }

    public void addRoomInfor() throws IOException {
        Room room = new Room();
        System.out.println("1. servicesName :");
        room.setServicesName(input.nextLine());
        System.out.println("2. areaUsers :");
        room.setServicesName(input.nextLine());
        System.out.println("3. priceRent :");
        room.setServicesName(input.nextLine());
        System.out.println("4. amount :");
        room.setServicesName(input.nextLine());
        System.out.println("5. brand :");
        room.setServicesName(input.nextLine());
        System.out.println("6. freeServices :");
        room.setServicesName(input.nextLine());
        listRoom.add(room);
        System.out.println("Congratulation !! ");
        FileWriter file = new FileWriter(new File("src/Data/Room.csv"), true);
        for (Room v : listRoom) {
            file.write(v.getServicesName() + "," + v.getPriceRent() + "," +
                    v.getAmount() + "," + v.getBrand() + "," + v.getAreaUsers() + "," + "\n");

        }
        file.close();
        addNewServices();

    }

    public void showServices() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Show all villa :");
        System.out.println("2. Show all house :");
        System.out.println("3. Show all room :");
        System.out.println("4. Show all villa not duplicate :");
        System.out.println("5. Show all house not duplicate :");
        System.out.println("6. Show all name not duplicate :");
        System.out.println("7. Back to menu ");
        System.out.println("8. Exit ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                showAllVilla();
            case 2:
                showAllHouse();
            case 3:
                showAllRoom();
        }
    }

    public void showAllVilla() {
        String path = "src/Data/Villa.csv";
        String line = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                bufferedReader.readLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void showAllHouse() {
        String path = "src/Data/House.csv";
        String line = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                bufferedReader.readLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void showAllRoom() {
        String path = "src/Data/Room.csv";
        String line = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                bufferedReader.readLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void addNewCustomer(){
        Customers customer = new Customers();
        Scanner input = new Scanner(System.in);
        System.out.println("1. Name of customer :");
        customer.setNameCustomer(input.nextLine());
        System.out.println("2. Date of Birth  :");
        customer.setBirthDay(input.nextLine());
        System.out.println("3. Gender :");
        customer.setGender(input.nextLine());
        System.out.println("4. Id :");
        customer.setId(input.nextLine());
        System.out.println("5. Phone number :");
        customer.setPhoneNumber(input.nextLine());
        System.out.println("6. Mail :");
        customer.setMail(input.nextLine());
        System.out.println("7. Your kind of customer :");
        customer.setKindOfCustomer(input.nextLine());
        System.out.println("8. Address :");
        customer.setAddress(input.nextLine());

        listCustomer.add(customer);

        try {
            BufferedWriter  bufferedWriter = new BufferedWriter(new FileWriter(new File("src/Models/Customer.csv"),true));
          bufferedWriter.write(customer.getNameCustomer()+"," + customer.getAddress()+"," +customer.getBirthDay() +","+
                  customer.getKindOfCustomer()+"," +customer.getMail() +"," +customer.getId()+"," +customer.getGender() +"\n");
          bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showInforCustomer(){
        System.out.println(listCustomer);
        Collections.sort(listCustomer, new CompareName());

        for (Customers customer : listCustomer){
            System.out.println(customer.toString());
        }
//        String path = "src/Data/Customer.csv";
//        String line = null;
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
//            while ((line = bufferedReader.readLine()) != null) {
//                bufferedReader.readLine();
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
    public void addNewBooking(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Booking villa :");
        System.out.println("Booking house :");
        System.out.println("Booking room :");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                showAllVilla();
            case 2:
                showAllHouse();
            case 3:
                showAllRoom();
        }

    }

    public static void main(String[] args) throws IOException {
        MainController mainController = new MainController();
        mainController.displayMainMenu();

    }

}
