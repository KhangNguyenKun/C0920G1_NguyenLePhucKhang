package Controllers;
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
    List<Models.House.House> listHouse = new ArrayList<Models.House.House>();
    List<Room> listRoom = new ArrayList<>();
    List<Customers> listCustomer = new ArrayList<Customers>();
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
                showInformationCustomer();
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
            case 8:

                deleteCustomer();
                break;
            case 9:
                editCustomer();
                break;
        }
    }

    public void editCustomer() {
        EditInformationOfCustomer editInformationOfCustomer = new EditInformationOfCustomer();
        List<Customers> list = new ArrayList<>();
        list = editInformationOfCustomer.edit();
        for (Customers c : list) {
            System.out.println(c + "\n");
        }
        WriteListToCsv writeListToCsv = new WriteListToCsv();
        writeListToCsv.writeCsv(list);
    }

    public void deleteCustomer() {
        DeleteCustomer deleteCustomer = new DeleteCustomer();
        List<Customers> list = deleteCustomer.listAfterDelete();
        for (Customers c : list) {
            System.out.println(c + "\n");
        }
        WriteListToCsv writeListToCsv = new WriteListToCsv();
        writeListToCsv.writeCsv(list);
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
                addVillaInformation();
                break;
            case 2:
                addHouseInformation();
                break;
            case 3:
                addRoomInformation();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                break;
        }
    }

    public void addVillaInformation() throws IOException {
        Villa villa = new Villa();
        Scanner input = new Scanner(System.in);
        ServicesException servicesException = new ServicesException();
        boolean checkId = false;
        do {
            System.out.println("1. ID of service :");
            String id = input.nextLine();

            if (!servicesException.checkVilla(id)) {
                System.out.println("Enter your id again!!");
            } else {
                villa.setId(id);
                checkId = true;
            }
        } while (!checkId);

        boolean checkName = false;
        do {
            System.out.println("Enter your service :");
            String name = input.nextLine();
            if (!servicesException.checkName(name)) {
                System.err.println("Enter your service again !!");
            } else {
                villa.setServicesName(name);
                checkName = true;
            }
        } while (!checkName);
        System.out.println("2. areaUsers :");
        villa.setAreaUsers(input.nextLine());
        servicesException.checkAreaUser(villa.getAreaUsers());
        System.out.println("3. priceRent :");
        villa.setPriceRent(input.nextLine());
        boolean checkAmount = false;
        do {
            System.out.println("4. Enter amount of your people!!!");
            String amount = input.nextLine();
            if (!servicesException.checkAmount(amount)) {
                System.err.println("Your people is too many!!. Enter again !!");
            } else {
                villa.setAmount(amount);
                checkAmount = true;
            }
        } while (!checkAmount);
        boolean checkBrand = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("5. What kind of brand do you want to use???");
            System.out.println("1. Massage \n" +
                    "2. Karaoke\n" + "3. Food\n" +
                    "4. Drink\n" +
                    "5. Car");
            String brand = scanner.nextLine();
            if (!servicesException.checkBrand(brand)) {
                System.err.println("We dont have this brand ^^");
            } else {
                villa.setBrand(brand);
                checkBrand = true;
            }
        } while (!checkBrand);
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
            String floor = input.nextLine();
            if (!servicesException.checkFloor(floor)) {
                System.err.println("We dont have this floor!!");
            } else {
                villa.setFloor(floor);
                checkFloor = true;
            }
        } while (!checkFloor);
        listVilla.add(villa);
        System.out.println("Completed !! ");
        ReaderAndWriterVilla readerAndWriterVilla = new ReaderAndWriterVilla();
        readerAndWriterVilla.writerVilla(villa);
    }

    public void addHouseInformation() throws IOException {
//        String Id, String servicesName, String areaUsers, String priceRent, String amount, String brand,
//                String roomStandard, String convenientDescribe, String pool
        Models.House.House house = new Models.House.House();
        Scanner input = new Scanner(System.in);
        ServicesException servicesException = new ServicesException();
        boolean checkId = false;
        do {
            System.out.println("1. ID of service :");
            String id = input.nextLine();

            if (!servicesException.checkHouse(id)) {
                System.out.println("2. Enter your id again!!");
            } else {
                house.setId(id);
                checkId = true;
            }
        } while (!checkId);

        boolean checkName = false;
        do {
            System.out.println("3. Enter your service name :");
            String name = input.nextLine();
            if (!servicesException.checkName(name)) {
                System.err.println("Enter your service name again !!");
            } else {
                house.setServicesName(name);
                checkName = true;
            }
        } while (!checkName);
        boolean checkArea = false;
        do {
            System.out.println("2. area Users :");
            String area = input.nextLine();
            if (!servicesException.checkAreaUser(area)) {
                System.err.println("Enter again");
            } else {
                house.setAreaUsers(area);
                checkArea = true;
            }
        } while (!checkArea);
        boolean checkPrice = false;
        do {
            System.out.println("3. Enter the price");
            String price = input.nextLine();
            if (!servicesException.checkPrice(price)) {
                System.err.println("Wrong format!!");
            } else {
                house.setPriceRent(price);
                checkPrice = true;
            }
        } while (!checkPrice);
        boolean checkAmount = false;
        do {
            System.out.println("4. Enter amount of your people!!!");
            String amount = input.nextLine();
            if (!servicesException.checkAmount(amount)) {
                System.err.println("Your people is too many!!. Enter again !!");
            } else {
                house.setAmount(amount);
                checkAmount = true;
            }
        } while (!checkAmount);
        boolean checkBrand = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("5. What kind of brand do you want to use???");
            System.out.println("1. Massage \n" +
                    "2. Karaoke\n" + "3. Food\n" +
                    "4. Drink\n" +
                    "5. Car");
            String brand = scanner.nextLine();
            if (!servicesException.checkBrand(brand)) {
                System.err.println("We dont have this brand ^^");
            } else {
                house.setBrand(brand);
                checkBrand = true;
            }
        } while (!checkBrand);
        System.out.println("6. roomStandard :");
        house.setRoomStandard(input.nextLine());
        System.out.println("7. convenientDescribe :");
        house.setConvenientDescribe(input.nextLine());
        System.out.println("8. pool :");
        house.setPool(input.nextLine());
        servicesException.checkPool(house.getPool());
        listHouse.add(house);
        System.out.println("Completed !! ");
        ReaderAndWriterHouse readerAndWriterHouse = new ReaderAndWriterHouse();
        readerAndWriterHouse.writerHouse(house);

    }

    public void addRoomInformation() throws IOException {
//        String Id, String servicesName, String areaUsers, String priceRent, String amount, String brand,
//                String freeServices
        Room room = new Room();
        Scanner input = new Scanner(System.in);
        ServicesException servicesException = new ServicesException();
        boolean checkId = false;
        do {
            System.out.println("1. ID of service :");
            String id = input.nextLine();

            if (!servicesException.checkHouse(id)) {
                System.out.println("Enter your id again!!");
            } else {
                room.setId(id);
                checkId = true;
            }
        } while (!checkId);
        boolean checkArea = false;
        do {
            System.out.println("2. area Users :");
            String area = input.nextLine();
            if (!servicesException.checkAreaUser(area)) {
                System.err.println("Enter again");
            } else {
                room.setAreaUsers(area);
                checkArea = true;
            }
        } while (!checkArea);
        boolean checkPrice = false;
        do {
            System.out.println("3. Enter the price");
            String price = input.nextLine();
            if (!servicesException.checkPrice(price)) {
                System.err.println("Wrong format!!");
            } else {
                room.setPriceRent(price);
                checkPrice = true;
            }
        } while (!checkPrice);
        boolean checkAmount = false;
        do {
            System.out.println("4. Enter amount of your people!!!");
            String amount = input.nextLine();
            if (!servicesException.checkAmount(amount)) {
                System.err.println("Your people is too many!!. Enter again !!");
            } else {
                room.setAmount(amount);
                checkAmount = true;
            }
        } while (!checkAmount);
        boolean checkBrand = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("5. What kind of brand do you want to use???");
            System.out.println("1. Massage \n" +
                    "2. Karaoke\n" + "3. Food\n" +
                    "4. Drink\n" +
                    "5. Car");
            String brand = scanner.nextLine();
            if (!servicesException.checkBrand(brand)) {
                System.err.println("We dont have this brand ^^");
            } else {
                room.setBrand(brand);
                checkBrand = true;
            }
        } while (!checkBrand);
        System.out.println("6. freeServices :");
        room.setServicesName(input.nextLine());
        listRoom.add(room);
        System.out.println("Completed !! ");
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
                showAllVillaNotDuplicate();
                break;
            case 5:
                showAllHouseNotDuplicate();
                break;
            case 6:
                showAllRoomNotDuplicate();
                break;
            case 7:
                displayMainMenu();
                break;

        }
    }

    public void showAllVillaNotDuplicate() {
        TreeSet<String> villas = new TreeSet<>();
        ReaderAndWriterVilla readerAndWriterVilla = new ReaderAndWriterVilla();
        List<Villa> villaList = readerAndWriterVilla.readerVilla();
        for (Villa i : villaList) {
            villas.add(i.getServicesName());
        }
        for (String s : villas) {
            System.out.println(s);
        }
    }

    public void showAllHouseNotDuplicate() {
        TreeSet<String> houses = new TreeSet<>();
        ReaderAndWriterHouse readerAndWriterHouse = new ReaderAndWriterHouse();
        List<Models.House.House> houseList = readerAndWriterHouse.readerHouse();
        for (House i : houseList) {
            houses.add(i.getServicesName());
        }
        for (String s : houses) {
            System.out.println(s);
        }
    }

    public void showAllRoomNotDuplicate() {
        TreeSet<String> rooms = new TreeSet<>();
        ReaderAndWriterRoom readerAndWriterRoom = new ReaderAndWriterRoom();
        List<Room> houseList = readerAndWriterRoom.readerRoom();
        for (Room r : houseList) {
            rooms.add(r.getServicesName());
        }
        for (String s : rooms) {
            System.out.println(s);
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

    public void addNewCustomer() {
        Customers customer = new Customers();
        boolean check = false;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("0. Enter your ID :");
            String id = input.nextLine();
            ValidateData validateData = new ValidateData();
            check = validateData.checkID(id);
            customer.setIdCustomer(id);
            if (!check) {
                System.out.println("Enter again");
            }
        }
        while (!check);
        boolean checkName = false;
        NameException nameException = new NameException();
        do {
            System.out.println("Enter your name :");
            String name = input.nextLine();
            if (!nameException.checkName(name)) {
                System.out.println("Enter your name again !!");
            } else {
                customer.setNameCustomer(name);
                checkName = true;
            }
        } while (!checkName);
        boolean checkDate = false;
        do {
            ValidateData validateData = new ValidateData();
            System.out.println("Enter your date of birth");
            String date = input.nextLine();
            validateData.checkDateOfBirth(date);
            if (!validateData.checkDateOfBirth(date)) {
                System.out.println("You re not be allowed to be here!!");
            } else {
                customer.setBirthDay(date);
                checkDate = true;
            }
        } while (!checkDate);
//        boolean checkGender = false;
        String gender = null;
        do {
            System.out.println("3. Enter your gender :");
            gender = input.nextLine();
            gender = gender.toLowerCase();
            if (!ValidateData.checkGender(gender)) {
                System.out.println("Enter your gender again !!!");
            }
        } while (!ValidateData.checkGender(gender));
        String genderAfter = Character.toString(gender.charAt(0)).toUpperCase() + gender.substring(1);
        customer.setGender(genderAfter);
        System.out.println("4. Id :");
        customer.setId(input.nextLine());
        boolean checkPhone = false;
        do {
            System.out.println("Enter your phone number:");
            String phone = input.nextLine();
            ValidateData validateData = new ValidateData();
            if (!validateData.checkPhone(phone)){
                System.out.println("Wrong format!!");

            }else {
                customer.setPhoneNumber(phone);
                checkPhone = true;
            }
        }while (!checkPhone);
        boolean checkMail = false;
        do {
            System.out.println("6. Enter your email :");
            String mail = input.nextLine();
            ValidateData validateData = new ValidateData();
            if (!validateData.checkMail(mail)) {
                System.out.println("Enter your mail again !!!");
            } else {
                customer.setMail(mail);
                checkMail = true;
            }
        } while (!checkMail);
        System.out.println("7. Your kind of customer :");
        customer.setKindOfCustomer(input.nextLine());
        System.out.println("8. Address :");
        customer.setAddress(input.nextLine());
        listCustomer.add(customer);
        ReaderAndWriterCustomers readerAndWriterCustomers = new ReaderAndWriterCustomers();
        readerAndWriterCustomers.writeCustomer(customer);

    }

    public void showInformationCustomer() {
        ReaderAndWriterCustomers readerAndWriterCustomers = new ReaderAndWriterCustomers();
        listCustomer = readerAndWriterCustomers.readerCustomer();
        Collections.sort(listCustomer);
        for (Customers customer : listCustomer) {
            System.out.println(customer);
        }
    }

    public void addNewBooking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Booking villa :");
        System.out.println("Booking house :");
        System.out.println("Booking room :");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllVilla();
                writeBooking();
                break;
            case 2:
                showAllHouse();
                writeBooking();
                break;
            case 3:
                showAllRoom();
                writeBooking();
                break;
        }
    }

    public void writeBooking() {
        ReaderAndWriterBooking readerAndWriterBooking = new ReaderAndWriterBooking();
        readerAndWriterBooking.addNewBooking();
    }

    public void showInformationEmployee() {
        AddEmployee addEmployee = new AddEmployee();
        Map<Integer, Employee> map = addEmployee.listEmployee();

        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            System.out.println(map.get(i));
        }
    }

    public void buyTickets() {
//        String nameOfCustomer, String nameOfMovie, String priceOfMovie, String seat, String time
        Queue<Tickets> tickets = new LinkedList<>();
        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);
            Customers customer = new Customers();
            Tickets ticket = new Tickets();
            boolean isHas = false;
            do {
                System.out.println("Please enter your name !!");
                String name = scanner.nextLine();
                ReaderAndWriterCustomers readerAndWriterCustomers = new ReaderAndWriterCustomers();
                List<Customers> list = readerAndWriterCustomers.readerCustomer();
                for (Customers c : list) {
                    if (name.equalsIgnoreCase(c.getNameCustomer())) {
                        System.out.println("We find you!");
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
                        tickets.add(ticket);
                        isHas = true;
                    } else {
//                        System.out.println("You is not in here before");
                        isHas = false;
                    }
                }
            } while (!isHas);

        }
    }

    public static void main(String[] args) throws IOException {
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }
}
