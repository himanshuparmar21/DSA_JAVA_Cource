package Sliding_Window;
// https://leetcode.com/problems/find-all-anagrams-in-a-string/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsString {
    public static void main(String[] args) {

    }
    public static List<Integer> findAnagrams(String s, String p) {
        int start = 0;
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (char ch : p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (int i = 0; i < s.length(); i++) {

        }
        return list;
    }
}
