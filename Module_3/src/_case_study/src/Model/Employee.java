package Model;

public class Employee {
    private String id;
    private String nameEmployee;
    private String birthDay;
    private String idCard;
    private String salary;
    private String phoneEmployee;
    private String mailEmployee;
    private String addressEmployee;
    private String positionId;
    private String educationDegree;
    private String divisionId;
    private String userNameEmployee;

    public Employee(String id, String nameEmployee, String birthDay, String idCard, String salary, String phoneEmployee,
                    String mailEmployee, String addressEmployee, String positionId, String educationDegree, String divisionId, String userNameEmployee) {
        this.id = id;
        this.nameEmployee = nameEmployee;
        this.birthDay = birthDay;
        this.idCard = idCard;
        this.salary = salary;
        this.phoneEmployee = phoneEmployee;
        this.mailEmployee = mailEmployee;
        this.addressEmployee = addressEmployee;
        this.positionId = positionId;
        this.educationDegree = educationDegree;
        this.divisionId = divisionId;
        this.userNameEmployee = userNameEmployee;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(String phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }

    public String getMailEmployee() {
        return mailEmployee;
    }

    public void setMailEmployee(String mailEmployee) {
        this.mailEmployee = mailEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public String getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    public String getUserNameEmployee() {
        return userNameEmployee;
    }

    public void setUserNameEmployee(String userNameEmployee) {
        this.userNameEmployee = userNameEmployee;
    }
}
