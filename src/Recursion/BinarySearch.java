package Recursion;

import java.util.Scanner;

import static Helper_Function.Input_Integer_Array.inputArray;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target Element:");
        int target = sc.nextInt();

        System.out.println(BS(arr, target, 0, arr.length));
    }

    static int BS(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return BS(arr, target, start, mid - 1);
        }
        return BS(arr, target, mid + 1, end);
    }
}
