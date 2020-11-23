package Controllers;

import Models.Services;
import Models.Villa.Villa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServicesException {


    public boolean checkVilla(String id){
        Pattern pattern = Pattern.compile("[SV] +[VL]+[0-9]{4}");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public boolean checkHouse(String id){
        Pattern pattern = Pattern.compile("[SV] +[HO]+[0-9]{4}");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public boolean checkRoom(String id){
        Pattern pattern = Pattern.compile("[SV] +[RO]+[0-9]{4}");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public boolean checkNameOfService(String service){
        Pattern pattern = Pattern.compile("[A-Z] +");
        Matcher matcher = pattern.matcher(service);
        return matcher.matches();
    }
    public boolean checkAreaUser(String area){
        Pattern pattern = Pattern.compile("[1-100]");
        Matcher matcher = pattern.matcher(area);
        return matcher.matches();
    }
    public boolean checkPool(String pool){
        Pattern pattern = Pattern.compile("[1-9]{1,3}");
        Matcher matcher = pattern.matcher(pool);
        return matcher.matches();
    }
    public boolean checkAmount(String amount){
        Pattern pattern = Pattern.compile("[1-20]");
        Matcher matcher = pattern.matcher(amount);
        return matcher.matches();
    }
    public boolean checkFloor(Integer floor){
        Pattern pattern = Pattern.compile("[1-20]");
        Matcher matcher = pattern.matcher(floor.toString());
        return matcher.matches();
    }



}
