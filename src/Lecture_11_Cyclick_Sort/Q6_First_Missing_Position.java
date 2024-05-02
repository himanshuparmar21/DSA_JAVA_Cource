package Lecture_11_Cyclick_Sort;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q6_First_Missing_Position {
    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums) {
        cyclicSort(nums);

        for(int i=1;i<nums.length;i++){
            if(i+1 != nums[i]){
                return i+1;
            }
        }
        return nums.length+1;
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int current = arr[i] - 1;
            if(arr[i] > -1 && arr[i] <= arr.length && arr[i] != arr[current]){
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            } else {
                i++;
            }
        }
    }
}
