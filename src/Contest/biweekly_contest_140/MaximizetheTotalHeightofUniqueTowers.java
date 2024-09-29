package Contest.biweekly_contest_140;

import java.util.HashSet;
import java.util.Set;

public class MaximizetheTotalHeightofUniqueTowers {
    public static void main(String[] args) {
        System.out.println(maximumTotalSum(new int[]{2,2,1}));
    }
    public static long maximumTotalSum(int[] num) {
        Set<Integer> set = new HashSet<>();
        long sum = 0;

        for (int i = 0; i < num.length; i++) {
            if(set.contains(num[i])){
                int temp = num[i];
                while (temp > 0){
                    if(!set.contains(temp)) {
                        num[i] = temp;
                        sum += temp;
                    }
                    temp--;
                }
                if(temp==0) return -1;
            }else{
                sum += num[i];
            }
            set.add(num[i]);
        }
        for (int n : num){
            System.out.println(n);
        }
        return sum;
    }
}
