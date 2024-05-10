package Lecture_14_Maths_Bit_Manimpulation;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q2_Find_Unique {
    public static void main(String[] args) {
        int [] arr = inputArray();

        int ans = 0;

        for(int num : arr){
            ans ^= num;
        }

        System.out.println(ans);
    }
}
