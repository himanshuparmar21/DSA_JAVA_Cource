package Problems;

import java.util.Stack;

// https://leetcode.com/problems/parsing-a-boolean-expression/description/
public class ParsingABooleanExpression {
    public static void main(String[] args) {
        System.out.println(parseBoolExpr("!(f,f,f,t)"));
    }
    public static boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()){
            if(ch == ',' || ch == '(') continue;
            if(ch == '|' || ch == '&' || ch == '!' || ch == 'f' || ch == 't'){
                stack.push(ch);
            }else if (ch == ')'){
                boolean True = false,False = false;

                while (stack.peek() != '|' && stack.peek() != '!' && stack.peek() != '&'){
                    char temp = stack.pop();
                    if(temp == 't') True = true;
                    if(temp == 'f') False = true;
                }
                char op = stack.pop();
                if(op == '!'){
                    stack.push(True ? 't' : 'f');
                }else if(op == '&'){
                    stack.push(False ? 't' : 'f');
                }else{
                    stack.push(True ? 't' : 'f');
                }
            }
        }
        return stack.peek() == 't';
    }
}
