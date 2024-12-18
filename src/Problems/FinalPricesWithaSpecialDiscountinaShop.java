package Problems;

import java.util.Arrays;
// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
public class FinalPricesWithaSpecialDiscountinaShop {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[]{10,1,1,9})));
    }
    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            prices[i] = prices[i] - getMin(i,prices);
        }
        return prices;
    }
    public static int getMin(int i,int[] nums){
        for (int j = i+1; j < nums.length; j++) {
            if(nums[i] >= nums[j]){
                return nums[j];
            }
        }
        return 0;
    }
}
