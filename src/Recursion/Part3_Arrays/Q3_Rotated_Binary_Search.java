package Recursion.Part3_Arrays;

import java.util.Scanner;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q3_Rotated_Binary_Search {
    public static void main(String[] args) {
        int[] arr = inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target:");
        int target = sc.nextInt();

        System.out.println(search(arr,target,0,arr.length));
    }
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }
}
