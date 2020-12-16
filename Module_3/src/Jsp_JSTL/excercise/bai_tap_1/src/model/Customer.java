package model;

public class Customer {
    private String name;
    private String id;
    private int age;
    private String address;
    private String gender;

    public Customer(String name, String id, int age, String address, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }


    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
