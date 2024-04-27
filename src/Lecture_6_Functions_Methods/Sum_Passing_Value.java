package Lecture_6_Functions_Methods;

import java.util.Scanner;

public class Sum_Passing_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter 1st Number:");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        num2 = sc.nextInt();
        int ans = sum(num1,num2);
        System.out.println(ans);
        System.out.println(sum(10,20));
    }

    static int sum(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
}
