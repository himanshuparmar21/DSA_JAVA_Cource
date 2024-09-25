package Sliding_Window;

import java.util.HashMap;
// https://leetcode.com/problems/subarrays-with-k-different-integers/
public class SubarraysWithKDifferentIntegers {
    public static void main(String[] args) {
        System.out.println(atMostK(new int[]{1,2,3},2)-atMostK(new int[]{1,2,3},1));
    }
    public static int atMostK(int[] nums, int k) {
        int start = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int end = 0; end < nums.length; end++) {
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
            while (map.size() > k) {
                map.put(nums[start], map.get(nums[start]) - 1);
                if (map.get(nums[start]) == 0) {
                    map.remove(nums[start]);
                }
                start++;
            }
            count += (end - start + 1);
        }

        return count;
    }
}
