package _18_string_regex_in_java.excercise.bt2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input your number :");
        String phone= input.nextLine();
        ValidateTest validateTest = new ValidateTest();
        System.out.println(validateTest.validatePhone(phone));

    }
}
