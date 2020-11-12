package Controllers;

import Models.House.House;
import Models.Room.Room;
import Models.Villa.Villa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainController {
    List<Villa> listVilla = new ArrayList<>();
    List<House> listHouse = new ArrayList<>();
    List<Room> listRoom = new ArrayList<>();
    MainController mainController = new MainController();
    Scanner input = new Scanner(System.in);

    public void displayMainMenu() {
        int choice;

        System.out.println("1. Add new services : ");
        System.out.println("2. Show services  : ");
        System.out.println("3. Add new customer : ");
        System.out.println("4. Show Information of Customer : ");
        System.out.println("5. Add new services : ");
        System.out.println("6. Show Information of Employee: ");
        System.out.println("7. Exit ");
        System.out.println("Enter your choice : ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                addNewServices();
                break;
            case 2:

        }
    }

    public void addNewServices() {
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

    public void addVillaInfor() {
        Villa villa = new Villa();
        System.out.println("1. servicesName :");
        villa.setServicesName(input.nextLine());
        System.out.println("2. areaUsers :");
        villa.setServicesName(input.nextLine());
        System.out.println("3. priceRent :");
        villa.setServicesName(input.nextLine());
        System.out.println("4. amount :");
        villa.setServicesName(input.nextLine());
        System.out.println("5. brand :");
        villa.setServicesName(input.nextLine());
        System.out.println("6. roomStandard :");
        villa.setServicesName(input.nextLine());
        System.out.println("7. convenientDescribe :");
        villa.setServicesName(input.nextLine());
        System.out.println("8. pool :");
        villa.setServicesName(input.nextLine());
        System.out.println("9. floor :");
        villa.setServicesName(input.nextLine());
        listVilla.add(villa);
        System.out.println("Congratulation !! ");

    }

    public void addHouseInfor() {
        House house = new House();
        Scanner input = new Scanner(System.in);
        System.out.println("1. servicesName :");
        house.setServicesName(input.nextLine());
        System.out.println("2. areaUsers :");
        house.setServicesName(input.nextLine());
        System.out.println("3. priceRent :");
        house.setServicesName(input.nextLine());
        System.out.println("4. amount :");
        house.setServicesName(input.nextLine());
        System.out.println("5. brand :");
        house.setServicesName(input.nextLine());
        System.out.println("6. roomStandard :");
        house.setServicesName(input.nextLine());
        System.out.println("7. convenientDescribe :");
        house.setServicesName(input.nextLine());
        System.out.println("8. pool :");
        house.setServicesName(input.nextLine());
        listHouse.add(house);
        System.out.println("Congratulation !! ");

    }

    public void addRoomInfor() {
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

    }

    public  void showServices() {
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
                for (int i =0; i<listVilla.size(); i++){
                    System.out.println(listVilla.get(i));
                }

        }
    }

    public static void main(String[] args) {

    }

}
