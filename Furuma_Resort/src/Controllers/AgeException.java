package Controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgeException {
    public boolean checkAge(String age){
        Pattern pattern = Pattern.compile("^([1-9]|[1-2][0-9]|(30)|(31))\\/([1-9]|(1)[0-2])\\/((19)[0-9][0-9]|(200)[0-2])$");
        Matcher matcher = pattern.matcher(age);
        return matcher.matches();
    }
}
