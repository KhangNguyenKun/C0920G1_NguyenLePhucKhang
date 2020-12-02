package ExamModule2.Customers;

public class Customers {
    private String idCustomer;
    private String nameOfCustomer;
    private String dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String address;

    public Customers(String idCustomer, String nameOfCustomer, String dateOfBirth, String gender, String phoneNumber, String address) {
        this.idCustomer = idCustomer;
        this.nameOfCustomer = nameOfCustomer;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Customers() {
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customers :" +
                "idCustomer='" + idCustomer + '\'' +
                ", nameOfCustomer='" + nameOfCustomer + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' ;
    }
}
