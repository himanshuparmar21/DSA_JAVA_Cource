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
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int current = arr[i];
            if(current > -1 && arr[i] != arr[current]){
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            } else {
                i++;
            }
        }
    }
}
