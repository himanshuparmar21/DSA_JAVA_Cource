package Problems;
// https://leetcode.com/problems/maximum-width-ramp/
import java.util.Stack;

public class MaximumWidthRamp {
    public static void main(String[] args) {
        System.out.println(maxWidthRamp(new int[]{9,8,1,0,1,9,4,0,4,1}));
    }
    public static int maxWidthRamp(int[] nums) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }
        for (int j = nums.length - 1; j >= 0; --j) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                ans = Math.max(ans, j - stack.pop());
            }
        }
        return ans;
    }
}
