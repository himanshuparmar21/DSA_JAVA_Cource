package Lecture_5_Switch_Case;

import java.util.Scanner;

public class Compare_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.next()
        String str1 = "Hello";
        String str2 = "Hello";
        String s = new String("Hi");
        String st = new String("Hi");
        System.out.println(str2 == str1); //true (== Check Both Variable Are Pointing To Same String Or not) (Check Reference and String)
        System.out.println(s == st); // False (Because Both Variable Not Pointing To Same String)
        System.out.println(s.equals(st)); // true (Because This Only Check Value of String)
    }
}
