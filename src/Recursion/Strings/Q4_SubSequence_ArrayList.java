package Recursion.Strings;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Q4_SubSequence_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.next();

        System.out.println(subSeq("",s));
    }
    static ArrayList<String> subSeq(String ans,String s){
        if(s.isEmpty()){
            ArrayList<String> ls = new ArrayList<>();
            ls.add(ans);
            return ls;
        }

        ArrayList<String> left = subSeq(ans+s.charAt(0),s.substring(1));
        ArrayList<String> right = subSeq(ans,s.substring(1));

        left.addAll(right);
        return left;
    }
}
