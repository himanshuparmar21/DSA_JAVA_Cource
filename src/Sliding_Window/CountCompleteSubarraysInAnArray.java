package Sliding_Window;

import java.util.HashMap;
import java.util.HashSet;

// https://leetcode.com/problems/count-complete-subarrays-in-an-array/description/
public class CountCompleteSubarraysInAnArray {
    public static void main(String[] args) {
        int[] nums = {5,5,5,5};
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        System.out.println(SlidingWindow(nums,set.size()));
    }
    public static int SlidingWindow(int[] nums,int k){
        return atMostK(nums,k) - atMostK(nums,k-1);
    }
    public static int atMostK(int[] nums,int k){
        int count = 0;
        int start = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            map.put(temp,map.getOrDefault(temp,0)+1);

            while(map.size() > k){
                temp = nums[start++];
                map.put(temp,map.getOrDefault(temp,0)-1);
                if(map.get(temp) == 0) map.remove(temp);
            }
            count += i-start+1;
        }
        return count;
    }
}
