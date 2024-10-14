package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructtheMinimumBitwiseArrayII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minBitwiseArray(new ArrayList<>(List.of(0, 3, 5, 7)))));
    }
    public static int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];

        for(int i=0;i<nums.size();i++){
            int temp = -1;
            for(int j=0;j<nums.get(i);j++){
                if((j | (j + 1)) == nums.get(i)){
                    temp = j;
                    break;
                }
            }
            ans[i] = temp;
        }
        return ans;
    }
}