package _3_Array_and_function_in_java.practise.th4;

import java.util.Scanner;

public class temperature {
    //Bước 1: Xây dựng phương thức chuyển đổi từ độ C sang độ F
    public static double changeFtoC(double fa) {
        double cel;
        cel = (5.0 / 9) * (fa - 32);
        return cel;
    }

    //Bước 2: Xây dựng phương thức chuyển đổi từ độ F sang độ C
    public static double changeCtoF(double cel) {
        double fa;
        fa = (5.0 / 9) / cel + 32;
        return fa;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fa;
        double cel;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("Celcius to Fah");
            System.out.println("Fah to Celcius");
            System.out.println("Exit ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Cel :");
                    cel = scanner.nextDouble();
                    System.out.println(changeCtoF(cel));
                    break;
                case 2:
                    System.out.println("Enter Fah : ");
                    fa = scanner.nextDouble();
                    System.out.println(changeFtoC(fa));
                    break;
                case 3:
                    System.exit(0);
            }
        }
        while (choice != 0);
    }
}
