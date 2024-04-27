package Lecture_4_Loop_Condition;

import java.util.Scanner;

public class Character_Upper_Lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        char c = ch.charAt(0);
        // c = sc.next().trim().charAt(0)
        if(c >='a' && 'z'>=c){
            System.out.println(c + " Lower");
        } else {
            System.out.println(c + " Upper");
        }
    }
}
