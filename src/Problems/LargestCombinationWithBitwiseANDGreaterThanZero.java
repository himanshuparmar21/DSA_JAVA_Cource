package Problems;

public class LargestCombinationWithBitwiseANDGreaterThanZero {
    public static int largestCombination(int[] candidates) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int num : candidates){
                if(((num >> i) & 1) == 1){
                    count++;
                }
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}
