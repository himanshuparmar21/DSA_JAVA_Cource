package Stack.FixConversion;

import java.util.Stack;

public class PreFixToPostFix {
    public static void main(String[] args) {
        System.out.println(preToPost("*-A/BC-/AKL"));
    }
    static String preToPost(String pre_exp) {
        Stack<String> stack = new Stack<>();

        int i = pre_exp.length() - 1;
        while (i>=0){
            char ch = pre_exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(String.valueOf(ch));
            }else{
                String f = stack.pop();
                String s = stack.pop();
                stack.push(f + s + ch);
            }
            i--;
        }
        return stack.pop();
    }
}
