package Sliding_Window;
// https://leetcode.com/problems/subarray-product-less-than-k/
public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[]{10,5,2,6},100));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0; // Bcz Prob. ask strictly less than k prod means positive number cannot be <=1 prod.
        int ans = 0;
        int start = 0;
        int prod = 1;

        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];

            while (prod >= k){
                prod /= nums[start];
                start++;
            }
            ans += (i-start+1);
        }
        return ans;
    }
}
