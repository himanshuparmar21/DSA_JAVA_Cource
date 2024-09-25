package Sliding_Window;

import java.util.HashMap;

// https://leetcode.com/problems/fruit-into-baskets/
public class FruitsIntoBaskets {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,2,2};
        System.out.println(SlidingWindow(arr));
    }
    public static int SlidingWindow(int[] arr){
        int start = 0;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            map.put(temp,map.getOrDefault(temp,0)+1);

            while (map.size() > 2){
                temp = arr[start];
                map.put(temp,map.getOrDefault(temp,0)-1);
                if(map.get(temp) == 0){
                    map.remove(temp);
                }
                start++;
            }
            ans = Math.max(ans,(i-start+1));
        }
        return ans;
    }
}
