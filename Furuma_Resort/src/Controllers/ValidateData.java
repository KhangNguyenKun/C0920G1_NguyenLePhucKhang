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
//    public static boolean checkGender(String gender) {
//        Pattern pattern = Pattern.compile("^male$|^female$|^unknown");
//        Matcher matcher = pattern.matcher(gender);
//        return matcher.matches();
//    }
}
