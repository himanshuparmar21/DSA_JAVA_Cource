package Lecture_8_Linear_Search;
//https://leetcode.com/problems/richest-customer-wealth/description/
import static Helper_Function.Input_2D_Integer_Array.inputTwoDArray;

public class Q6_Max_Wealth {
    public static void main(String[] args) {
        int[][] arr = inputTwoDArray();
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] arr) {
        int max = 0;
        for (int[] num : arr) {
            int sum = 0;
            for (int j = 0; j < num.length; j++) {
                sum += num[j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
