package Sliding_Window;
// https://leetcode.com/problems/minimum-size-subarray-sum/
public class SmallestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 2, 3, 2};
        System.out.println(SlidingWindow(arr,7));
    }
    public static int BruteForce(int[] arr,int target){
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum>=target){
                    ans = Math.min(ans,(j-i+1));
                }
            }
        }
        return ans;
    }
    public static int SlidingWindow(int[] arr,int target){
        int ans = Integer.MAX_VALUE;
        int sum = 0,start = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            while (sum >= target){
                ans = Math.min(ans,(i-start+1));
                sum -= arr[start++];
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
