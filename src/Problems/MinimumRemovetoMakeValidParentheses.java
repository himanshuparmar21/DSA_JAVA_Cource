package Problems;
// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses {
    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("lee(t(c)ode"));
    }
    public static String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                stack.push(i);
            } else if (sb.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    sb.setCharAt(i, '*');
                }
            }
        }

        while (!stack.isEmpty()) {
            sb.setCharAt(stack.pop(), '*');
        }

        return sb.toString().replaceAll("\\*", "");
    }
}
