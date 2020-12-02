package ExamModule2.Controllers;

import ExamModule2.Customers.Customers;
import ExamModule2.Function.*;
import ExamModule2.LongTermSavingMoney.LongSavingMoneyLimited;
import ExamModule2.ShortedSavingMoney.ShortedSavingMoneyLimited;
import ExamModule2.ShortedSavingMoney.ShortedSavingMoneyUnlimited;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình quản lý sinh viên ");
        System.out.println("Chọn chức năng theo số để tiếp tục :");
        System.out.println("1. Thêm mới sổ tiết kiệm ");
        System.out.println("2. Xóa sổ tiết kiệm ");
        System.out.println("3. Xem danh sách sổ tiết kiệm ");
        System.out.println("4. Xem thông tin khách hàng ");
        System.out.println("5. Tìm kiếm sổ tiết kiệm ");
        System.out.println("6. Thoát  ");
        System.out.println("Chọn chức năng : ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                addNewBook();
                break;
            case 2:

                        deleteLongTermBook();

                        break;
            case 6:
                deleteShortTermBook();
                break;
            case 3:
                showLongTermBooks();
                showShortTermBooks();
                break;
            case 4:
                showCustomer();
                break;

            case 5:
        }

    }

    public void addNewBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which kind of saving do you want  ??? ");
        System.out.println("1 . Short Term");
        System.out.println("2 . Long Term");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Do you want : 1.limited or 2.unlimited?");
                int numberLimit = scanner.nextInt();
                switch (numberLimit) {
                    case 1:
                        ShortedSavingMoneyLimited shortedSavingMoneyLimited = new ShortedSavingMoneyLimited();
                        boolean checkIdBook = false;
                        do {
                            System.out.println("Enter your id of your book ");
                            String idBook = scanner.nextLine();
                            Validate validate = new Validate();
                            if (!validate.checkIdBook(idBook)) {
                                System.out.println("Wrong format !!!");
                            } else {
                                shortedSavingMoneyLimited.setIdBook(idBook);
                                checkIdBook = true;
                            }
                        } while (!checkIdBook);
                        boolean checkIdCustomer = false;
                        System.out.println("Enter your id  ");
                        String id = scanner.nextLine();
                        System.out.println("Wrong format !!!");
                        shortedSavingMoneyLimited.setIdCustomer(id);
                        boolean checkDateOpen = false;
                        do {
                            System.out.println("Enter the time when you want to open your book?? ");
                            String timeOpen = scanner.nextLine();
                            Validate validate = new Validate();
                            if (!validate.checkDate(timeOpen)) {
                                System.out.println("Wrong format !!!");
                            } else {
                                shortedSavingMoneyLimited.setDateOpenBook(timeOpen);
                                checkDateOpen = true;
                            }
                        } while (!checkDateOpen);
                        boolean checkDateStart = false;
                        do {
                            System.out.println("Enter your day when you want to send us money ");
                            String timeStart = scanner.nextLine();
                            Validate validate = new Validate();
                            if (!validate.checkDate(timeStart)) {
                                System.out.println("Wrong format !!!");
                            } else {
                                shortedSavingMoneyLimited.setDateStart(timeStart);
                                checkDateStart = true;
                            }
                        } while (!checkDateStart);
                        boolean checkTime = false;
                        do {
                            System.out.println("Enter how long do you want to save ");
                            String time = scanner.nextLine();
                            Validate validate = new Validate();
                            if (!validate.checkTimeLongTerm(time)) {
                                System.out.println("Wrong format !!!");
                            } else {
                                shortedSavingMoneyLimited.setTime(time);
                                checkTime = true;
                            }
                        } while (!checkTime);
                        boolean checkMoney = false;
                        do {
                            System.out.println("Enter your money ");
                            String money = scanner.nextLine();
                            Validate validate = new Validate();
                            if (!validate.checkMoney(money)) {
                                System.out.println("Wrong format !!!");
                            } else {
                                shortedSavingMoneyLimited.setMoney(money);
                                checkMoney = true;
                            }
                        } while (!checkMoney);
                        System.out.println("Enter your discount ");
                        String discount = scanner.nextLine();
                        shortedSavingMoneyLimited.setDiscount(discount);
                        break;
                    case 2:
                        ShortedSavingMoneyUnlimited shortedSavingMoneyUnlimited = new ShortedSavingMoneyUnlimited();

                        break;
                }
                break;
            case 2:
                LongSavingMoneyLimited longTermSavingMoney = new LongSavingMoneyLimited();
//                String idBook, String idCustomer, String dateOpenBook, String dateStart,
//                    String time, String money, String discount, String convenient
                boolean checkIdBook = false;
                do {
                    System.out.println("Enter your id of your book ");
                    String idBook = scanner.nextLine();
                    Validate validate = new Validate();
                    if (!validate.checkIdBook(idBook)) {
                        System.out.println("Wrong format !!!");
                    } else {
                        longTermSavingMoney.setIdBook(idBook);
                        checkIdBook = true;
                    }
                } while (!checkIdBook);
                boolean checkIdCustomer = false;
                System.out.println("Enter your id  ");
                String id = scanner.nextLine();
                longTermSavingMoney.setIdCustomer(id);
                boolean checkDateOpen = false;
                do {
                    System.out.println("Enter the time when you want to open your book?? ");
                    String timeOpen = scanner.nextLine();
                    Validate validate = new Validate();
                    if (!validate.checkDate(timeOpen)) {
                        System.out.println("Wrong format !!!");
                    } else {
                        longTermSavingMoney.setDateOpenBook(timeOpen);
                        checkDateOpen = true;
                    }
                } while (!checkDateOpen);
                boolean checkDateStart = false;
                do {
                    System.out.println("Enter your day when you want to send us money ");
                    String timeStart = scanner.nextLine();
                    Validate validate = new Validate();
                    if (!validate.checkDate(timeStart)) {
                        System.out.println("Wrong format !!!");
                    } else {
                        longTermSavingMoney.setDateStart(timeStart);
                        checkDateStart = true;
                    }
                } while (!checkDateStart);
                boolean checkTime = false;
                do {
                    System.out.println("Enter how long do you want to save ");
                    String time = scanner.nextLine();
                    Validate validate = new Validate();
                    if (!validate.checkTimeLongTerm(time)) {
                        System.out.println("Wrong format !!!");
                    } else {
                        longTermSavingMoney.setTime(time);
                        checkTime = true;
                    }
                } while (!checkTime);
                boolean checkMoney = false;
                do {
                    System.out.println("Enter your money ");
                    String money = scanner.nextLine();
                    Validate validate = new Validate();
                    if (!validate.checkMoney(money)) {
                        System.out.println("Wrong format !!!");
                    } else {
                        longTermSavingMoney.setMoney(money);
                        checkMoney = true;
                    }
                } while (!checkMoney);

                System.out.println("Enter your discount ");
                String discount = scanner.nextLine();
                longTermSavingMoney.setDiscount(discount);
                System.out.println("Enter your convenient ");
                String convenient = scanner.nextLine();
                longTermSavingMoney.setConvenient(convenient);
                ReaderWriterBook readerWriterBook = new ReaderWriterBook();
                readerWriterBook.writerLongTerm(longTermSavingMoney);
                break;
        }
    }

    public void deleteLongTermBook() {
        List<LongSavingMoneyLimited> longTermSavingMoneyList = new ArrayList<>();
        DeleteLongTermBook deleteLongTermBook = new DeleteLongTermBook();
        longTermSavingMoneyList = deleteLongTermBook.listAfterDelete();
        for (LongSavingMoneyLimited l : longTermSavingMoneyList) {
            System.out.println(l + "\n");
        }
        WriteLongTermToCsv writeLongTermToCsv = new WriteLongTermToCsv();
        writeLongTermToCsv.writeCsv(longTermSavingMoneyList);
    }

    public void deleteShortTermBook() {
        List<ShortedSavingMoneyLimited> shortedSavingMoneyLimitedList = new ArrayList<>();
        DeleteShortTermBook deleteShortTermBook = new DeleteShortTermBook();
        shortedSavingMoneyLimitedList = deleteShortTermBook.listAfterDelete();
        for (ShortedSavingMoneyLimited l : shortedSavingMoneyLimitedList) {
            System.out.println(l + "\n");
        }
        WriteShortTermToCsv writeShortTermToCsv = new WriteShortTermToCsv();
        writeShortTermToCsv.writeCsv(shortedSavingMoneyLimitedList);

    }

    public void showLongTermBooks() {
        List<LongSavingMoneyLimited> readerList = new ArrayList<>();
        ReaderWriterBook readerWriterBook = new ReaderWriterBook();
        readerList = readerWriterBook.readerList();
        for (LongSavingMoneyLimited l : readerList) {
            System.out.println(l);
        }
    }

    public void showShortTermBooks() {
        List<ShortedSavingMoneyLimited> readerList = new ArrayList<>();
        ReaderWriterShortTerm readerWriterShortTerm = new ReaderWriterShortTerm();
        readerList = readerWriterShortTerm.readerList();
        for (ShortedSavingMoneyLimited l : readerList) {
            System.out.println(l);
        }
    }

    public void showCustomer() {
        ReadCustomer readCustomer = new ReadCustomer();
        List<Customers> customersList = new ArrayList<>();
        customersList = readCustomer.readCustomer();
        for (Customers c : customersList) {
            System.out.println(c);
        }
    }
    public void searchBook(){
        System.out.println("Your book is in long term or short term?");
        System.out.println("");
    }

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.displayMenu();
    }

}
