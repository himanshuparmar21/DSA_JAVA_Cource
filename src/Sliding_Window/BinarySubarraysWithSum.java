package Sliding_Window;
// https://leetcode.com/problems/binary-subarrays-with-sum/description/
public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        System.out.println(SlidingWindow(arr,0));
    }
    public static int BruteForce(int[] nums, int goal) {
        int count = 0;

        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum==goal){
                    count++;
                }
            }
        }
        return count;
    }
    public static int SlidingWindow(int[] nums,int goal){
        int start = 0;

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            if (sum == goal) count++;

            while (sum > goal) {
                sum -= nums[start++];
            }
        }
        return count;
    }
}
