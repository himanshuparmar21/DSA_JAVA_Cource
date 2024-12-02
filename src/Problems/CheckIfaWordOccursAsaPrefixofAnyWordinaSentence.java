package Problems;

import java.util.Arrays;

// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence {
    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger","burg"));
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] str = sentence.split("\\s+");
        for (int i = 0; i < str.length; i++) {
            if(str[i].startsWith(searchWord)) return i+1;
        }
        return -1;
    }
}
