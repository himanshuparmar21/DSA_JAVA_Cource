package Lecture_11_Cyclick_Sort;

import java.util.Arrays;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = inputArray();
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
//    Use 0 base index
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length) {
            int current = arr[i] - 1;
            if(arr[i] != arr[current]){
                int temp = arr[current];
                arr[current] = arr[i];
                arr[i] = temp;
            } else{
                i++;
            }
        }
    }

//    Use 1 Base Index
    static void cyclicSort1(int[] arr){
        int i = 1;
        while(i < arr.length) {
            int current = arr[i];
            if(arr[i] != arr[current]){
                int temp = arr[current];
                arr[current] = arr[i];
                arr[i] = temp;
            } else{
                i++;
            }
        }
    }
}
