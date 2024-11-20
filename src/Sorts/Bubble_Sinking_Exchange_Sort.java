package Sorts;

import java.util.Arrays;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Bubble_Sinking_Exchange_Sort {
    public static void main(String[] args) {
        int[] arr = inputArray();
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean pass ;
        for (int i = 0; i < arr.length; i++) {
            pass = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    pass = true;
                }
            }
            if(!pass){
                return ;
            }
        }
    }
}
