package Problems;

import java.util.Stack;

public class MinimumInsertionstoBalanceParenthesesString {
    public static void main(String[] args) {
        System.out.println(minInsertions("(()))(()))()())))"));
    }
    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            char ch = s.charAt(i);
            if(ch == ')'){
                stack.push(ch);
            }
            else if(ch == '('){
                int temp = 2;
                for (int j = 0; j < 2; j++) {
                    if(!stack.isEmpty() && stack.peek() == ')'){
                        stack.pop();
                        temp--;
                    }else{
                        break;
                    }
                }
                ans += temp;
            }
        }
        ans += stack.size()/2;
        return ans;
    }
}
