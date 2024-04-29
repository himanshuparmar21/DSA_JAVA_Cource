package Lecture_8_Linear_Search;

import java.util.Arrays;
import java.util.Scanner;

import static Helper_Function.Input_2D_Integer_Array.inputTwoDArray;

public class Q4_Search_in_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = inputTwoDArray();
        System.out.print("Enter Target Element:");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(find(arr, target)));
    }
    static int[] find(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
