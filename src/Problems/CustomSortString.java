package Problems;

import java.util.HashMap;
// https://leetcode.com/problems/custom-sort-string/description/
public class CustomSortString {
    public static void main(String[] args) {
        System.out.println(customSortString("hucw","utzoampdgkalexslxoqfkdjoczajxtuhqyxvlfatmptqdsochtdzgypsfkgqwbgqbcamdqnqztaqhqanirikahtmalzqjjxtqfnh"));
    }
    public static String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        System.out.println(map);
        StringBuilder sb = new StringBuilder();
        for(char ch : order.toCharArray()){
            int val = map.getOrDefault(ch, 0);
            while (val -- > 0){
                sb.append(ch);
            }
            map.remove(ch);
        }
        System.out.println(map);
        for(char ch : map.keySet()){
            int val = map.getOrDefault(ch, 0);
            while (val -- > 0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
