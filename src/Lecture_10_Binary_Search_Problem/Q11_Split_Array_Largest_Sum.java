package Lecture_10_Binary_Search_Problem;

import java.util.Scanner;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q11_Split_Array_Largest_Sum {
    public static void main(String[] args) {
        int[] arr = inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Max Partition Make:");
        int m = sc.nextInt();

        System.out.println(splitArray(arr,m));
    }
    static int splitArray(int[] nums,int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]); // Loop End Start = Max element in Array
            end += nums[i]; // end = sum of all Element in Array
        }

        ///Binary Search
        while (start < end){

            int mid = start + (end - start) / 2;

//            Calculate how many pieces can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    //Can add this in sum ,make new
                    //then make new subarray and make sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces <= m){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return end; // Start == end
    }
}
