package Controllers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameException extends Throwable {

    public NameException(String s) {

    }

    public NameException() {

    }

    public boolean checkName(String name) {
        Pattern pattern = Pattern.compile("^([A-Z][a-z]+( [A-Z][a-z]+)*)");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
