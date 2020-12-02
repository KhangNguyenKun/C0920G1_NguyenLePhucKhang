package ExamModule2.LongTermSavingMoney;

public class LongSavingMoneyLimited {
    private String idBook;
    private String idCustomer;
    private String dateOpenBook;
    private String dateStart;
    private String time;
    private String money;
    private String discount;
    private String convenient;

    public LongSavingMoneyLimited(String idBook, String idCustomer, String dateOpenBook, String dateStart,
                                  String time, String money, String discount, String convenient) {
        this.idBook = idBook;
        this.idCustomer = idCustomer;
        this.dateOpenBook = dateOpenBook;
        this.dateStart = dateStart;
        this.time = time;
        this.money = money;
        this.discount = discount;
        this.convenient = convenient;
    }

    public LongSavingMoneyLimited() {
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

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    @Override
    public String toString() {
        return "LongTermSavingMoney :" +
                "idBook='" + idBook + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", dateOpenBook='" + dateOpenBook + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", time='" + time + '\'' +
                ", money='" + money + '\'' +
                ", discount='" + discount + '\'' +
                ", convenient='" + convenient + '\''
                ;
    }
}
