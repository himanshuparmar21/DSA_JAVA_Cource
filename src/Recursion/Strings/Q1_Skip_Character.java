package Recursion.Strings;

import java.util.Scanner;

public class Q1_Skip_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.next();

        skip("",s);

        System.out.println(skip1(s));
    }
    static void skip(String ans,String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        if(str.charAt(0) == 'a'){
            skip(ans,str.substring(1));
        }else{
            skip(ans+str.charAt(0),str.substring(1));
        }
    }

    static String skip1(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.charAt(0) == 'a'){
            return skip1(str.substring(1));
        }else{
            return str.charAt(0) + skip1(str.substring(1));
        }
    }
}
