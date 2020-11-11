package Models;

public abstract class Services {
    private String servicesName;
    private String areaUsers;
    private String priceRent;
    private String amount;
    private String brand;

    public Services(String servicesName, String areaUsers, String priceRent, String amount, String brand) {
        this.servicesName = servicesName;
        this.areaUsers = areaUsers;
        this.priceRent = priceRent;
        this.amount = amount;
        this.brand = brand;
    }

    public Services() {
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public String getAreaUsers() {
        return areaUsers;
    }

    public void setAreaUsers(String areaUsers) {
        this.areaUsers = areaUsers;
    }

    public String getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(String priceRent) {
        this.priceRent = priceRent;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Services{" +
                "servicesName='" + servicesName + '\'' +
                ", areaUsers='" + areaUsers + '\'' +
                ", priceRent='" + priceRent + '\'' +
                ", amount='" + amount + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public abstract void showInfor();
}
