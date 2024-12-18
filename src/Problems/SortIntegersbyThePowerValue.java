package Problems;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortIntegersbyThePowerValue {
    public static void main(String[] args) {
        System.out.println(getKth(12,15,2));
    }
    public static int getKth(int lo, int hi, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = lo; i <= hi ; i++) {
            int temp = calculate(i);
            map.put(i,temp);
            pq.add(temp);
        }
        while (k-->0){
            pq.poll();
        }
        return map.get(pq.poll());
    }
    public static int calculate(int val){
        int step = 0;
        while (val > 1){
            if(val%2==0){
                val /= 2;
            }else{
                val = 3 * val + 1;
            }
            step++;
        }
        return step;
    }
}
