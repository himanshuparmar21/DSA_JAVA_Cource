package Lecture_4_Loop_Condition;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three Number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);
    }
}
