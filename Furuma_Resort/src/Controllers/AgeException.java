package Controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgeException {
    public static final String REGEX_DATE = "^(?:(?:31(\\/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[9]|[2-9]\\d)\\d{2})$";
    public static final String REGEX_EMAIL = "[\\w]+@[\\w]+(.[\\w]{2,4})+";

    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    public String checkAge(String date) {
        while (true) {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
//            Date date1 = new Date();
//            String dateNow = simpleDateFormat.format(date1);
            try {
                if (Pattern.matches(REGEX_DATE, date)) {
                    long currentTime = System.currentTimeMillis();
                    Date date1 = null;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        date1 = simpleDateFormat.parse(date);

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    assert date1 != null;
                    long millisecondsBirth =  date1.getTime();
                    long millisecondsAge = currentTime - millisecondsBirth;
                    long rateMilliToYear = 60*60*24*365;
                    long age = millisecondsAge / (rateMilliToYear * 1000);
                    if (age >= 18){
                        return date;
                    }
                    else {
                        System.out.println("You are under 18, get outta here!!");
                        date = getScanner().nextLine();
                    }
                } else {
                    throw new NameException("Fail. Ex: 20/12/2020. Enter again: ");
                }
            }catch (NameException n){
                System.err.println(n);
                date = getScanner().nextLine();
            }

        }
    }
}
