package Problems;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public static void main(String[] args) {
        System.out.println(wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"},new String[]{"e","o"}));
    }
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        // This is Not Work
        List<String> list = new ArrayList<>();

        for (String s : words1){
            int count = 0;
            for(String ch : words2){
                if(s.contains(ch)){
                    count++;
                }
            }
            if(count == words2.length){
                list.add(s);
            }
        }
        return list;
    }
}
