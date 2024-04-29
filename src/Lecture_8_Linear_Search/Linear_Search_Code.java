package Lecture_8_Linear_Search;

import java.util.Scanner;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Linear_Search_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = inputArray();
        System.out.print("Enter target Element:");
        int target = sc.nextInt();
        System.out.println(target + " Found at " + linear_search(arr, target) + " Index");
    }
    static int linear_search(int[] arr,int target){
        if(arr.length<1){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

//Time Complexity
//Best Case:Target Element Fount at First Index : O(1)
//Worst Case:Target Element Not Found in Array : O(n)(Where n is Size of Array)