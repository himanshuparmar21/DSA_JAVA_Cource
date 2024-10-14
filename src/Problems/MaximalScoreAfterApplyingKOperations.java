package Problems;
// https://leetcode.com/problems/maximal-score-after-applying-k-operations/description/
import java.util.PriorityQueue;

public class MaximalScoreAfterApplyingKOperations {
    public static void main(String[] args) {
        System.out.println(maxKelements(new int[]{1,10,3,3,3},3));
    }
    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int ans = 0;

        for (int num : nums){
            pq.add(num);
        }

        while (k-- > 0){
            int temp = pq.poll();
            ans += temp;
            pq.add((int) (Math.ceil(temp/3.0)));
        }
        return ans;
    }
}
