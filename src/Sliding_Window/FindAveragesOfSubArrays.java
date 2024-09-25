package Sliding_Window;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-average-subarray-i/
public class FindAveragesOfSubArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2};
        System.out.println(Arrays.toString(SlidingWindow(arr,5)));
    }
    //This Problem Take O(n2) Approach Time Tu Calculate avg.
    public static double[] BruteForce(int[] arr,int k){
        double[] ans = new double[arr.length];

        for(int i=0;i<arr.length-k+1;i++){
            double sum = 0;

            for (int j = i; j < i+k; j++) {
                sum += arr[j];
            }
            ans[i] = sum /k;
        }
        return ans;
    }

    //Using Sliding Window We Cna Solve Above Problem in O(n)
    public static double[] SlidingWindow(int[] arr,int k){
        double[] ans = new double[arr.length];
        double sum = 0;
        int start = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];

            if(i>=k-1){
            ans[start] = sum /k;
            sum -= arr[start++];
            }
        }
        return ans;
    }
}
