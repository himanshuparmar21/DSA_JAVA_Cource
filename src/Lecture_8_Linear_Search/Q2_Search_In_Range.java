package Lecture_8_Linear_Search;

import java.util.Scanner;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q2_Search_In_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = inputArray();
        System.out.print("Enter target Element:");
        int target = sc.nextInt();
        System.out.print("Enter Start and End Index:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(target + " Found at " + linear_search(arr, target,start,end) + " Index");
    }
    static int linear_search(int[] arr,int target,int start,int end){
        if(arr.length<1){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}
