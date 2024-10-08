package Problems;
// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/description/
import java.util.Stack;

public class MinimumNumberofSwapstoMaketheStringBalanced {
    public static void main(String[] args) {
        System.out.println(minSwaps("]]][[["));
    }
    public static int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if(ch==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            if(ch=='['){
                stack.push(ch);
            }
        }
        return stack.size()%2==0?stack.size()/2:(stack.size()+1)/2;
    }
}
