package Lecture_7_Array_ArrayList;

import java.util.Arrays;

public class Array_In_Function {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        array(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void array(int[] arr){
        arr[2] = 999;
    }
}
//here When Change array in Passing By Function Then Also Change Value in Original Array