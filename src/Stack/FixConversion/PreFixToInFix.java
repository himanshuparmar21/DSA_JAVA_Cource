package Stack.FixConversion;

import java.util.Stack;

public class PreFixToInFix {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("*-A/BC-/AKL");
        Stack<String> stack = new Stack<>();
        for (char ch : s.reverse().toString().toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                stack.push(String.valueOf(ch));
            } else{
                String fir = stack.pop();
                String sec = stack.pop();
                String str = "(" + sec + ch + fir + ")";
                stack.push(str);
            }
        }
        s = new StringBuilder(stack.pop());
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==')'){
                sb.append('(');
            }
            else if(s.charAt(i)=='('){
                sb.append(')');
            }else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
    static String preToInfix(String pre_exp) {
        Stack<String> stack = new Stack<>();

        for (char ch : pre_exp.toCharArray()){
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
