package Sliding_Window;

import java.util.HashMap;

// https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/
public class LongestSubstringWithAtMost2DistinctCharacters {
    public static void main(String[] args) {
        String s = "eceba";
        System.out.println(SlidingWindow(s,2));
    }
    public static int SlidingWindow(String s,int k){
        int start = 0;
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while (map.size() > k){
                char c = s.charAt(start++);
                map.put(c,map.getOrDefault(c,0)-1);
                if(map.get(c) == 0){
                    map.remove(c);
                }
            }
            ans = Math.max(ans,(i-start+1));
        }
        return ans;
    }
}
