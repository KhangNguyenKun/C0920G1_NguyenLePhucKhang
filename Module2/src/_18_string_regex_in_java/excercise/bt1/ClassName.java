package _18_string_regex_in_java.excercise.bt1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the name of the class");
        String name = input.nextLine();
        Pattern pattern = Pattern.compile("[CAP]+[0-9]{4}+[GHKLM]");
        Matcher matcher = pattern.matcher(name);
        System.out.println(matcher.find());
    }
}
