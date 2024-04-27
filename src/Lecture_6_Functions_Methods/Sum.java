package Lecture_6_Functions_Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        System.out.println(sumWithReturn());
    }
    static void sum(){
        int num1,num2,sum ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("The Sum:" + sum);
    }
    
    static int sumWithReturn(){
        int num1,num2,sum ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        return sum;

//        System.out.println("Hello");
//        This Print Never Execute
    }
}

//Function Syntax
/*
    access_modifier return_type function_name(parameters){
        //Statement(Body of Code)
        return Statement;
    }
 */

//To Calling Function: function_name()