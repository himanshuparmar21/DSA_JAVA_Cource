package Lecture_10_Binary_Search_Problem;

import java.util.Scanner;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q2_Floor_Number {
    public static void main(String[] args) {
        int[] arr = inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target Element:");
        int target = sc.nextInt();

        int ans = floorNum(arr, target);
        System.out.println(ans);
    }

//    Return Greatest Number <= target
    static int floorNum(int[] arr, int target) {
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
        return arr[end];
    }
}
