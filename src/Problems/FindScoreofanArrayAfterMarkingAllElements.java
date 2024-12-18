package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class FindScoreofanArrayAfterMarkingAllElements {
    public static void main(String[] args) {
        System.out.println(findScore(new int[]{2, 3, 5, 1, 3, 2}));
    }

    public static long findScore(int[] nums) {
        long score = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            pq.add(val);
            if (!map.containsKey(val)) {
                map.put(val, new ArrayList<>());
            }
            map.get(val).add(i);
        }
        while (!pq.isEmpty()) {
            int num = pq.poll();
            if (!map.containsKey(num)) continue;

            ArrayList<Integer> indices = map.get(num);
            for (int index : indices) {
                if (nums[index] != -1) {
                    score += nums[index];
                    nums[index] = -1;
                    if (index - 1 >= 0 && nums[index - 1] != -1) nums[index - 1] = -1;
                    if (index + 1 < nums.length && nums[index + 1] != -1) nums[index + 1] = -1;
                }
            }
            map.remove(num);
        }
        return score;
    }
}
