package Controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServicesException {


    public boolean checkVilla(String id){
        Pattern pattern = Pattern.compile("(SVVL-)\\d{4}");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public boolean checkHouse(String id){
        Pattern pattern = Pattern.compile("(SVHO-)\\d{4}");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public boolean checkRoom(String id){
        Pattern pattern = Pattern.compile("(SVRO-)\\d{4}");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public boolean checkName(String name) {
        Pattern pattern = Pattern.compile("^([A-Z][a-z]+( [A-Z][a-z]+)*)");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    public boolean checkAreaUser(String area){
        Pattern pattern = Pattern.compile("[3-9][0-9]+");
        Matcher matcher = pattern.matcher(area);
        return matcher.matches();
    }
    public boolean checkPool(String pool){
        Pattern pattern = Pattern.compile("[1-9]{1,3}");
        Matcher matcher = pattern.matcher(pool);
        return matcher.matches();
    }
    public boolean checkAmount(String amount){
        Pattern pattern = Pattern.compile("[1][0-9]?");
        Matcher matcher = pattern.matcher(amount);
        return matcher.matches();
    }
    public boolean checkFloor(String floor){
        Pattern pattern = Pattern.compile("[1-9][0-9]*");
        Matcher matcher = pattern.matcher(floor);
        return matcher.matches();
    }
    public boolean checkBrand(String brand){
        Pattern pattern = Pattern.compile("(Massage)|(Karaoke)|(Food)|(Drink)|(Car)");
        Matcher matcher = pattern.matcher(brand);
        return matcher.matches();
    }
    public boolean checkPrice(String price){
        Pattern pattern = Pattern.compile("[1-9][0-9]+");
        Matcher matcher = pattern.matcher(price);
        return matcher.matches();
    }



}
