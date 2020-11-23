package Controllers;

import Models.CompareName;
import Models.Customers;
import Models.Employee;
import Models.Room.Room;
import Models.Villa.House;

import java.io.*;
import java.util.*;

public class MainController {
    List<House> listVilla = new ArrayList<>();
    List<Models.House.House> listHouse = new ArrayList<Models.House.House>();
    List<Room> listRoom = new ArrayList<>();
    List<Customers> listCustomer= new ArrayList<Customers>();
    //    MainController mainController = new MainController();
    Scanner input = new Scanner(System.in);

    public void displayMainMenu() throws IOException {
        int choice;
        System.out.println("*******Menu*******");
        System.out.println("1. Add new services : ");
        System.out.println("2. Show services  : ");
        System.out.println("3. Add new customer : ");
        System.out.println("4. Show Information of Customer : ");
        System.out.println("5. Add new booking : ");
        System.out.println("6. Show Information of Employee: ");
        System.out.println("7. Do you want to see a movie: ");
        System.out.println("8. Do you want to delete your information? ");
        System.out.println("9. Do you want to edit your information? ");
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
            case  8:

                deleteCustomer();
                break;
            case 9:
                editCustomer();
                break;
        }
    }
    public void editCustomer(){
        EditInformationOfCustomer editInformationOfCustomer = new EditInformationOfCustomer();
        List<Customers> list = new ArrayList<>();
        list = editInformationOfCustomer.edit();
        System.out.println(list);
    }

    public void deleteCustomer(){
        DeleteCustomer deleteCustomer = new DeleteCustomer();
        List<Customers> list= deleteCustomer.listAfterDelete();
        for (Customers c: list){
            System.out.println(c);
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
        House villa = new House();
        Scanner input = new Scanner(System.in);
        ServicesException servicesException = new ServicesException();
        boolean checkId= false;
        do {
            System.out.println("1. ID of service :");
            String id= input.nextLine();

            if (!servicesException.checkVilla(id)){
                System.out.println("Enter your id again!!");
            }
            else {
                villa.setId(id);
                checkId = true;
            }
        }while (!checkId);

        boolean checkName = false;
        do {
            System.out.println("Enter your service :");
            String name = input.nextLine();
            if (!servicesException.checkName(name)){
                System.err.println("Enter your service again !!");
            }
            else {
                villa.setServicesName(name);
                checkName = true;
            }
        }while (!checkName);
        System.out.println("2. areaUsers :");
        villa.setAreaUsers(input.nextLine());
        servicesException.checkAreaUser(villa.getAreaUsers());
        System.out.println("3. priceRent :");
        villa.setPriceRent(input.nextLine());
        boolean checkAmount = false;
        do {
            System.out.println("4. Enter amount of your people!!!");
            String amount = input.nextLine();
            if (!servicesException.checkAmount(amount)){
                System.err.println("Your people is too many!!. Enter again !!");
            }
            else {
                villa.setAmount(amount);
                checkAmount = true;
            }
        }while (!checkAmount);
        boolean checkBrand = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("5. What kind of brand do you want to use???");
            System.out.println("1. Massage \n" +
                    "2. Karaoke\n" + "3. Food\n" +
                    "4. Drink\n" +
                    "5. Car");
            String brand = scanner.nextLine();
            if (!servicesException.checkBrand(brand)){
                System.err.println("We dont have this brand ^^");
            }
            else {
                villa.setBrand(brand);
                checkBrand= true;
            }
        }while (!checkBrand);
        System.out.println("6. roomStandard :");
        villa.setRoomStandard(input.nextLine());
        System.out.println("7. convenientDescribe :");
        villa.setConvenientDescribe(input.nextLine());
        System.out.println("8. pool :");
        villa.setPool(input.nextLine());
        servicesException.checkPool(villa.getPool());
        boolean checkFloor = false;
        do {
            System.out.println("Enter your floor :");
            String floor= input.nextLine();
            if (!servicesException.checkFloor(floor)){
                System.err.println("We dont have this floor!!");
            }
            else {
                villa.setFloor(floor);
                checkFloor = true;
            }
        }while (!checkFloor);
        listVilla.add(villa);
        System.out.println("Completed !! ");
//        System.out.println(listVilla);

       ReaderAndWriterVilla readerAndWriterVilla = new ReaderAndWriterVilla();
       readerAndWriterVilla.writerVilla(villa);

    }

    public void addHouseInfor() throws IOException {
//        String Id, String servicesName, String areaUsers, String priceRent, String amount, String brand,
//                String roomStandard, String convenientDescribe, String pool
        Models.House.House house = new Models.House.House();
        Scanner input = new Scanner(System.in);
        ServicesException servicesException = new ServicesException();
        boolean checkId= false;
        do {
            System.out.println("1. ID of service :");
            String id= input.nextLine();

            if (!servicesException.checkHouse(id)){
                System.out.println("Enter your id again!!");
            }
            else {
                house.setId(id);
                checkId = true;
            }
        }while (!checkId);

        boolean checkName = false;
        do {
            System.out.println("Enter your service name :");
            String name = input.nextLine();
            if (!servicesException.checkName(name)){
                System.err.println("Enter your service name again !!");
            }
            else {
                house.setServicesName(name);
                checkName = true;
            }
        }while (!checkName);
        boolean checkArea = false;
        do {
            System.out.println("2. area Users :");
            String area = input.nextLine();
           if(!servicesException.checkAreaUser(area)){
               System.err.println("Enter again");
           }
           else {
               house.setAreaUsers(area);
               checkArea = true;
           }
        }while (!checkArea);
        boolean checkPrice = false;
        do {
            System.out.println("3. Enter the price");
            String price = input.nextLine();
            if (!servicesException.checkPrice(price)){
                System.err.println("Wrong format!!");
            }
            else {
                house.setPriceRent(price);
                checkPrice = true;
            }
        }while (!checkPrice);
        boolean checkAmount = false;
        do {
            System.out.println("4. Enter amount of your people!!!");
            String amount = input.nextLine();
            if (!servicesException.checkAmount(amount)){
                System.err.println("Your people is too many!!. Enter again !!");
            }
            else {
                house.setAmount(amount);
                checkAmount = true;
            }
        }while (!checkAmount);
        boolean checkBrand = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("5. What kind of brand do you want to use???");
            System.out.println("1. Massage \n" +
                    "2. Karaoke\n" + "3. Food\n" +
                    "4. Drink\n" +
                    "5. Car");
            String brand = scanner.nextLine();
            if (!servicesException.checkBrand(brand)){
                System.err.println("We dont have this brand ^^");
            }
            else {
                house.setBrand(brand);
                checkBrand= true;
            }
        }while (!checkBrand);
        System.out.println("6. roomStandard :");
        house.setRoomStandard(input.nextLine());
        System.out.println("7. convenientDescribe :");
        house.setConvenientDescribe(input.nextLine());
        System.out.println("8. pool :");
        house.setPool(input.nextLine());
        servicesException.checkPool(house.getPool());

        listHouse.add(house);
        System.out.println("Completed !! ");
//        System.out.println(listVilla);

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
        List<House> villaList = readerAndWriterVilla.readerVilla();
        for (House i :villaList){
            villas.add(i.getServicesName()) ;
        }
        for (String s: villas) {
            System.out.println(s);
        }
//        for (int i = 0 ; i<villaList.size(); i++){
//            villas.add(villaList[i]);
//        }
    }
    public void showAllHouseNotDup(){
        TreeSet<Models.House.House> houses = new TreeSet<>();
        ReaderAndWriterHouse readerAndWriterHouse = new ReaderAndWriterHouse();
        List<Models.House.House> houseList = readerAndWriterHouse.readerHouse();
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
        boolean checkName = false;
        NameException nameException = new NameException();
        do {
            System.out.println("Enter your service :");
            String name = input.nextLine();
            if (!nameException.checkName(name)){
                System.out.println("Enter your service again !!");
            }
            else {
                customer.setNameCustomer(name);
                checkName = true;
            }
        }while (!checkName);
        System.out.println("2. Date of Birth  :");
        AgeException ageException = new AgeException();
        customer.setBirthDay(input.nextLine());
        ageException.checkAge(input.nextLine());
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
        List<House> listVilla= new ReaderAndWriterVilla().readerVilla();
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
        Queue<Customers> listCustomer = new LinkedList<>();
        for (int i=0; i<2 ;i++) {
            Scanner scanner = new Scanner(System.in);
            Customers customer = new Customers();
            boolean isHas = false;
            do {
                System.out.println("Please enter your name !!");
                String name = scanner.nextLine();
                ReaderAndWriterCustomers readerAndWriterCustomers = new ReaderAndWriterCustomers();
                List<Customers> list = readerAndWriterCustomers.readerCustomer();
                for (Customers c:list){
                    if (name.equalsIgnoreCase(c.getNameCustomer())){
                        listCustomer.add(c);
                        isHas = true;
                    }
                    else {
                        System.out.println("You is not in here before");
                    }
                }
            }while (!isHas);
//            System.out.println("Please enter the movie that you want to see !!");
//            String nameOfMovie = scanner.nextLine();
//            listCustomer.add(nameOfMovie);
//            System.out.println("Please choose your seat :");
//            String seat = scanner.nextLine();
//            ticket.setSeat(seat);
//            System.out.println("Pay the price ");
//            String price = scanner.nextLine();
//            ticket.setPriceOfMovie(price);
//            System.out.println("Please tell us know when do you want to see !!!");
//            String time = scanner.nextLine();
//            ticket.setTime(time);
        }
    }
    public static void main(String[] args) throws IOException {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }
}
