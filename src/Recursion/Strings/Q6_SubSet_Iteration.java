package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

import static Helper_Function.Input_Integer_Array.inputArray;

public class Q6_SubSet_Iteration {
    public static void main(String[] args) {
        int[] arr = inputArray();

        System.out.println(subSet(arr));
    }
    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();

            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
