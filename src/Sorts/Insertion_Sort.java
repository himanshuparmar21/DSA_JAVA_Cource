package Sorts;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
//        int[] arr = inputArray();
        int[] arr = {5,6,3,2,0,10};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int k = i - 1;
            int x = arr[i];
            while(k>=0 && x < arr[k]){
                arr[k+1] = arr[k];
                k--;
            }
            arr[k+1] = x;
        }
    }
}
