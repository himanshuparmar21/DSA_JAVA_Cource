package Lecture_11_Cyclick_Sort;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q1_Missing_Number {
    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println(missingNumberWithoutSorting(arr));
        cyclicSort(arr);
        System.out.println(missingNumber(arr));
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int current = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[current]){
                int temp = arr[current];
                arr[current] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
    static int missingNumber(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(i!=arr[i]){
                return i;
            }
        }
        return arr.length;
    }



    static int missingNumberWithoutSorting(int[] arr) {
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans ^= (i^arr[i]);
        }
        return ans^arr.length;
    }

}
