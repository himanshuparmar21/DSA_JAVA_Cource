package Sliding_Window;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int start = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max,nums[i]);

            if((i-start+1)==k){
                ans[start++] = max;
                if(nums[start-1] == max) max = Integer.MIN_VALUE;
            }
        }
        return ans;
    }
}
