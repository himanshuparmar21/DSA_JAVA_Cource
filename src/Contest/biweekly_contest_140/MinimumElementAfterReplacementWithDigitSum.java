package Contest.biweekly_contest_140;

public class MinimumElementAfterReplacementWithDigitSum {
    public static void main(String[] args) {
        System.out.println(minElement(new int[]{10,12,13,14}));
    }
    public static int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp = sum(nums[i]);
            ans = Math.min(ans,temp);
            nums[i] = temp;
        }
        return ans;
    }
    public static int sum(int num){
        int sum = 0;
        while (num > 0){
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
}
