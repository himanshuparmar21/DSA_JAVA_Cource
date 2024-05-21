package Recursion.Strings;

import java.util.Scanner;

public class Q3_SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.next();

        SubSeq("",s);
    }
    static void SubSeq(String ans,String s){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }

        SubSeq(ans+s.charAt(0),s.substring(1));
        SubSeq(ans,s.substring(1));
    }
}
