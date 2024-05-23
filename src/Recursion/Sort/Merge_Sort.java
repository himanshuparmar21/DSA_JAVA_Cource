package Recursion.Sort;

import java.util.Arrays;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = inputArray();

        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] start,int[] end){
        int[] ans = new int[start.length + end.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < start.length && j < end.length){
            if(start[i] < end[j]){
                ans[k] = start[i];
                i++;
            }else {
                ans[k] = end[j];
                j++;
            }
            k++;
        }

        while(i < start.length){
            ans[k] = start[i];
            i++;
            k++;
        }

        while(j < end.length){
            ans[k] = end[j];
            j++;
            k++;
        }

        return ans;
    }
}
