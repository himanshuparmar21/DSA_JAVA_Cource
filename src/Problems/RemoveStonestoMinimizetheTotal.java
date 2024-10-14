package Problems;
// https://leetcode.com/problems/remove-stones-to-minimize-the-total/
import java.util.PriorityQueue;

public class RemoveStonestoMinimizetheTotal {
    public static void main(String[] args) {
        System.out.println(minStoneSum(new int[]{4,3,6,7},3));
    }
    public static int minStoneSum(int[] piles, int k) {
        //This is Sort array into Decreasing Order
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        //Add Element in Priority Queue
        for (int pile : piles){
            pq.add(pile);
        }
        //This is Minimize Queue
        while (k-- > 0){
            int temp = pq.poll();
            pq.add((temp - (int) Math.floor(temp / 2.0)));
        }

        int ans = 0;
        for (int pile : pq){
            ans += pile;
        }
        return ans;
    }
}
