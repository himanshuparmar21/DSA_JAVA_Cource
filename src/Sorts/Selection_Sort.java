package Sorts;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
//        int[] arr = inputArray();
        int[] arr = {5,3,10,1,0};
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
