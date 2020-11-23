package Controllers;

import Models.CompareName;
import Models.Customers;
import Models.Employee;
import Models.House.House;
import Models.Room.Room;
import Models.Tickets;
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
        System.out.println("7. Do you want to see a movie: ");
        System.out.println("8. Exit ");
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
            case 5:
                addNewBooking();
                break;
            case 6:
                showInformationEmployee();
                break;

            case 7:
                buyTickets();
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
        System.out.println("1. ID of service :");
        String id= input.nextLine();
        ServicesException servicesException = new ServicesException();
        servicesException.checkVilla(id);
        System.out.println("1. Name of services :");
        villa.setServicesName(input.nextLine());
        servicesException.checkNameOfService(villa.getServicesName());
        System.out.println("2. areaUsers :");
        villa.setAreaUsers(input.nextLine());
        servicesException.checkAreaUser(villa.getAreaUsers());
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
        villa.setPool(input.nextLine());
        servicesException.checkPool(villa.getPool());
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
        ReaderAndWriterHouse readerAndWriterHouse = new ReaderAndWriterHouse();
        readerAndWriterHouse.writerHouse(house);

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
        ReaderAndWriterRoom readerAndWriterRoom = new ReaderAndWriterRoom();
        readerAndWriterRoom.writerRoom(room);
        addNewServices();
    }

    public void showServices() throws IOException {
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
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                showAllVillaNotDup();
                break;
            case 5:
                showAllHouseNotDup();
                break;
            case 6:
                showAllRoomNotDup();
                break;
            case 7:
                displayMainMenu();
                break;

        }
    }

    //loi
    public void showAllVillaNotDup(){
        SortedSet<String> villas = new TreeSet<>();
        ReaderAndWriterVilla readerAndWriterVilla = new ReaderAndWriterVilla();
        List<Villa> villaList = readerAndWriterVilla.readerVilla();
        for (Villa i :villaList){
            villas.add(i.getServicesName()) ;
        }
        System.out.println(villas.first());
//        for (int i = 0 ; i<villaList.size(); i++){
//            villas.add(villaList[i]);
//        }
    }
    public void showAllHouseNotDup(){
        TreeSet<House> houses = new TreeSet<>();
        ReaderAndWriterHouse readerAndWriterHouse = new ReaderAndWriterHouse();
        List<House> houseList = readerAndWriterHouse.readerHouse();
        for (int i =0; i<houseList.size(); i++){
            houses.add(houseList.get(i)) ;
        }
    }
    public void showAllRoomNotDup(){

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
        boolean check = false;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("0. Enter your ID :");
            String id= input.nextLine();
            ValidateData validateData= new ValidateData();
            check = validateData.checkID(id);
            customer.setIdCustomer(id);
            if (!check){
                System.out.println("Enter again");
            }
        }
        while (!check);
        System.out.println("1. Name of customer :");
        customer.setNameCustomer(input.nextLine());
        System.out.println("2. Date of Birth  :");
        customer.setBirthDay(input.nextLine());
//        AgeException ageException = new AgeException();
//        ageException.checkAge(customer.getBirthDay());
        boolean checkGender = false;
        String gender=null;
        do {
            System.out.println("3. Enter your gender :");
            gender = input.nextLine();
            gender = gender.toLowerCase();
            if (!ValidateData.checkGender(gender)){
                System.out.println("Enter your gender again !!!");
            }
        }while (!ValidateData.checkGender(gender));
        String gender1 = Character.toString(gender.charAt(0)).toUpperCase() + gender.substring(1,gender.length());
        customer.setGender(gender1);
        System.out.println("4. Id :");
        customer.setId(input.nextLine());
        System.out.println("5. Phone number :");
        customer.setPhoneNumber(input.nextLine());
        boolean checkMail = false;
        do {

            System.out.println("6. Enter your email :");
            String mail = input.nextLine();
            ValidateData validateData = new ValidateData();

            if (!validateData.checkMail(mail)){
                System.out.println("Enter your mail again !!!");
            }else {
                customer.setMail(mail);
                checkMail = true;
            }

        }while (!checkMail);
        System.out.println("7. Your kind of customer :");
        customer.setKindOfCustomer(input.nextLine());
        System.out.println("8. Address :");
        customer.setAddress(input.nextLine());
        listCustomer.add(customer);
        ReaderAndWriterCustomers readerAndWriterCustomers = new ReaderAndWriterCustomers();
        readerAndWriterCustomers.writeCustomer(customer);

    }
    public void showInforCustomer(){

        ReaderAndWriterCustomers readerAndWriterCustomers = new ReaderAndWriterCustomers();
        listCustomer = readerAndWriterCustomers.readerCustomer();
        Collections.sort(listCustomer, new CompareName());

        for (Customers customer : listCustomer){
            System.out.println(customer.toString());
        }
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
                showInforCustomer();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
        }

    }
    public void bookingVilla(){
        List<Villa> listVilla= new ReaderAndWriterVilla().readerVilla();
        List<Customers> listCustomer = new ReaderAndWriterCustomers().readerCustomer();
        for (int i =0; i<listCustomer.size(); i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your id :");
            String id = scanner.nextLine();
        }

    }

    public void writeBooking (Customers customer){

        try {
            Scanner scanner = new Scanner(System.in);
            BufferedWriter bufferedWriterCustomer = new BufferedWriter(new FileWriter(new File("src/Data/Booking.csv"),true));
            for (int i =0 ; i<listCustomer.size(); i++){


            }
            bufferedWriterCustomer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showInformationEmployee(){
        AddEmployee addEmployee = new AddEmployee();
        Map<Integer, Employee> map = addEmployee.listEmployee();

        Set<Integer> set = map.keySet();
        for (Integer i: set) {
            System.out.println(map.get(i));
        }
    }

    public void buyTickets(){
//        String nameOfCustomer, String nameOfMovie, String priceOfMovie, String seat, String time
        Queue<Tickets> listCustomer = new LinkedList<>();


        for (int i=0; i<2 ;i++) {
            Tickets ticket = new Tickets();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name !!");
            String name = scanner.nextLine();
            ticket.setNameOfCustomer(name);
            System.out.println("Please enter the movie that you want to see !!");
            String nameOfMovie = scanner.nextLine();
            ticket.setNameOfMovie(nameOfMovie);
            System.out.println("Please choose your seat :");
            String seat = scanner.nextLine();
            ticket.setSeat(seat);
            System.out.println("Pay the price ");
            String price = scanner.nextLine();
            ticket.setPriceOfMovie(price);
            System.out.println("Please tell us know when do you want to see !!!");
            String time = scanner.nextLine();
            ticket.setTime(time);
            listCustomer.add(ticket);

        }

        for (Tickets i: listCustomer ) {
            System.out.println(i.toString());

        }
    }
    public static void main(String[] args) throws IOException {
        MainController mainController = new MainController();
        mainController.displayMainMenu();

    }

}
