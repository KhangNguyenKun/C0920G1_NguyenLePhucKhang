package Controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenderException {

    boolean check = true;
    public void checkGender(String gender){
        if (check = true){
            Pattern pattern = Pattern.compile("(MALE)(FEMALE)(UNKNOWN)");
            Matcher matcher = pattern.matcher(gender);
                }
    }

}
