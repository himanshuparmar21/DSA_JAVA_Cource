package Problems;
// https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k
import java.util.HashMap;

public class MaximumSumofDistinctSubarraysWithLengthK {
    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{1,5,4,2,9,9,9},3));
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        int i = 0;
        int start = 0;

        while (i < nums.length){
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            if(i >= k-1){
                if(map.size() == k){
                    ans = Math.max(ans,sum);
                }
                map.put(nums[start], map.getOrDefault(nums[start],0) - 1);
                if(map.get(nums[start]) <= 0){
                    map.remove(nums[start]);
                }
                sum -= nums[start];
                start++;
            }
            i++;
        }
        return ans;
    }
}
