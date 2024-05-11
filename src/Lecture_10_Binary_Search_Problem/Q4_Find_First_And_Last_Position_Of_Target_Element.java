package Lecture_10_Binary_Search_Problem;

import java.util.Arrays;

public class Q4_Find_First_And_Last_Position_Of_Target_Element {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10,200};
        System.out.println(Arrays.toString(searchRange(arr,20)));
    }
    static int[] searchRange(int[] nums,int target){
        int[] ans = {-1,-1};
        ans[0] = binarySearch(nums,target,true);
        if(ans[0] != -1){
            ans[1] = binarySearch(nums,target,false);
        }

        return ans;
    }
    static int binarySearch(int[] nums,int target,boolean firstSearch){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // answer found
                ans = mid;
                if(firstSearch){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
