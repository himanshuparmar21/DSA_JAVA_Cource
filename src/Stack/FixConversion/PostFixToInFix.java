package Stack.FixConversion;

import java.util.Stack;

public class PostFixToInFix {
    public static void main(String[] args) {
        System.out.println(postToInfix("ab*c+"));
    }
    static String postToInfix(String exp) {
        Stack<String> stack = new Stack<>();

        for (char ch : exp.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                stack.push(String.valueOf(ch));
            } else{
                String fir = stack.pop();
                String sec = stack.pop();
                String s = "(" + sec + ch + fir + ")";
                stack.push(s);
            }
        }
        return stack.pop();
    }
}
