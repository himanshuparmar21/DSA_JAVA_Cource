package Lecture_7_Array_ArrayList;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[]{3,1,-2,-5,2,-4})));
    }
    public static int[] rearrangeArray(int[] nums) {
//        int k = 0;
//        int i = 0;
//        int j = 0;
//        int n = nums.length;
//        int[] ans = new int[n];
//        while (k<n){
//            while(nums[i] < 0){
//                i++;
//            }
//            ans[k++] = nums[i++];
//            while(nums[j] > 0){
//                j++;
//            }
//            ans[k++] = nums[j++];
//        }
//        return ans;
        int n =nums.length;
        int[] ans = new int[n];
        int pos=0;int neg=1;
        for (int num : nums) {
            if (num > 0) {
                ans[pos] = num;
                pos += 2;
            } else {
                ans[neg] = num;
                neg += 2;

            }
        }
        return ans;


    }
}
