package Lecture_10_Binary_Search_Problem;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q7_Peak_Index {
    public static void main(String[] args) {
        int[] arr = inputArray();
        int ans = binarySearch(arr);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
