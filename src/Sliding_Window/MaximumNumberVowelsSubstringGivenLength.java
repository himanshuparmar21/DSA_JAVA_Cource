package Sliding_Window;
// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
public class MaximumNumberVowelsSubstringGivenLength {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef",3));
    }
    public static int maxVowels(String s, int k) {
        int ans = 0;
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
            if(i>=k){
                ch = s.charAt(start++);
                if(isVowel(ch)){
                    count--;
                }
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
