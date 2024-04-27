package Lecture_6_Functions_Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,sum ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("The Sum:" + sum);

        System.out.print("Enter 1st Number:");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("The Sum:" + sum);

        System.out.print("Enter 1st Number:");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("The Sum:" + sum);
    }
}

//Problem:Write a Program To Print Sum of Two Number


//if Repeat This Problem Many Times And Print Sum
//To Solve This Above Problem We Write Code Many Times This is Not Proper Solution Because We repeat Same Code as Many Times
//So Proper Solution is Write Method/Function