package Lecture_8_Linear_Search;

import java.util.Scanner;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q3_Maximum_Minimum_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = inputArray();
        System.out.println("Minimum:" + min(arr));
        System.out.println("Maximum:" + max(arr));
    }

    //Find Minimum Element
    static int min(int[] arr){
        int min = arr[0];

        for(int num : arr){
            if(num < min){
                min = num;
            }
        }

//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
        return min;
    }

    //Find Maximum Element
    static int max(int[] arr){
        int max = arr[0];

        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}
