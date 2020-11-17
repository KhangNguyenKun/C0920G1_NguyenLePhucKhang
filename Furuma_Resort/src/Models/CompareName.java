package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class CompareName implements Comparator<Customers> {
    @Override
    public int compare(Customers o1, Customers o2) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = null;
        Date date2 = null;
        try{
            date1= f.parse(o1.getBirthDay());
            date2= f.parse(o2.getBirthDay());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int compare= o1.getNameCustomer().compareTo(o2.getNameCustomer());
        if (compare ==0){
            return date1.compareTo(date2);
        }
        else return compare;
    }
}
