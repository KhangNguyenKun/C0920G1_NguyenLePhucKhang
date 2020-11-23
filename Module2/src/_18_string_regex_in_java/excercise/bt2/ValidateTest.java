package _18_string_regex_in_java.excercise.bt2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  ValidateTest{
    private static final String REGEX = "[0-9]{2} + (0) +[0-9]{9}";

    public ValidateTest(){

    }
    public boolean validatePhone(String number){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();

    }

}
