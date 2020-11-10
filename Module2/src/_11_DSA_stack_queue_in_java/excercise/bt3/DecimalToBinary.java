package _11_DSA_stack_queue_in_java.excercise.bt3;

import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Enter to Decimal number: ");
        int num = in.nextInt();
        while (num != 0)
        {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        System.out.print("\n Value of Binary : ");
        while (!(stack.isEmpty() ))
        {
            System.out.print(stack.pop());
        }
    }
}