package _18_string_regex_in_java.practise.th2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String REGEX = "^[_a-z0-9]{6,}$";
    public AccountExample(){
    }
    public boolean validate(String regex){
        Pattern pattern=  Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
