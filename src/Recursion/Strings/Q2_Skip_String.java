package Recursion.Strings;

import java.util.Scanner;

public class Q2_Skip_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.next();

        System.out.println(skipApple(s));
    }
    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }
}
