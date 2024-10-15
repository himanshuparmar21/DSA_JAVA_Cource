package Problems;
 // https://leetcode.com/problems/separate-black-and-white-balls/description/
public class SeparateBlackandWhiteBalls {
    public static void main(String[] args) {
        System.out.println(minimumSteps("111111111111111111111111111111111111111110011"));
    }
    public static long minimumSteps(String s) {
        long swap = 0;
        int black = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                swap += (long) black;
            else
                black++;
        }
        return swap;
    }
}
