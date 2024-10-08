package Stack;

import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings {
    public static void main(String[] args) {
        System.out.println(minLength("ACBBD"));
    }
    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if (ch == 'B' && stack.peek() == 'A') {
                    stack.pop();
                    continue;
                } else if (ch == 'D' && stack.peek() == 'C') {
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }
        return stack.size();
    }
}
