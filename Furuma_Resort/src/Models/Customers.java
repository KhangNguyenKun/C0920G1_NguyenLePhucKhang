package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customers implements Comparable<Customers> {
    private String idCustomer;
    private String nameCustomer;
    private String birthDay;
    private String gender;
    private String id;
    private String phoneNumber;
    private String mail;
    private String kindOfCustomer;
    private String address;
    Services services ;

//    public Customers(String idCustomer,String nameCustomer, String birthDay, String gender, String id, String phoneNumber, String mail,
//                     String kindOfCustomer, String address, Services services) {
//    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Customers(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getKindOfCustomer() {
        return kindOfCustomer;
    }

    public void setKindOfCustomer(String kindOfCustomer) {
        this.kindOfCustomer = kindOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Customers(String idCustomer, String nameCustomer, String birthDay, String gender, String id, String phoneNumber,
                     String mail, String kindOfCustomer, String address, Services services) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.kindOfCustomer = kindOfCustomer;
        this.address = address;
        this.services = services;
    }

    public Customers(String idCustomer, String nameCustomer, String birthDay, String gender, String id, String phoneNumber, String mail, String kindOfCustomer, String address) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.kindOfCustomer = kindOfCustomer;
        this.address = address;
    }

    public Customers() {
    }


    @Override
    public String toString() {
        return "Customers : " +
                " idCustomer='" + idCustomer + '\'' +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mail='" + mail + '\'' +
                ", kindOfCustomer='" + kindOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", services=" + services +
                " ";
    }

    public void showInfor(){

    }

    @Override
    public int compareTo(Customers o) {
        return this.nameCustomer.compareTo(o.getNameCustomer());
    }
}
