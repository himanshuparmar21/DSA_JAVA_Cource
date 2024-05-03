package Lecture_12_String_StringBuilder;

import java.util.Scanner;

public class Palindrom_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        int start = 0;
        int end = str.length() - 1;
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
