package Lecture_7_Array_ArrayList;

import java.util.Arrays;

public class MaxNumberofKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{3,1,3,4,3},6));
    }
    public static int maxOperations(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;

        int start = 0;
        int end = n - 1;

        while (start < end){
            int temp = nums[start] + nums[end];
            if(temp==k){
                count++;
                start++;
                end--;
            } else if (temp > k) {
                end--;
            }else {
                start++;
            }
        }
        return count;
    }
}
