package Problems;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/search-pattern0205/1
public class SearchPatternKMPAlgorithm {
    public static void main(String[] args) {
        System.out.println(search("geeksforgeeks","geek"));
    }
    //This is True But Not Accept bcz That Want KMZ Algorithm
    static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (txt.length() > pat.length()) return ans;

        StringBuilder sb = new StringBuilder(pat.substring(0, txt.length()));
        int i = txt.length(), start = 0;

        while (i <= pat.length()) {
            if (sb.toString().equals(txt)) {
                ans.add(start);
            }
            if (i < pat.length()) {
                sb.deleteCharAt(0);
                sb.append(pat.charAt(i));
            }
            i++;
            start++;
        }
        return ans;
    }
}
