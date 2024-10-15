package Problems;

import java.util.PriorityQueue;

public class MinimumOperationstoHalveArraySum {
    public static void main(String[] args) {
        System.out.println(halveArray(new int[]{5,19,8,1}));
    }
    public static int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Double::compare);
        int ans = 0;
        Double sum = 0.0;
        for (int num : nums){
            pq.add((double)num);
            sum += num;
        }

        double temp = sum;
        while (temp > (sum/2)){
            ans++;
            double num = pq.poll();
            temp -= num;
            temp += (num/2.0);
            pq.add(num/2.0);
        }
        return ans;
    }
}
