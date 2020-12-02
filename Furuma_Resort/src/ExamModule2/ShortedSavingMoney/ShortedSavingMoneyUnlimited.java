package ExamModule2.ShortedSavingMoney;

public class ShortedSavingMoneyUnlimited {
    private String idBook;
    private String idCustomer;
    private String dateOpenBook;
    private String dateStart;
    private String money;
    private String discount;

    public ShortedSavingMoneyUnlimited(String idBook, String idCustomer, String dateOpenBook, String dateStart, String money, String discount) {
        this.idBook = idBook;
        this.idCustomer = idCustomer;
        this.dateOpenBook = dateOpenBook;
        this.dateStart = dateStart;
        this.money = money;
        this.discount = discount;
    }

    public ShortedSavingMoneyUnlimited() {
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getDateOpenBook() {
        return dateOpenBook;
    }

    public void setDateOpenBook(String dateOpenBook) {
        this.dateOpenBook = dateOpenBook;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "ShortedSavingMoneyUnlimited : " +
                "idBook='" + idBook + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", dateOpenBook='" + dateOpenBook + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", money='" + money + '\'' +
                ", discount='" + discount + '\'' +
                '}';
    }
}
