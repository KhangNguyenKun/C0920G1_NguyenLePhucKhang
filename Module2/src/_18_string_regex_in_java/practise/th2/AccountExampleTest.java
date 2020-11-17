package _18_string_regex_in_java.practise.th2;

public class AccountExampleTest extends AccountExample {
    private static AccountExampleTest accountExampleTest;
    public  static final String[] validAccount = new String[] {"123abc_" , "2ds2ds" ,"______", "123456","abcdefgh"};
    public  static final String[] invalidAccount = new String[] {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExampleTest accountExampleTest = new AccountExampleTest();
        for (String v:validAccount){
            boolean isValid = accountExampleTest.validate(v);
            System.out.println(isValid);
        }
        for (String v: invalidAccount){
            boolean isInValid= accountExampleTest.validate(v);
            System.out.println(isInValid);
        }

    }
}
