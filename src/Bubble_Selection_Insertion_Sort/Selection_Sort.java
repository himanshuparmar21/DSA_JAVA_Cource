package Bubble_Selection_Insertion_Sort;

import java.util.Arrays;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = inputArray();
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            int minvalue = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (minvalue > arr[j]) {
                    minindex = j;
                    minvalue = arr[j];
                }
            }
            if (minindex != i) {
                arr[minindex] = arr[i];
                arr[i] = minvalue;
            }
        }
    }
}
