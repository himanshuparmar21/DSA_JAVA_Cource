package Sliding_Window;
// https://leetcode.com/problems/binary-subarrays-with-sum/description/
public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        System.out.println(numSubarraysWithSum(arr,0));
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
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return atMostKsum(nums,goal) - atMostKsum(nums,goal-1);
    }
    public static int atMostKsum(int[] nums,int goal){
        if(goal<0) return 0; // This is Bcz Array Contains only 0,1 That Why Can not Find <0 sum
        int start = 0;
        int ans = 0;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum > goal){
                sum -= nums[start++];
            }
            ans += (i - start + 1);
        }
        return ans;
    }
}
