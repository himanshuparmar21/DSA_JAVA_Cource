package Stack.FixConversion;

import java.util.Stack;

public class PostToPreFix {
    public static void main(String[] args) {
        System.out.println(postToPre("ABC/-AK/L-*"));
    }
    static String postToPre(String post_exp) {
        Stack<String> stack = new Stack<>();

        for (char ch : post_exp.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                stack.push(String.valueOf(ch));
            }else{
                String f = stack.pop();
                String s = stack.pop();
                stack.push(ch + s + f);
            }
        }
        return stack.pop();
    }
}
