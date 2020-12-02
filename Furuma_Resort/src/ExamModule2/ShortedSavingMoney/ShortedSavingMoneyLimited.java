package ExamModule2.ShortedSavingMoney;

public class ShortedSavingMoneyLimited {
    private String idBook;
    private String idCustomer;
    private String dateOpenBook;
    private String dateStart;
    private String time;
    private String money;
    private String discount;

    public ShortedSavingMoneyLimited(String idBook, String idCustomer, String dateOpenBook, String dateStart, String time, String money, String discount) {
        this.idBook = idBook;
        this.idCustomer = idCustomer;
        this.dateOpenBook = dateOpenBook;
        this.dateStart = dateStart;
        this.time = time;
        this.money = money;
        this.discount = discount;
    }

    public ShortedSavingMoneyLimited() {
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
        return "ShortedSavingMoneyLimited : " +
                "idBook='" + idBook + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", dateOpenBook='" + dateOpenBook + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", time='" + time + '\'' +
                ", money='" + money + '\'' +
                ", discount='" + discount + '\'' +
                '}';
    }
}
