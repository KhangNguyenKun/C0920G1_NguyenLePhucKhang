package _11_DSA_stack_queue_in_java.excercise.bt5.ktraDauNgoac;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class bStack {
    public boolean checkBracket(String string){
        Queue<Character> queue = new LinkedList<>();
        boolean check = false;
        for (int i =0 ; i<string.length(); i++){
            queue.add(string.charAt(i));
            if (string.charAt(i) == '('){
                for (int j = i+1; j < string.length(); j++){
                    if (string.charAt(j) == ')'){
                        check = true;
                        break;
                    }
                    else {
                        check = false;
                    }
                }
            }
        }
        return check;


    }

    public static void main(String[] args) {
        bStack bStack = new bStack();
        System.out.println(bStack.toString("(6)-2sdhbs()+2"));
    }

    private boolean toString(String s) {
        return false;
    }
}
