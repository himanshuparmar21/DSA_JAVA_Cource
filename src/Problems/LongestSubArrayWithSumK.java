package Problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    //Brute Force
    public int subarraySum1(int[] nums, int k) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                long s = 0;
                for (int K = i; K <= j; K++) {
                    s += nums[K];
                }

                if (s == k)
                    ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }
    public int subarraySum(int[] nums,int k){
        int n = nums.length;
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            long rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        subarraySum2(arr,0);
    }
    public static int subarraySum2(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
