package Recursion.Part3_Arrays;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q1_Array_Sorted {
    public static void main(String[] args) {
        int[] arr = inputArray();

        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int[] arr,int idx){
        if(idx == arr.length - 1){
            return true;
        }
//        if(arr[idx] > arr[idx + 1]){
//            return false;
//        }
//        return isSorted(arr,idx+1);

        return arr[idx] < arr[idx + 1] && isSorted(arr,idx + 1);
    }
}
