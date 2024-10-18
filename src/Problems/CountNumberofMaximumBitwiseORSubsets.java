package Problems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/description/
public class CountNumberofMaximumBitwiseORSubsets {
    public static void main(String[] args) {
        System.out.println(countMaxOrSubsets(new int[]{3,1}));
    }
    public static int countMaxOrSubsets(int[] nums) {
        int max = 0;
        int count = 0;

        for(int num : nums){
            max |= num;
        }
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int num : nums){
            int n = outer.size();

            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        for (List<Integer> list : outer){
            int or = 0;
            for(int num : list){
                or |= num;
            }
            if(or == max) count++;
        }
        return count;
    }
}
