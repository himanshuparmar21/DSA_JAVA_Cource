package Lecture_11_Cyclick_Sort;

import java.util.ArrayList;
import java.util.List;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q4_Find_All_Duplicate {
    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        cycleSort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]-1){
                list.add(nums[i]);
            }
        }
        return list;
    }
    static void cycleSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int current = arr[i]-1;
            if(arr[i] != arr[current]){
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            } else {
                i++;
            }
        }
    }
}
