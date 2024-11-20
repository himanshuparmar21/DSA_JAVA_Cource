package Sorts;

import java.util.Arrays;

import static Helper_Function.Input_Integer_Array.inputArray;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = inputArray();
        int max = maximum(arr);
        int[] newArr = new int[max + 1];

        for (int num : arr){
            newArr[num]++;
        }

        int idx = 0;
        for (int i = 0; i <= max; i++) {
            while (newArr[i] > 0){
                arr[idx++] = i;
                newArr[i]--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static int maximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int num : arr){
            max = Math.max(num,max);
        }
        return max;
    }
}

// Non Comparing Sorting Algorithm
// Good For Small Numbers
// arr = [3,4,1,3,2,5,2]
// Step 1: Find The largest Number for Array [large=5]
// Step 2: Array Size = large + 1
// Step 3: iterate arr and newArr[arr[i]]++
// Step 4: iterate newArr and Insert every element until newArr element not 0
// *Note: We can also use hashMap instead of new array