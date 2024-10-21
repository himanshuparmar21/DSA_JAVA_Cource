package Problems;

import java.util.HashSet;
// https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/description/
public class SplitaStringIntotheMaxNumberofUniqueSubstrings {
    public static int count = 0;
    public static void main(String[] args) {
        System.out.println(maxUniqueSplit("ababccc"));
    }
    public static int maxUniqueSplit(String s) {
        return brack(0,s,new HashSet<>());
    }
    public static int brack(int start, String s, HashSet<String> set){
        count+=1;
        if (start == s.length()) {
            return 0;
        }

        int ans = 0;
        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (!set.contains(substring)) {
                set.add(substring);
                ans = Math.max(ans, 1 + brack(end, s, set));
                set.remove(substring);
            }
        }
        return ans;
    }
}
