package Models;

public class Tickets {
    private String nameOfCustomer;
    private String nameOfMovie;
    private String priceOfMovie;
    private String seat;
    private String time;

    public Tickets(String nameOfCustomer, String nameOfMovie, String priceOfMovie, String seat, String time) {
        this.nameOfCustomer = nameOfCustomer;
        this.nameOfMovie = nameOfMovie;
        this.priceOfMovie = priceOfMovie;
        this.seat = seat;
        this.time = time;
    }

    public Tickets() {

    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getNameOfMovie() {
        return nameOfMovie;
    }

    public void setNameOfMovie(String nameOfMovie) {
        this.nameOfMovie = nameOfMovie;
    }

    public String getPriceOfMovie() {
        return priceOfMovie;
    }

    public void setPriceOfMovie(String priceOfMovie) {
        this.priceOfMovie = priceOfMovie;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Tickets :" +
                "nameOfCustomer='" + nameOfCustomer + '\'' +
                ", nameOfMovie='" + nameOfMovie + '\'' +
                ", priceOfMovie='" + priceOfMovie + '\'' +
                ", seat='" + seat + '\'' +
                ", time='" + time + '\''
                ;
    }
}
