package Controllers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {
    public boolean checkID(String id) {
        Pattern pattern = Pattern.compile("[0-9]{9}");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public boolean checkMail(String mail) {
        Pattern pattern = Pattern.compile("[\\w]+@[\\w]+\\.[a-z]{2,4}");
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }

    public static boolean checkGender(String gender) {
        Pattern pattern = Pattern.compile("^male$|^female$|^unknown");
            Matcher matcher = pattern.matcher(gender);
        return matcher.matches();
    }
    public  boolean checkDateOfBirth(String date) {
        Pattern pattern = Pattern.compile("^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)"+
                "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$");
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
    public boolean checkPhone(String phone){
        Pattern pattern = Pattern.compile("(84|0[3|5|7|8|9])+([0-9]{8})\\b");
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

}
