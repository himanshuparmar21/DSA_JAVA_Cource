package Recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class LatterCombinationModified {
    static HashMap<Character,String> map = new HashMap<>();
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        System.out.println(map);
        CreateList("","23");
        System.out.println(list);
    }
    static void CreateList(String p,String up){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i < map.get(ch).length(); i++) {
            CreateList(p + map.get(ch).charAt(i),up.substring(1));
        }
    }
}
