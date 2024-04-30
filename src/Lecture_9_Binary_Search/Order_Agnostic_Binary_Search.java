package Lecture_9_Binary_Search;

import java.util.Scanner;
import static Helper_Function.Input_Integer_Array.inputArray;

public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = inputArray();
        System.out.print("Enter target Element:");
        int target = sc.nextInt();
        System.out.println(orderAgnosticBS(arr,target));
    }
    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start < end){

            int mid = start + (end - start)/2 ;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[mid] < target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(arr[mid] > target){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
