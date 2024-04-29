package Lecture_8_Linear_Search;

import static Helper_Function.Input_Integer_Array.inputArray;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class Q5_Even_Digits {
    public static void main(String[] args) {
        int[] arr = inputArray();

        System.out.print(findEvenDigit(arr));
    }

    static int findEvenDigit(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;

        //Solve Using log10 Method
//        for(int i=0; i<nums.length; i++){
//                  int leng = (int)Math.log10(nums[i]) + 1;
//                  if(leng%2 == 0){
//                      count++;
//                  }
//        }
//            for(int num : nums){
//                if(((int)Math.log10(num)+1)%2==0){
//                    count++;
//                }
//            }

    }

    static boolean even(int num){
        int digit = 0;
        while(num > 0){
            digit++;
            num /= 10;
        }
        return digit % 2 == 0;
    }
}
