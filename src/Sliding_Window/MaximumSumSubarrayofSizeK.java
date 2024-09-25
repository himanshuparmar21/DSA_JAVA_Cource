package Sliding_Window;

import java.util.Arrays;

// https://leetcode.com/problems/largest-subarray-length-k/
public class MaximumSumSubarrayofSizeK {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 1, 5};
        System.out.println(SlidingWindow(arr,3));
    }
    //This Problem Take O(n2) Approach Time Tu Calculate avg.
    public static int BruteForce(int[] arr,int k){
        int ans = 0;

        for(int i=0;i<arr.length-k+1;i++){
            int sum = 0;

            for (int j = i; j < i+k; j++) {
                sum += arr[j];
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }

    //Using Sliding Window We Cna Solve Above Problem in O(n)
    public static int SlidingWindow(int[] arr,int k){
        int ans = 0;
        int sum = 0;
        int start = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];

            if(i>=k-1){
                ans = Math.max(ans,sum);
                sum -= arr[start++];
            }
        }
        return ans;
    }
}
