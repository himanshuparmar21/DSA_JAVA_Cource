package Problems;

import java.util.Stack;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
public class MinimumAddtoMakeParenthesesValid {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("((("));
    }
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if(ch==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            if(ch == '('){
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
