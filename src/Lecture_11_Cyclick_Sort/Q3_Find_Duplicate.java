package Lecture_11_Cyclick_Sort;
//https://leetcode.com/problems/find-the-duplicate-number/
import static Helper_Function.Input_Integer_Array.inputArray;

public class Q3_Find_Duplicate {
    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println(findDuplicate(arr));
    }

    class Solution {
     public int findDuplicate(int[] nums) {
        cyclicsort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]-1){
                return nums[i];
            }
        }
        return -1;
     }
     void cyclicsort(int[] arr){
         int i = 0;
         while(i<arr.length){
             int currect = arr[i]-1;
             if(arr[i] != arr[currect]){
                 int temp = arr[i];
                 arr[i] = arr[currect];
                 arr[currect] = temp;
             } else {
                 i++;
             }
         }
     }
 }

        static int findDuplicate(int[] nums){
        boolean [] duplicates = new boolean[nums.length];
        for(int i: nums){
            if(duplicates[i]){
                return i;
            }
            duplicates[i]=true;
        }
        return -1;
    }
}
