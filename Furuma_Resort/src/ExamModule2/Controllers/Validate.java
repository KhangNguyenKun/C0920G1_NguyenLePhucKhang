package ExamModule2.Controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public boolean checkIdBook(String id) {
        Pattern pattern = Pattern.compile("(STK-)\\d{4}");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public boolean checkDate(String date) {
        Pattern pattern = Pattern.compile("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
                "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3" +
                "(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^" +
                "(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
    public boolean checkTimeShortTerm(String time) {
        Pattern pattern = Pattern.compile("[6|3]");
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }
    public boolean checkTimeLongTerm(String time) {
        Pattern pattern = Pattern.compile("1|3|5|10");
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }
    public boolean checkMoney (String money) {
        Pattern pattern = Pattern.compile("[1-9][0-9]{5,}");
        Matcher matcher = pattern.matcher(money);
        return matcher.matches();
    }

}
