package Lecture_11_Cyclick_Sort;

import java.util.ArrayList;
import java.util.List;

import static Helper_Function.Input_Integer_Array.inputArray;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class Q2_Find_All_Missing_Number {
    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println(findDisappearedNumbers(arr));;
    }
    static List<Integer> findDisappearedNumbers(int[] arr) {
        cyclicSort(arr);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i!=arr[i]-1){
                list.add(i+1);
            }
        }
        return list;
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int current = arr[i] - 1;
            if(arr[i] != arr[current]){
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            } else {
                i++;
            }
        }
    }
}
