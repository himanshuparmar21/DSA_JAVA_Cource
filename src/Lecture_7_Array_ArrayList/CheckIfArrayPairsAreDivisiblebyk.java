package Lecture_7_Array_ArrayList;

import java.util.HashMap;

public class CheckIfArrayPairsAreDivisiblebyk {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,6,7,8,9};
        System.out.println(canArrange(arr,5));
    }
    public static boolean canArrange(int[] arr, int k) {
        int[] ans = new int[k];
        for(int num : arr){
            num %= k;
            if(num < 0) num += k;
            ans[num]++;
        }
        if(ans[0]%2 != 0) return false;

        for(int i = 1; i <= k/2; i++)
            if(ans[i] != ans[k-i]) return false;

        return true;
    }
}
