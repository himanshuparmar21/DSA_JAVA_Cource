package Lecture_8_Linear_Search;

import java.util.Scanner;

public class Q1_Search_In_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = sc.nextLine();
        System.out.print("Enter Search Character:");
        String temp = sc.next();
        char ch = temp.charAt(0);

        System.out.println(searchString(str,ch));
    }

    static boolean searchString(String str,char ch){
        if(str.isEmpty()){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)){
                return true;
            }
        }

//        for(char c : str.toCharArray()){
//            if(c == ch){
//                return true;
//            }
//        }

        return false;
    }
}
