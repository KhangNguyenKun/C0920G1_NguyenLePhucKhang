package _18_string_regex_in_java.practise;

public class EmailExampleTest extends EmailExample  {
    private static EmailExampleTest emailExampleTest;
    private static final String[] valid = new String[] {"kh@gmai.com", "abc@y.com"};
    private static final String[] inValid = new String[] {"@gmail.com", "ac@y..com"};

    public static void main(String[] args) {
        EmailExampleTest emailExampleTest= new EmailExampleTest();
        for (String email : valid){
            boolean isValid = emailExampleTest.validate(email);
            System.out.println("email " + email +"is valid" );
        }
        for (String email: inValid){
            boolean isInvalid = emailExampleTest.validate(email);
            System.out.println("email " + email +"is invalid");
        }
    }
}
