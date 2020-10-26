package _1_introducion_to_java.practise.th3;
import java.util.Scanner;

public class RectangleProgramming {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner rec = new Scanner(System.in);
        System.out.println("Enter the width :");
        width = rec.nextFloat();
        System.out.println("Enter the height :");
        height = rec.nextFloat();
        float area = width * height;
        System.out.println(area);
    }
}
