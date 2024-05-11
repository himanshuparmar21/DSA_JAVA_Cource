package Lecture_10_Binary_Search_Problem;

import java.util.Scanner;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q1_Ceiling_Number {
    public static void main(String[] args) {
        int[] arr = inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target Element:");
        int target = sc.nextInt();

        int ans = ceinigNum(arr, target);
        System.out.println(ans);
    }

//    Return Smallest Number >= target
    static int ceinigNum(int[] arr, int target) {

//        But What if the target is greater than the greatest number in the array
        if(target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == start) {
                return arr[mid];
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
