package Sliding_Window;

import java.util.HashMap;
// https://leetcode.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println();
    }
    public static int BruteForce(String s,int k){
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] temp = new int[26];
            int max = 0;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                temp[ch - 'a']++;
                max = Math.max(max,temp[ch - 'a']);
                int change = (j-i+1) + max;
                if(change <= k){
                    ans = Math.max(ans,(i-j+1));
                }else{
                    break;
                }
            }
        }
        return ans;
    }
    public static int SlidingWindow(String s,int k){
        int ans = 0;
        int start = 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max = Math.max(max,map.get(ch));
            int change = (i-start+1) - max;
            while (change > k){
                ch = s.charAt(start);
                map.put(ch,map.getOrDefault(ch,0)-1);
                for (char key : map.keySet()){
                    max = Math.max(max,map.get(key));
                }
                change = (i-start+1) - max;
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }
            ans = Math.max(ans, (i - start + 1));
        }
        return ans;
    }
    public static int SlidingWindowWithRemoveForLoop(String s,int k){
        int ans = 0;
        int start = 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max = Math.max(max,map.get(ch));
            int change = (i-start+1) - max;
            if (change > k){
                ch = s.charAt(start);
                map.put(ch,map.getOrDefault(ch,0)-1);
                start++;
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }
            if(change <= k){
                ans = Math.max(ans, (i - start + 1));
            }
        }
        return ans;
    }
}
