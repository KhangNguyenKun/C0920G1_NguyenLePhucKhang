package _18_string_regex_in_java.practise.th2;

public class AccountExampleTest  {
    private static AccountExampleTest accountExampleTest;
    public  static final String[] validAccount = new String[] {"123abc_" , "2ds2ds" ,"______", "123456","abcdefgh"};
    public  static final String[] invalidAccount = new String[] {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String v:validAccount){
            boolean isValid = accountExample.validate(v);
            System.out.println(isValid);
        }
        for (String v: invalidAccount){
            boolean isInValid= accountExample.validate(v);
            System.out.println(isInValid);
        }

    }
}
