package Lecture_11_Cyclick_Sort;

import java.util.Arrays;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q5_SetMit_match {
    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] nums) {
        // cyclic sort

        int i=0;
        while (i < nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        for (int j=0; j< nums.length; j++){
            if (nums[j] != j+1){
                return new int[] {nums[j], j+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap (int[] nums , int a, int b){
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}
