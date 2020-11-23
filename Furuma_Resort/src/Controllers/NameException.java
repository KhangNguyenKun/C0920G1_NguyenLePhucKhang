package Controllers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameException {
    boolean check = false;
    public void checkname(String name){
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("0. Enter your name :");
            name= scanner.nextLine();
            Pattern pattern = Pattern.compile("[0-9]{9}");
            Matcher matcher = pattern.matcher(name);
            check = true;
        }
        while (!check);
    }
}
