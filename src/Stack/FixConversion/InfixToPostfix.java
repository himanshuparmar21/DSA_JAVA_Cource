package Stack.FixConversion;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }
    public static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : exp.toCharArray()){
            if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                sb.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && priority(ch) <= priority(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
    static int priority(char ch){
        if(ch=='^'){
            return 3;
        } else if (ch=='*' || ch=='/') {
            return 2;
        } else if (ch=='+' || ch=='-') {
            return 1;
        }
        return -1;
    }
}
