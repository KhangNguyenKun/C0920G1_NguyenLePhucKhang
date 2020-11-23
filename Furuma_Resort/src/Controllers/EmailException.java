package Controllers;

import Models.Customers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailException {

    public boolean EmailException(String mail){
            Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]+");
            Matcher matcher = pattern.matcher(mail);
            return matcher.matches();
    }
}
